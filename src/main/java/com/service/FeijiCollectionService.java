package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeijiCollectionEntity;
import java.util.Map;

/**
 * 飞机收藏 服务类
 * @author 
 * @since 2021-04-19
 */
public interface FeijiCollectionService extends IService<FeijiCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}