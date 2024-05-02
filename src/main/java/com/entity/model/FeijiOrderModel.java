package com.entity.model;

import com.entity.FeijiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 飞机订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class FeijiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 飞机
     */
    private Integer feijiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 订票日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date feijiOrderTime;


    /**
     * 订单类型
     */
    private Integer feijiOrderTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：飞机
	 */
    public Integer getFeijiId() {
        return feijiId;
    }


    /**
	 * 设置：飞机
	 */
    public void setFeijiId(Integer feijiId) {
        this.feijiId = feijiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：订票日期
	 */
    public Date getFeijiOrderTime() {
        return feijiOrderTime;
    }


    /**
	 * 设置：订票日期
	 */
    public void setFeijiOrderTime(Date feijiOrderTime) {
        this.feijiOrderTime = feijiOrderTime;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getFeijiOrderTypes() {
        return feijiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setFeijiOrderTypes(Integer feijiOrderTypes) {
        this.feijiOrderTypes = feijiOrderTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
