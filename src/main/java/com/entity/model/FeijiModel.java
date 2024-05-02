package com.entity.model;

import com.entity.FeijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 航班
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class FeijiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 航班号
     */
    private String feijiName;


    /**
     * 飞机
     */
    private Integer feijiTypes;


    /**
     * 飞机类型
     */
    private Integer feijiLeixingTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：航班号
	 */
    public String getFeijiName() {
        return feijiName;
    }


    /**
	 * 设置：航班号
	 */
    public void setFeijiName(String feijiName) {
        this.feijiName = feijiName;
    }
    /**
	 * 获取：飞机
	 */
    public Integer getFeijiTypes() {
        return feijiTypes;
    }


    /**
	 * 设置：飞机
	 */
    public void setFeijiTypes(Integer feijiTypes) {
        this.feijiTypes = feijiTypes;
    }
    /**
	 * 获取：飞机类型
	 */
    public Integer getFeijiLeixingTypes() {
        return feijiLeixingTypes;
    }


    /**
	 * 设置：飞机类型
	 */
    public void setFeijiLeixingTypes(Integer feijiLeixingTypes) {
        this.feijiLeixingTypes = feijiLeixingTypes;
    }
    /**
	 * 获取：起飞时间
	 */
    public String getFeijiStartTime() {
        return feijiStartTime;
    }


    /**
	 * 设置：起飞时间
	 */
    public void setFeijiStartTime(String feijiStartTime) {
        this.feijiStartTime = feijiStartTime;
    }
    /**
	 * 获取：始发站
	 */
    public String getFeijiStartAddress() {
        return feijiStartAddress;
    }


    /**
	 * 设置：始发站
	 */
    public void setFeijiStartAddress(String feijiStartAddress) {
        this.feijiStartAddress = feijiStartAddress;
    }
    /**
	 * 获取：目的地
	 */
    public String getFeijiEndAddress() {
        return feijiEndAddress;
    }


    /**
	 * 设置：目的地
	 */
    public void setFeijiEndAddress(String feijiEndAddress) {
        this.feijiEndAddress = feijiEndAddress;
    }
    /**
	 * 获取：票价
	 */
    public Double getFeijiNewMoney() {
        return feijiNewMoney;
    }


    /**
	 * 设置：票价
	 */
    public void setFeijiNewMoney(Double feijiNewMoney) {
        this.feijiNewMoney = feijiNewMoney;
    }
    /**
	 * 获取：飞机图
	 */
    public String getFeijiPhoto() {
        return feijiPhoto;
    }


    /**
	 * 设置：飞机图
	 */
    public void setFeijiPhoto(String feijiPhoto) {
        this.feijiPhoto = feijiPhoto;
    }
    /**
	 * 获取：飞机详情
	 */
    public String getFeijiContent() {
        return feijiContent;
    }


    /**
	 * 设置：飞机详情
	 */
    public void setFeijiContent(String feijiContent) {
        this.feijiContent = feijiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
