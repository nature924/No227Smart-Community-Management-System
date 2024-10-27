package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweixinxiView;


/**
 * 车位信息
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface CheweixinxiService extends IService<CheweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweixinxiVO> selectListVO(Wrapper<CheweixinxiEntity> wrapper);
   	
   	CheweixinxiVO selectVO(@Param("ew") Wrapper<CheweixinxiEntity> wrapper);
   	
   	List<CheweixinxiView> selectListView(Wrapper<CheweixinxiEntity> wrapper);
   	
   	CheweixinxiView selectView(@Param("ew") Wrapper<CheweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CheweixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CheweixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CheweixinxiEntity> wrapper);



}

