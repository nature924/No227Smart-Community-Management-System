package com.dao;

import com.entity.WuyerenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyerenyuanVO;
import com.entity.view.WuyerenyuanView;


/**
 * 物业人员
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface WuyerenyuanDao extends BaseMapper<WuyerenyuanEntity> {
	
	List<WuyerenyuanVO> selectListVO(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
	
	WuyerenyuanVO selectVO(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
	
	List<WuyerenyuanView> selectListView(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);

	List<WuyerenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
	
	WuyerenyuanView selectView(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
	

}
