package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongwuxinxiView;


/**
 * 动物信息评论表
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface DiscussdongwuxinxiService extends IService<DiscussdongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongwuxinxiVO> selectListVO(Wrapper<DiscussdongwuxinxiEntity> wrapper);
   	
   	DiscussdongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
   	
   	List<DiscussdongwuxinxiView> selectListView(Wrapper<DiscussdongwuxinxiEntity> wrapper);
   	
   	DiscussdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussdongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongwuxinxiEntity> wrapper);
   	

}

