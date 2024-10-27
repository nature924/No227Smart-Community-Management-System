package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChaoshishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChaoshishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChaoshishangpinView;


/**
 * 超市商品
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface ChaoshishangpinService extends IService<ChaoshishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChaoshishangpinVO> selectListVO(Wrapper<ChaoshishangpinEntity> wrapper);
   	
   	ChaoshishangpinVO selectVO(@Param("ew") Wrapper<ChaoshishangpinEntity> wrapper);
   	
   	List<ChaoshishangpinView> selectListView(Wrapper<ChaoshishangpinEntity> wrapper);
   	
   	ChaoshishangpinView selectView(@Param("ew") Wrapper<ChaoshishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChaoshishangpinEntity> wrapper);
   	

}

