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


import com.dao.ChaoshishangpinDao;
import com.entity.ChaoshishangpinEntity;
import com.service.ChaoshishangpinService;
import com.entity.vo.ChaoshishangpinVO;
import com.entity.view.ChaoshishangpinView;

@Service("chaoshishangpinService")
public class ChaoshishangpinServiceImpl extends ServiceImpl<ChaoshishangpinDao, ChaoshishangpinEntity> implements ChaoshishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChaoshishangpinEntity> page = this.selectPage(
                new Query<ChaoshishangpinEntity>(params).getPage(),
                new EntityWrapper<ChaoshishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChaoshishangpinEntity> wrapper) {
		  Page<ChaoshishangpinView> page =new Query<ChaoshishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChaoshishangpinVO> selectListVO(Wrapper<ChaoshishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChaoshishangpinVO selectVO(Wrapper<ChaoshishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChaoshishangpinView> selectListView(Wrapper<ChaoshishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChaoshishangpinView selectView(Wrapper<ChaoshishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
