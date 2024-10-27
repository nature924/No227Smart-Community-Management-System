package com.entity.view;

import com.entity.DongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 动物信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
@TableName("dongwuxinxi")
public class DongwuxinxiView  extends DongwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongwuxinxiView(){
	}
 
 	public DongwuxinxiView(DongwuxinxiEntity dongwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dongwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
