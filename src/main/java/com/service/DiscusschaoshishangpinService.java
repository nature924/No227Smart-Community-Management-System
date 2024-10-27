package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschaoshishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschaoshishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschaoshishangpinView;


/**
 * 超市商品评论表
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface DiscusschaoshishangpinService extends IService<DiscusschaoshishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschaoshishangpinVO> selectListVO(Wrapper<DiscusschaoshishangpinEntity> wrapper);
   	
   	DiscusschaoshishangpinVO selectVO(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
   	
   	List<DiscusschaoshishangpinView> selectListView(Wrapper<DiscusschaoshishangpinEntity> wrapper);
   	
   	DiscusschaoshishangpinView selectView(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschaoshishangpinEntity> wrapper);
   	

}

