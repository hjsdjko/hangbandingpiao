package com.entity.vo;

import com.entity.FeijiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 航班
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("feiji")
public class FeijiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
