package com.dao;

import com.entity.FeijiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FeijiCollectionView;

/**
 * 飞机收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface FeijiCollectionDao extends BaseMapper<FeijiCollectionEntity> {

   List<FeijiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
