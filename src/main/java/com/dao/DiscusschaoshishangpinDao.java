package com.dao;

import com.entity.DiscusschaoshishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschaoshishangpinVO;
import com.entity.view.DiscusschaoshishangpinView;


/**
 * 超市商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface DiscusschaoshishangpinDao extends BaseMapper<DiscusschaoshishangpinEntity> {
	
	List<DiscusschaoshishangpinVO> selectListVO(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
	
	DiscusschaoshishangpinVO selectVO(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
	
	List<DiscusschaoshishangpinView> selectListView(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);

	List<DiscusschaoshishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
	
	DiscusschaoshishangpinView selectView(@Param("ew") Wrapper<DiscusschaoshishangpinEntity> wrapper);
	

}
