package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyerenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyerenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyerenyuanView;


/**
 * 物业人员
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
public interface WuyerenyuanService extends IService<WuyerenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyerenyuanVO> selectListVO(Wrapper<WuyerenyuanEntity> wrapper);
   	
   	WuyerenyuanVO selectVO(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
   	
   	List<WuyerenyuanView> selectListView(Wrapper<WuyerenyuanEntity> wrapper);
   	
   	WuyerenyuanView selectView(@Param("ew") Wrapper<WuyerenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyerenyuanEntity> wrapper);
   	

}

