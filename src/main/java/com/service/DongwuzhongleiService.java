package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongwuzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongwuzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongwuzhongleiView;


/**
 * 动物种类
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface DongwuzhongleiService extends IService<DongwuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongwuzhongleiVO> selectListVO(Wrapper<DongwuzhongleiEntity> wrapper);
   	
   	DongwuzhongleiVO selectVO(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
   	
   	List<DongwuzhongleiView> selectListView(Wrapper<DongwuzhongleiEntity> wrapper);
   	
   	DongwuzhongleiView selectView(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongwuzhongleiEntity> wrapper);
   	

}

