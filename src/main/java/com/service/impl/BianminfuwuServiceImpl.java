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


import com.dao.BianminfuwuDao;
import com.entity.BianminfuwuEntity;
import com.service.BianminfuwuService;
import com.entity.vo.BianminfuwuVO;
import com.entity.view.BianminfuwuView;

@Service("bianminfuwuService")
public class BianminfuwuServiceImpl extends ServiceImpl<BianminfuwuDao, BianminfuwuEntity> implements BianminfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianminfuwuEntity> page = this.selectPage(
                new Query<BianminfuwuEntity>(params).getPage(),
                new EntityWrapper<BianminfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianminfuwuEntity> wrapper) {
		  Page<BianminfuwuView> page =new Query<BianminfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianminfuwuVO> selectListVO(Wrapper<BianminfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianminfuwuVO selectVO(Wrapper<BianminfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianminfuwuView> selectListView(Wrapper<BianminfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianminfuwuView selectView(Wrapper<BianminfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
