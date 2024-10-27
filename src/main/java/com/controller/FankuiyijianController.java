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

import com.entity.FankuiyijianEntity;
import com.entity.view.FankuiyijianView;

import com.service.FankuiyijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 反馈意见
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-28 00:27:23
 */
@RestController
@RequestMapping("/fankuiyijian")
public class FankuiyijianController {
    @Autowired
    private FankuiyijianService fankuiyijianService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FankuiyijianEntity fankuiyijian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fankuiyijian.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FankuiyijianEntity> ew = new EntityWrapper<FankuiyijianEntity>();

		PageUtils page = fankuiyijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuiyijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FankuiyijianEntity fankuiyijian, 
		HttpServletRequest request){
        EntityWrapper<FankuiyijianEntity> ew = new EntityWrapper<FankuiyijianEntity>();

		PageUtils page = fankuiyijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuiyijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FankuiyijianEntity fankuiyijian){
       	EntityWrapper<FankuiyijianEntity> ew = new EntityWrapper<FankuiyijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fankuiyijian, "fankuiyijian")); 
        return R.ok().put("data", fankuiyijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FankuiyijianEntity fankuiyijian){
        EntityWrapper< FankuiyijianEntity> ew = new EntityWrapper< FankuiyijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fankuiyijian, "fankuiyijian")); 
		FankuiyijianView fankuiyijianView =  fankuiyijianService.selectView(ew);
		return R.ok("查询反馈意见成功").put("data", fankuiyijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FankuiyijianEntity fankuiyijian = fankuiyijianService.selectById(id);
        return R.ok().put("data", fankuiyijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FankuiyijianEntity fankuiyijian = fankuiyijianService.selectById(id);
        return R.ok().put("data", fankuiyijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FankuiyijianEntity fankuiyijian, HttpServletRequest request){
    	fankuiyijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuiyijian);
        fankuiyijianService.insert(fankuiyijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FankuiyijianEntity fankuiyijian, HttpServletRequest request){
    	fankuiyijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuiyijian);
        fankuiyijianService.insert(fankuiyijian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FankuiyijianEntity fankuiyijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fankuiyijian);
        fankuiyijianService.updateById(fankuiyijian);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fankuiyijianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FankuiyijianEntity> wrapper = new EntityWrapper<FankuiyijianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fankuiyijianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
