package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeijiLiuyanEntity;
import java.util.Map;

/**
 * 飞机留言 服务类
 * @author 
 * @since 2021-04-19
 */
public interface FeijiLiuyanService extends IService<FeijiLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}