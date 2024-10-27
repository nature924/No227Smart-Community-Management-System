package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongwuxinxiView;


/**
 * 动物信息
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface DongwuxinxiService extends IService<DongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongwuxinxiVO> selectListVO(Wrapper<DongwuxinxiEntity> wrapper);
   	
   	DongwuxinxiVO selectVO(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
   	
   	List<DongwuxinxiView> selectListView(Wrapper<DongwuxinxiEntity> wrapper);
   	
   	DongwuxinxiView selectView(@Param("ew") Wrapper<DongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongwuxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DongwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DongwuxinxiEntity> wrapper);



}

