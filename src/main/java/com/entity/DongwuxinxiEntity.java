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
 * 动物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
@TableName("dongwuxinxi")
public class DongwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DongwuxinxiEntity() {
		
	}
	
	public DongwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 动物编号
	 */
					
	private String dongwubianhao;
	
	/**
	 * 动物名称
	 */
					
	private String dongwumingcheng;
	
	/**
	 * 动物种类
	 */
					
	private String dongwuzhonglei;
	
	/**
	 * 动物照片
	 */
					
	private String dongwuzhaopian;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 动物性别
	 */
					
	private String dongwuxingbie;
	
	/**
	 * 动物详情
	 */
					
	private String dongwuxiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：动物编号
	 */
	public void setDongwubianhao(String dongwubianhao) {
		this.dongwubianhao = dongwubianhao;
	}
	/**
	 * 获取：动物编号
	 */
	public String getDongwubianhao() {
		return dongwubianhao;
	}
	/**
	 * 设置：动物名称
	 */
	public void setDongwumingcheng(String dongwumingcheng) {
		this.dongwumingcheng = dongwumingcheng;
	}
	/**
	 * 获取：动物名称
	 */
	public String getDongwumingcheng() {
		return dongwumingcheng;
	}
	/**
	 * 设置：动物种类
	 */
	public void setDongwuzhonglei(String dongwuzhonglei) {
		this.dongwuzhonglei = dongwuzhonglei;
	}
	/**
	 * 获取：动物种类
	 */
	public String getDongwuzhonglei() {
		return dongwuzhonglei;
	}
	/**
	 * 设置：动物照片
	 */
	public void setDongwuzhaopian(String dongwuzhaopian) {
		this.dongwuzhaopian = dongwuzhaopian;
	}
	/**
	 * 获取：动物照片
	 */
	public String getDongwuzhaopian() {
		return dongwuzhaopian;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：动物性别
	 */
	public void setDongwuxingbie(String dongwuxingbie) {
		this.dongwuxingbie = dongwuxingbie;
	}
	/**
	 * 获取：动物性别
	 */
	public String getDongwuxingbie() {
		return dongwuxingbie;
	}
	/**
	 * 设置：动物详情
	 */
	public void setDongwuxiangqing(String dongwuxiangqing) {
		this.dongwuxiangqing = dongwuxiangqing;
	}
	/**
	 * 获取：动物详情
	 */
	public String getDongwuxiangqing() {
		return dongwuxiangqing;
	}

}
