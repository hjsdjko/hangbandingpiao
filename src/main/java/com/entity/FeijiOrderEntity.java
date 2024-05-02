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
 * 飞机订单
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("feiji_order")
public class FeijiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FeijiOrderEntity() {

	}

	public FeijiOrderEntity(T t) {
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
     * 飞机
     */
    @TableField(value = "feiji_id")

    private Integer feijiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 订票日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "feiji_order_time",fill = FieldFill.UPDATE)

    private Date feijiOrderTime;


    /**
     * 订单类型
     */
    @TableField(value = "feiji_order_types")

    private Integer feijiOrderTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：飞机
	 */
    public Integer getFeijiId() {
        return feijiId;
    }


    /**
	 * 获取：飞机
	 */

    public void setFeijiId(Integer feijiId) {
        this.feijiId = feijiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：订票日期
	 */
    public Date getFeijiOrderTime() {
        return feijiOrderTime;
    }


    /**
	 * 获取：订票日期
	 */

    public void setFeijiOrderTime(Date feijiOrderTime) {
        this.feijiOrderTime = feijiOrderTime;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getFeijiOrderTypes() {
        return feijiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setFeijiOrderTypes(Integer feijiOrderTypes) {
        this.feijiOrderTypes = feijiOrderTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "FeijiOrder{" +
            "id=" + id +
            ", feijiId=" + feijiId +
            ", yonghuId=" + yonghuId +
            ", feijiOrderTime=" + feijiOrderTime +
            ", feijiOrderTypes=" + feijiOrderTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
