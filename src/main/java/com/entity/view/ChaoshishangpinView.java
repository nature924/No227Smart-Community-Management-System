package com.entity.view;

import com.entity.ChaoshishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 超市商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
@TableName("chaoshishangpin")
public class ChaoshishangpinView  extends ChaoshishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChaoshishangpinView(){
	}
 
 	public ChaoshishangpinView(ChaoshishangpinEntity chaoshishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, chaoshishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
