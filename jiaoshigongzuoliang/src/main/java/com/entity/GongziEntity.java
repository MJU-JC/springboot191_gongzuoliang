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
 * 工资
 *
 * @author 
 * @email
 */
@TableName("gongzi")
public class GongziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongziEntity() {

	}

	public GongziEntity(T t) {
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
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 工资姓名
     */
    @TableField(value = "gongzi_name")

    private String gongziName;


    /**
     * 月份
     */
    @TableField(value = "gongzi_month")

    private String gongziMonth;


    /**
     * 底薪
     */
    @TableField(value = "dixin_money")

    private Double dixinMoney;


    /**
     * 奖金
     */
    @TableField(value = "jiangjin_money")

    private Double jiangjinMoney;


    /**
     * 其他
     */
    @TableField(value = "qita_money")

    private Double qitaMoney;


    /**
     * 五险一金
     */
    @TableField(value = "wuxianyijin_money")

    private Double wuxianyijinMoney;


    /**
     * 实发
     */
    @TableField(value = "shifa_money")

    private Double shifaMoney;


    /**
     * 备注
     */
    @TableField(value = "beizhu_content")

    private String beizhuContent;


    /**
     * 添加时间
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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：工资姓名
	 */
    public String getGongziName() {
        return gongziName;
    }


    /**
	 * 获取：工资姓名
	 */

    public void setGongziName(String gongziName) {
        this.gongziName = gongziName;
    }
    /**
	 * 设置：月份
	 */
    public String getGongziMonth() {
        return gongziMonth;
    }


    /**
	 * 获取：月份
	 */

    public void setGongziMonth(String gongziMonth) {
        this.gongziMonth = gongziMonth;
    }
    /**
	 * 设置：底薪
	 */
    public Double getDixinMoney() {
        return dixinMoney;
    }


    /**
	 * 获取：底薪
	 */

    public void setDixinMoney(Double dixinMoney) {
        this.dixinMoney = dixinMoney;
    }
    /**
	 * 设置：奖金
	 */
    public Double getJiangjinMoney() {
        return jiangjinMoney;
    }


    /**
	 * 获取：奖金
	 */

    public void setJiangjinMoney(Double jiangjinMoney) {
        this.jiangjinMoney = jiangjinMoney;
    }
    /**
	 * 设置：其他
	 */
    public Double getQitaMoney() {
        return qitaMoney;
    }


    /**
	 * 获取：其他
	 */

    public void setQitaMoney(Double qitaMoney) {
        this.qitaMoney = qitaMoney;
    }
    /**
	 * 设置：五险一金
	 */
    public Double getWuxianyijinMoney() {
        return wuxianyijinMoney;
    }


    /**
	 * 获取：五险一金
	 */

    public void setWuxianyijinMoney(Double wuxianyijinMoney) {
        this.wuxianyijinMoney = wuxianyijinMoney;
    }
    /**
	 * 设置：实发
	 */
    public Double getShifaMoney() {
        return shifaMoney;
    }


    /**
	 * 获取：实发
	 */

    public void setShifaMoney(Double shifaMoney) {
        this.shifaMoney = shifaMoney;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Gongzi{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", gongziName=" + gongziName +
            ", gongziMonth=" + gongziMonth +
            ", dixinMoney=" + dixinMoney +
            ", jiangjinMoney=" + jiangjinMoney +
            ", qitaMoney=" + qitaMoney +
            ", wuxianyijinMoney=" + wuxianyijinMoney +
            ", shifaMoney=" + shifaMoney +
            ", beizhuContent=" + beizhuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
