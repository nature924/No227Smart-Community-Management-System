package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschaoshishangpinEntity;
import com.entity.view.DiscusschaoshishangpinView;

import com.service.DiscusschaoshishangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 超市商品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
@RestController
@RequestMapping("/discusschaoshishangpin")
public class DiscusschaoshishangpinController {
    @Autowired
    private DiscusschaoshishangpinService discusschaoshishangpinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschaoshishangpinEntity discusschaoshishangpin,
		HttpServletRequest request){
        EntityWrapper<DiscusschaoshishangpinEntity> ew = new EntityWrapper<DiscusschaoshishangpinEntity>();

		PageUtils page = discusschaoshishangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschaoshishangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschaoshishangpinEntity discusschaoshishangpin, 
		HttpServletRequest request){
        EntityWrapper<DiscusschaoshishangpinEntity> ew = new EntityWrapper<DiscusschaoshishangpinEntity>();

		PageUtils page = discusschaoshishangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschaoshishangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschaoshishangpinEntity discusschaoshishangpin){
       	EntityWrapper<DiscusschaoshishangpinEntity> ew = new EntityWrapper<DiscusschaoshishangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschaoshishangpin, "discusschaoshishangpin")); 
        return R.ok().put("data", discusschaoshishangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschaoshishangpinEntity discusschaoshishangpin){
        EntityWrapper< DiscusschaoshishangpinEntity> ew = new EntityWrapper< DiscusschaoshishangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschaoshishangpin, "discusschaoshishangpin")); 
		DiscusschaoshishangpinView discusschaoshishangpinView =  discusschaoshishangpinService.selectView(ew);
		return R.ok("查询超市商品评论表成功").put("data", discusschaoshishangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschaoshishangpinEntity discusschaoshishangpin = discusschaoshishangpinService.selectById(id);
        return R.ok().put("data", discusschaoshishangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschaoshishangpinEntity discusschaoshishangpin = discusschaoshishangpinService.selectById(id);
        return R.ok().put("data", discusschaoshishangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschaoshishangpinEntity discusschaoshishangpin, HttpServletRequest request){
    	discusschaoshishangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschaoshishangpin);
        discusschaoshishangpinService.insert(discusschaoshishangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschaoshishangpinEntity discusschaoshishangpin, HttpServletRequest request){
    	discusschaoshishangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschaoshishangpin);
        discusschaoshishangpinService.insert(discusschaoshishangpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusschaoshishangpinEntity discusschaoshishangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschaoshishangpin);
        discusschaoshishangpinService.updateById(discusschaoshishangpin);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschaoshishangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusschaoshishangpinEntity> wrapper = new EntityWrapper<DiscusschaoshishangpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschaoshishangpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
