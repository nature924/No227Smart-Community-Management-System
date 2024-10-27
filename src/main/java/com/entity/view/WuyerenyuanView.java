package com.entity.view;

import com.entity.WuyerenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
@TableName("wuyerenyuan")
public class WuyerenyuanView  extends WuyerenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyerenyuanView(){
	}
 
 	public WuyerenyuanView(WuyerenyuanEntity wuyerenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, wuyerenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
