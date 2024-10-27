package com.entity.view;

import com.entity.DongwuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 动物种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
@TableName("dongwuzhonglei")
public class DongwuzhongleiView  extends DongwuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongwuzhongleiView(){
	}
 
 	public DongwuzhongleiView(DongwuzhongleiEntity dongwuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, dongwuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
