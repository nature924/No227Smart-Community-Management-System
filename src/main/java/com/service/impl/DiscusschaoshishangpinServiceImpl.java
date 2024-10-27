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


import com.dao.DiscusschaoshishangpinDao;
import com.entity.DiscusschaoshishangpinEntity;
import com.service.DiscusschaoshishangpinService;
import com.entity.vo.DiscusschaoshishangpinVO;
import com.entity.view.DiscusschaoshishangpinView;

@Service("discusschaoshishangpinService")
public class DiscusschaoshishangpinServiceImpl extends ServiceImpl<DiscusschaoshishangpinDao, DiscusschaoshishangpinEntity> implements DiscusschaoshishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschaoshishangpinEntity> page = this.selectPage(
                new Query<DiscusschaoshishangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusschaoshishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschaoshishangpinEntity> wrapper) {
		  Page<DiscusschaoshishangpinView> page =new Query<DiscusschaoshishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschaoshishangpinVO> selectListVO(Wrapper<DiscusschaoshishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschaoshishangpinVO selectVO(Wrapper<DiscusschaoshishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschaoshishangpinView> selectListView(Wrapper<DiscusschaoshishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschaoshishangpinView selectView(Wrapper<DiscusschaoshishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
