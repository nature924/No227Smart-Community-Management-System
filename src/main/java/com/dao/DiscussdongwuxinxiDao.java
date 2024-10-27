package com.dao;

import com.entity.DiscussdongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdongwuxinxiVO;
import com.entity.view.DiscussdongwuxinxiView;


/**
 * 动物信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface DiscussdongwuxinxiDao extends BaseMapper<DiscussdongwuxinxiEntity> {
	
	List<DiscussdongwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
	
	DiscussdongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
	
	List<DiscussdongwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);

	List<DiscussdongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
	
	DiscussdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
	

}
