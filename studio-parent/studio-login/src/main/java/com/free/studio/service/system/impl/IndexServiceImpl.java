package com.free.studio.service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.studio.constants.Constant;
import com.free.studio.mapper.system.BsMenuMapper;
import com.free.studio.pojo.system.BsMenu;
import com.free.studio.pojo.system.BsMenuExample;
import com.free.studio.pojo.system.BsMenuExample.Criteria;
import com.free.studio.service.system.IIndexService;

/**
 * <p>Title: IndexServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: com.free.studio</p>
 * @author yewp
 * @date 2017年6月15日下午3:22:22
 * @version 1.0
 */
@Service
public class IndexServiceImpl implements IIndexService {

	@Autowired
	private BsMenuMapper menuMapper;
	
	@Override
	public List<BsMenu> findTopMenu() {
		//实例化条件对象
		BsMenuExample menuExample=new BsMenuExample();
		//设置查询条件
		Criteria criteria=menuExample.createCriteria();
		criteria.andParentMenuIdEqualTo(Constant.TOP_MENU_PARENT_ID);
		//执行查询
		List<BsMenu> menuList=menuMapper.selectByExample(menuExample);
		return menuList;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
