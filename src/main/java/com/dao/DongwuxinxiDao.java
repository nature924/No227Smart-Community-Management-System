package com.dao;

import com.entity.DongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongwuxinxiVO;
import com.entity.view.DongwuxinxiView;


/**
 * 动物信息
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface DongwuxinxiDao extends BaseMapper<DongwuxinxiEntity> {
	
	List<DongwuxinxiVO> selectListVO(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
	
	DongwuxinxiVO selectVO(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
	
	List<DongwuxinxiView> selectListView(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);

	List<DongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
	
	DongwuxinxiView selectView(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);



}
