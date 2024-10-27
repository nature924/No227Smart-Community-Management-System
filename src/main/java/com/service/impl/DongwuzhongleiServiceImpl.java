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


import com.dao.DongwuzhongleiDao;
import com.entity.DongwuzhongleiEntity;
import com.service.DongwuzhongleiService;
import com.entity.vo.DongwuzhongleiVO;
import com.entity.view.DongwuzhongleiView;

@Service("dongwuzhongleiService")
public class DongwuzhongleiServiceImpl extends ServiceImpl<DongwuzhongleiDao, DongwuzhongleiEntity> implements DongwuzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongwuzhongleiEntity> page = this.selectPage(
                new Query<DongwuzhongleiEntity>(params).getPage(),
                new EntityWrapper<DongwuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongwuzhongleiEntity> wrapper) {
		  Page<DongwuzhongleiView> page =new Query<DongwuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongwuzhongleiVO> selectListVO(Wrapper<DongwuzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongwuzhongleiVO selectVO(Wrapper<DongwuzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongwuzhongleiView> selectListView(Wrapper<DongwuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongwuzhongleiView selectView(Wrapper<DongwuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
