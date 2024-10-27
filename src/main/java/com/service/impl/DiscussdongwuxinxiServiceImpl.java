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


import com.dao.DiscussdongwuxinxiDao;
import com.entity.DiscussdongwuxinxiEntity;
import com.service.DiscussdongwuxinxiService;
import com.entity.vo.DiscussdongwuxinxiVO;
import com.entity.view.DiscussdongwuxinxiView;

@Service("discussdongwuxinxiService")
public class DiscussdongwuxinxiServiceImpl extends ServiceImpl<DiscussdongwuxinxiDao, DiscussdongwuxinxiEntity> implements DiscussdongwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongwuxinxiEntity> page = this.selectPage(
                new Query<DiscussdongwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdongwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongwuxinxiEntity> wrapper) {
		  Page<DiscussdongwuxinxiView> page =new Query<DiscussdongwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongwuxinxiVO> selectListVO(Wrapper<DiscussdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongwuxinxiVO selectVO(Wrapper<DiscussdongwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongwuxinxiView> selectListView(Wrapper<DiscussdongwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongwuxinxiView selectView(Wrapper<DiscussdongwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
