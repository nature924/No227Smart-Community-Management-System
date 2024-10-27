package com.entity.vo;

import com.entity.DongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 动物信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public class DongwuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
