package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.FeijiOrderEntity;

import com.service.FeijiOrderService;
import com.entity.view.FeijiOrderView;
import com.service.FeijiService;
import com.entity.FeijiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 飞机订单
 * 后端接口
 * @author
 * @email
 * @date 2021-04-20
*/
@RestController
@Controller
@RequestMapping("/feijiOrder")
public class FeijiOrderController {
    private static final Logger logger = LoggerFactory.getLogger(FeijiOrderController.class);

    @Autowired
    private FeijiOrderService feijiOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private FeijiService feijiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = feijiOrderService.queryPage(params);

        //字典表数据转换
        List<FeijiOrderView> list =(List<FeijiOrderView>)page.getList();
        for(FeijiOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FeijiOrderEntity feijiOrder = feijiOrderService.selectById(id);
        if(feijiOrder !=null){
            //entity转view
            FeijiOrderView view = new FeijiOrderView();
            BeanUtils.copyProperties( feijiOrder , view );//把实体数据重构到view中

            //级联表
            FeijiEntity feiji = feijiService.selectById(feijiOrder.getFeijiId());
            if(feiji != null){
                BeanUtils.copyProperties( feiji , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setFeijiId(feiji.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(feijiOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody FeijiOrderEntity feijiOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,feijiOrder:{}",this.getClass().getName(),feijiOrder.toString());
        feijiOrder.setInsertTime(new Date());
        feijiOrder.setCreateTime(new Date());
        feijiOrderService.insert(feijiOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FeijiOrderEntity feijiOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,feijiOrder:{}",this.getClass().getName(),feijiOrder.toString());
        feijiOrderService.updateById(feijiOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        feijiOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = feijiOrderService.queryPage(params);

        //字典表数据转换
        List<FeijiOrderView> list =(List<FeijiOrderView>)page.getList();
        for(FeijiOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FeijiOrderEntity feijiOrder = feijiOrderService.selectById(id);
            if(feijiOrder !=null){
                //entity转view
        FeijiOrderView view = new FeijiOrderView();
                BeanUtils.copyProperties( feijiOrder , view );//把实体数据重构到view中

                //级联表
                    FeijiEntity feiji = feijiService.selectById(feijiOrder.getFeijiId());
                if(feiji != null){
                    BeanUtils.copyProperties( feiji , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setFeijiId(feiji.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(feijiOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody FeijiOrderEntity feijiOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,feijiOrder:{}",this.getClass().getName(),feijiOrder.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
        FeijiEntity feijiEntity = feijiService.selectById(feijiOrder.getFeijiId());
            if(feijiEntity == null){
                return R.error(511,"查不到该商品");
            }
            Double feijiNewMoney = feijiEntity.getFeijiNewMoney();
            if(feijiNewMoney == null){
                return R.error(511,"商品价格不能为空");
            }

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null){
                return R.error(511,"用户不能为空");
            }
            if(yonghuEntity.getNewMoney() == null){
                return R.error(511,"用户金额不能为空");
            }
            double balance = yonghuEntity.getNewMoney() - feijiEntity.getFeijiNewMoney();//余额
            if(balance<0){
                return R.error(511,"余额不够支付");
            }
            feijiOrder.setFeijiOrderTypes(2); //设置订单状态为已支付
            feijiOrder.setCreateTime(new Date());
            feijiOrder.setInsertTime(new Date());
            feijiOrderService.insert(feijiOrder);//根据id更新
            yonghuEntity.setNewMoney(balance);
            yonghuService.updateById(yonghuEntity);
            return R.ok();
        }else{
            return R.error(511,"您没有权限支付订单");
        }
    }

    /**
    * 支付
    */
    @RequestMapping("/pay")
    public R pay(@RequestBody FeijiOrderEntity feijiOrder, HttpServletRequest request){
        logger.debug("pay方法:,,Controller:{},,feijiOrder:{}",this.getClass().getName(),feijiOrder);
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            feijiOrder = feijiOrderService.selectById(feijiOrder.getId());
            if(feijiOrder == null){
                 return R.error(511,"查询不到该订单");
            }
            FeijiEntity feijiEntity = feijiService.selectById(feijiOrder.getFeijiId());
            if(feijiEntity == null){
                return R.error(511,"查不到该商品");
            }
            Double feijiNewMoney = feijiEntity.getFeijiNewMoney();
            if(feijiNewMoney == null){
                return R.error(511,"商品价格不能为空");
            }

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null){
                return R.error(511,"用户不能为空");
            }
            if(yonghuEntity.getNewMoney() == null){
                return R.error(511,"用户金额不能为空");
            }
            double balance = yonghuEntity.getNewMoney() - feijiEntity.getFeijiNewMoney();//余额
            if(balance<0){
                return R.error(511,"余额不够支付");
            }

            feijiOrder.setFeijiOrderTypes(2); //设置订单状态为已支付
            feijiOrder.setCreateTime(new Date());
            feijiOrder.setInsertTime(new Date());
            feijiOrderService.updateById(feijiOrder);//根据id更新
            yonghuEntity.setNewMoney(balance);
            yonghuService.updateById(yonghuEntity);
            return R.ok();
        }else{
            return R.error(511,"您没有权限支付订单");
        }

    }
    /**
    * 退款
    */
    @RequestMapping("/refund")
    public R refund( Integer id, HttpServletRequest request){
        logger.debug("refund方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            FeijiOrderEntity feijiOrder = feijiOrderService.selectById(id);
            Integer feijiId = feijiOrder.getFeijiId();
            if(feijiId == null){
                return R.error(511,"查不到该商品");
            }
            FeijiEntity feijiEntity = feijiService.selectById(feijiId);
            if(feijiEntity == null){
                return R.error(511,"查不到该商品");
            }
            Double feijiNewMoney = feijiEntity.getFeijiNewMoney();
            if(feijiNewMoney == null){
                return R.error(511,"商品价格不能为空");
            }

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null){
                return R.error(511,"用户不能为空");
            }
            if(yonghuEntity.getNewMoney() == null){
                return R.error(511,"用户金额不能为空");
            }
            double balance = yonghuEntity.getNewMoney() + feijiEntity.getFeijiNewMoney();//余额

            feijiOrder.setFeijiOrderTypes(3);//设置订单状态为退款
            feijiOrderService.updateById(feijiOrder);//根据id更新
            yonghuEntity.setNewMoney(balance);
            yonghuService.updateById(yonghuEntity);
            return R.ok();
        }else{
            return R.error(511,"您没有权限退款");
        }

    }




}

