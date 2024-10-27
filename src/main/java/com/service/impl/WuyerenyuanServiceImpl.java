package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WuyerenyuanDao;
import com.entity.WuyerenyuanEntity;
import com.service.WuyerenyuanService;
import com.entity.vo.WuyerenyuanVO;
import com.entity.view.WuyerenyuanView;

@Service("wuyerenyuanService")
public class WuyerenyuanServiceImpl extends ServiceImpl<WuyerenyuanDao, WuyerenyuanEntity> implements WuyerenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyerenyuanEntity> page = this.selectPage(
                new Query<WuyerenyuanEntity>(params).getPage(),
                new EntityWrapper<WuyerenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyerenyuanEntity> wrapper) {
		  Page<WuyerenyuanView> page =new Query<WuyerenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyerenyuanVO> selectListVO(Wrapper<WuyerenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyerenyuanVO selectVO(Wrapper<WuyerenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyerenyuanView> selectListView(Wrapper<WuyerenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyerenyuanView selectView(Wrapper<WuyerenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
