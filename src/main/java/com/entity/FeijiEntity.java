package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 航班
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("feiji")
public class FeijiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FeijiEntity() {

	}

	public FeijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 航班号
     */
    @TableField(value = "feiji_name")

    private String feijiName;


    /**
     * 飞机
     */
    @TableField(value = "feiji_types")

    private Integer feijiTypes;


    /**
     * 飞机类型
     */
    @TableField(value = "feiji_leixing_types")

    private Integer feijiLeixingTypes;


    /**
     * 起飞时间
     */
    @TableField(value = "feiji_start_time")

    private String feijiStartTime;


    /**
     * 始发站
     */
    @TableField(value = "feiji_start_address")

    private String feijiStartAddress;


    /**
     * 目的地
     */
    @TableField(value = "feiji_end_address")

    private String feijiEndAddress;


    /**
     * 票价
     */
    @TableField(value = "feiji_new_money")

    private Double feijiNewMoney;


    /**
     * 飞机图
     */
    @TableField(value = "feiji_photo")

    private String feijiPhoto;


    /**
     * 飞机详情
     */
    @TableField(value = "feiji_content")

    private String feijiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：航班号
	 */
    public String getFeijiName() {
        return feijiName;
    }


    /**
	 * 获取：航班号
	 */

    public void setFeijiName(String feijiName) {
        this.feijiName = feijiName;
    }
    /**
	 * 设置：飞机
	 */
    public Integer getFeijiTypes() {
        return feijiTypes;
    }


    /**
	 * 获取：飞机
	 */

    public void setFeijiTypes(Integer feijiTypes) {
        this.feijiTypes = feijiTypes;
    }
    /**
	 * 设置：飞机类型
	 */
    public Integer getFeijiLeixingTypes() {
        return feijiLeixingTypes;
    }


    /**
	 * 获取：飞机类型
	 */

    public void setFeijiLeixingTypes(Integer feijiLeixingTypes) {
        this.feijiLeixingTypes = feijiLeixingTypes;
    }
    /**
	 * 设置：起飞时间
	 */
    public String getFeijiStartTime() {
        return feijiStartTime;
    }


    /**
	 * 获取：起飞时间
	 */

    public void setFeijiStartTime(String feijiStartTime) {
        this.feijiStartTime = feijiStartTime;
    }
    /**
	 * 设置：始发站
	 */
    public String getFeijiStartAddress() {
        return feijiStartAddress;
    }


    /**
	 * 获取：始发站
	 */

    public void setFeijiStartAddress(String feijiStartAddress) {
        this.feijiStartAddress = feijiStartAddress;
    }
    /**
	 * 设置：目的地
	 */
    public String getFeijiEndAddress() {
        return feijiEndAddress;
    }


    /**
	 * 获取：目的地
	 */

    public void setFeijiEndAddress(String feijiEndAddress) {
        this.feijiEndAddress = feijiEndAddress;
    }
    /**
	 * 设置：票价
	 */
    public Double getFeijiNewMoney() {
        return feijiNewMoney;
    }


    /**
	 * 获取：票价
	 */

    public void setFeijiNewMoney(Double feijiNewMoney) {
        this.feijiNewMoney = feijiNewMoney;
    }
    /**
	 * 设置：飞机图
	 */
    public String getFeijiPhoto() {
        return feijiPhoto;
    }


    /**
	 * 获取：飞机图
	 */

    public void setFeijiPhoto(String feijiPhoto) {
        this.feijiPhoto = feijiPhoto;
    }
    /**
	 * 设置：飞机详情
	 */
    public String getFeijiContent() {
        return feijiContent;
    }


    /**
	 * 获取：飞机详情
	 */

    public void setFeijiContent(String feijiContent) {
        this.feijiContent = feijiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Feiji{" +
            "id=" + id +
            ", feijiName=" + feijiName +
            ", feijiTypes=" + feijiTypes +
            ", feijiLeixingTypes=" + feijiLeixingTypes +
            ", feijiStartTime=" + feijiStartTime +
            ", feijiStartAddress=" + feijiStartAddress +
            ", feijiEndAddress=" + feijiEndAddress +
            ", feijiNewMoney=" + feijiNewMoney +
            ", feijiPhoto=" + feijiPhoto +
            ", feijiContent=" + feijiContent +
            ", createTime=" + createTime +
        "}";
    }
}
