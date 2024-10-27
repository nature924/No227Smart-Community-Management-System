package com.dao;

import com.entity.DongwuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongwuzhongleiVO;
import com.entity.view.DongwuzhongleiView;


/**
 * 动物种类
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface DongwuzhongleiDao extends BaseMapper<DongwuzhongleiEntity> {
	
	List<DongwuzhongleiVO> selectListVO(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
	
	DongwuzhongleiVO selectVO(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
	
	List<DongwuzhongleiView> selectListView(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);

	List<DongwuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
	
	DongwuzhongleiView selectView(@Param("ew") Wrapper<DongwuzhongleiEntity> wrapper);
	

}
