package com.entity.view;

import com.entity.FeijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 航班
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("feiji")
public class FeijiView extends FeijiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 飞机的值
		*/
		private String feijiValue;
		/**
		* 飞机类型的值
		*/
		private String feijiLeixingValue;



	public FeijiView() {

	}

	public FeijiView(FeijiEntity feijiEntity) {
		try {
			BeanUtils.copyProperties(this, feijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 飞机的值
			*/
			public String getFeijiValue() {
				return feijiValue;
			}
			/**
			* 设置： 飞机的值
			*/
			public void setFeijiValue(String feijiValue) {
				this.feijiValue = feijiValue;
			}
			/**
			* 获取： 飞机类型的值
			*/
			public String getFeijiLeixingValue() {
				return feijiLeixingValue;
			}
			/**
			* 设置： 飞机类型的值
			*/
			public void setFeijiLeixingValue(String feijiLeixingValue) {
				this.feijiLeixingValue = feijiLeixingValue;
			}










}
