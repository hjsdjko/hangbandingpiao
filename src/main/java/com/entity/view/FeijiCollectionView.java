package com.entity.view;

import com.entity.FeijiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 飞机收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("feiji_collection")
public class FeijiCollectionView extends FeijiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 feiji
			/**
			* 航班号
			*/
			private String feijiName;
			/**
			* 飞机
			*/
			private Integer feijiTypes;
				/**
				* 飞机的值
				*/
				private String feijiValue;
			/**
			* 飞机类型
			*/
			private Integer feijiLeixingTypes;
				/**
				* 飞机类型的值
				*/
				private String feijiLeixingValue;
			/**
			* 起飞时间
			*/
			private String feijiStartTime;
			/**
			* 始发站
			*/
			private String feijiStartAddress;
			/**
			* 目的地
			*/
			private String feijiEndAddress;
			/**
			* 票价
			*/
			private Double feijiNewMoney;
			/**
			* 飞机图
			*/
			private String feijiPhoto;
			/**
			* 飞机详情
			*/
			private String feijiContent;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 头像
			*/
			private String yonghuPhoto;

	public FeijiCollectionView() {

	}

	public FeijiCollectionView(FeijiCollectionEntity feijiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, feijiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set feiji
					/**
					* 获取： 航班号
					*/
					public String getFeijiName() {
						return feijiName;
					}
					/**
					* 设置： 航班号
					*/
					public void setFeijiName(String feijiName) {
						this.feijiName = feijiName;
					}
					/**
					* 获取： 飞机
					*/
					public Integer getFeijiTypes() {
						return feijiTypes;
					}
					/**
					* 设置： 飞机
					*/
					public void setFeijiTypes(Integer feijiTypes) {
						this.feijiTypes = feijiTypes;
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
					* 获取： 飞机类型
					*/
					public Integer getFeijiLeixingTypes() {
						return feijiLeixingTypes;
					}
					/**
					* 设置： 飞机类型
					*/
					public void setFeijiLeixingTypes(Integer feijiLeixingTypes) {
						this.feijiLeixingTypes = feijiLeixingTypes;
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
					/**
					* 获取： 起飞时间
					*/
					public String getFeijiStartTime() {
						return feijiStartTime;
					}
					/**
					* 设置： 起飞时间
					*/
					public void setFeijiStartTime(String feijiStartTime) {
						this.feijiStartTime = feijiStartTime;
					}
					/**
					* 获取： 始发站
					*/
					public String getFeijiStartAddress() {
						return feijiStartAddress;
					}
					/**
					* 设置： 始发站
					*/
					public void setFeijiStartAddress(String feijiStartAddress) {
						this.feijiStartAddress = feijiStartAddress;
					}
					/**
					* 获取： 目的地
					*/
					public String getFeijiEndAddress() {
						return feijiEndAddress;
					}
					/**
					* 设置： 目的地
					*/
					public void setFeijiEndAddress(String feijiEndAddress) {
						this.feijiEndAddress = feijiEndAddress;
					}
					/**
					* 获取： 票价
					*/
					public Double getFeijiNewMoney() {
						return feijiNewMoney;
					}
					/**
					* 设置： 票价
					*/
					public void setFeijiNewMoney(Double feijiNewMoney) {
						this.feijiNewMoney = feijiNewMoney;
					}
					/**
					* 获取： 飞机图
					*/
					public String getFeijiPhoto() {
						return feijiPhoto;
					}
					/**
					* 设置： 飞机图
					*/
					public void setFeijiPhoto(String feijiPhoto) {
						this.feijiPhoto = feijiPhoto;
					}
					/**
					* 获取： 飞机详情
					*/
					public String getFeijiContent() {
						return feijiContent;
					}
					/**
					* 设置： 飞机详情
					*/
					public void setFeijiContent(String feijiContent) {
						this.feijiContent = feijiContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
