package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianminfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianminfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianminfuwuView;


/**
 * 便民服务
 *
 * @author 
 * @email 
 * @date 2023-03-28 00:27:22
 */
public interface BianminfuwuService extends IService<BianminfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianminfuwuVO> selectListVO(Wrapper<BianminfuwuEntity> wrapper);
   	
   	BianminfuwuVO selectVO(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
   	
   	List<BianminfuwuView> selectListView(Wrapper<BianminfuwuEntity> wrapper);
   	
   	BianminfuwuView selectView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianminfuwuEntity> wrapper);
   	

}

