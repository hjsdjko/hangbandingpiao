package com.dao;

import com.entity.FeijiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FeijiLiuyanView;

/**
 * 飞机留言 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface FeijiLiuyanDao extends BaseMapper<FeijiLiuyanEntity> {

   List<FeijiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
