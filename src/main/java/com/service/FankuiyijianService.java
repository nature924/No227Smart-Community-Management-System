package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FankuiyijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FankuiyijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FankuiyijianView;


/**
 * 反馈意见
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface FankuiyijianService extends IService<FankuiyijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuiyijianVO> selectListVO(Wrapper<FankuiyijianEntity> wrapper);
   	
   	FankuiyijianVO selectVO(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
   	
   	List<FankuiyijianView> selectListView(Wrapper<FankuiyijianEntity> wrapper);
   	
   	FankuiyijianView selectView(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuiyijianEntity> wrapper);
   	

}

