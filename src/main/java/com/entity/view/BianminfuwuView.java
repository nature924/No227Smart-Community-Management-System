package com.entity.view;

import com.entity.BianminfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 便民服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
@TableName("bianminfuwu")
public class BianminfuwuView  extends BianminfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BianminfuwuView(){
	}
 
 	public BianminfuwuView(BianminfuwuEntity bianminfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, bianminfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
