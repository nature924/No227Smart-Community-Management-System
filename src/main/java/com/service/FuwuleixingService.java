package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuleixingView;


/**
 * 服务类型
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface FuwuleixingService extends IService<FuwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuleixingVO> selectListVO(Wrapper<FuwuleixingEntity> wrapper);
   	
   	FuwuleixingVO selectVO(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
   	
   	List<FuwuleixingView> selectListView(Wrapper<FuwuleixingEntity> wrapper);
   	
   	FuwuleixingView selectView(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuleixingEntity> wrapper);
   	

}

