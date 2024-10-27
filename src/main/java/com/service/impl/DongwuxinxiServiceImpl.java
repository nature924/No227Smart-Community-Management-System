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


import com.dao.DongwuxinxiDao;
import com.entity.DongwuxinxiEntity;
import com.service.DongwuxinxiService;
import com.entity.vo.DongwuxinxiVO;
import com.entity.view.DongwuxinxiView;

@Service("dongwuxinxiService")
public class DongwuxinxiServiceImpl extends ServiceImpl<DongwuxinxiDao, DongwuxinxiEntity> implements DongwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongwuxinxiEntity> page = this.selectPage(
                new Query<DongwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DongwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongwuxinxiEntity> wrapper) {
		  Page<DongwuxinxiView> page =new Query<DongwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongwuxinxiVO> selectListVO(Wrapper<DongwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongwuxinxiVO selectVO(Wrapper<DongwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongwuxinxiView> selectListView(Wrapper<DongwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongwuxinxiView selectView(Wrapper<DongwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DongwuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DongwuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DongwuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
