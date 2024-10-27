package com.dao;

import com.entity.FankuiyijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FankuiyijianVO;
import com.entity.view.FankuiyijianView;


/**
 * 反馈意见
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface FankuiyijianDao extends BaseMapper<FankuiyijianEntity> {
	
	List<FankuiyijianVO> selectListVO(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
	
	FankuiyijianVO selectVO(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
	
	List<FankuiyijianView> selectListView(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);

	List<FankuiyijianView> selectListView(Pagination page,@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
	
	FankuiyijianView selectView(@Param("ew") Wrapper<FankuiyijianEntity> wrapper);
	

}
