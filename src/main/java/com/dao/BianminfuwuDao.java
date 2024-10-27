package com.dao;

import com.entity.BianminfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianminfuwuVO;
import com.entity.view.BianminfuwuView;


/**
 * 便民服务
 * 
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface BianminfuwuDao extends BaseMapper<BianminfuwuEntity> {
	
	List<BianminfuwuVO> selectListVO(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	
	BianminfuwuVO selectVO(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	
	List<BianminfuwuView> selectListView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);

	List<BianminfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	
	BianminfuwuView selectView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	

}
