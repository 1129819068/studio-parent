package com.free.studio.service.system.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.studio.constants.Constant;
import com.free.studio.mapper.system.BsMenuMapper;
import com.free.studio.pojo.system.BsMenu;
import com.free.studio.pojo.system.BsMenuExample;
import com.free.studio.pojo.system.BsMenuExample.Criteria;
import com.free.studio.service.system.IIndexService;
import com.free.studio.view.system.MenuView;

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
		BsMenuExample menuExample=new BsMenuExample();
		Criteria criteria=menuExample.createCriteria();
		criteria.andParentMenuIdEqualTo(Constant.TOP_MENU_PARENT_ID);
		List<BsMenu> menuList=menuMapper.selectByExample(menuExample);
		return menuList;
	}

	@Override
	public MenuView findLeftMenu(String parentId) {
		BsMenuExample menuExample=new BsMenuExample();
		Criteria criteria=menuExample.createCriteria();
		criteria.andParentMenuIdEqualTo(parentId);
		List<BsMenu> menus=menuMapper.selectByExample(menuExample);
		List<MenuView> menuViews=new ArrayList<MenuView>();
		for(BsMenu menu:menus){
			menuViews.add(ConvertBsMenuToMenuView(menu));
		}
		getLeftMenu(menuViews);
		BsMenu menu=getMenuFromId(parentId);
		MenuView menuView=ConvertBsMenuToMenuView(menu);
		menuView.setChildren(menuViews);
		return menuView;
	}

	private MenuView ConvertBsMenuToMenuView(BsMenu menu){
		MenuView menuView=new MenuView();
		menuView.setId(menu.getMenuId());
		menuView.setTitle(menu.getMenuName());
		menuView.setUrl(menu.getMenuUrl());
		menuView.setImage(menu.getMenuImage());
		menuView.setCss(menu.getCss());
		menuView.setIsLeaf(menu.getIsLeaf());
		return menuView;
	}
	private void getLeftMenu(List<MenuView> menuViews) {
		List<MenuView> children=null;
		for(MenuView menuView:menuViews){
			children=new ArrayList<MenuView>();
			if(menuView.getIsLeaf().equals(Constant.SYSTEM_STATUS_OF_YES)){
				continue;
			}
			BsMenuExample menuExample=new BsMenuExample();
			Criteria criteria=menuExample.createCriteria();
			criteria.andParentMenuIdEqualTo(menuView.getId());
			List<BsMenu> menus=menuMapper.selectByExample(menuExample);
			for(BsMenu menu:menus){
				children.add(ConvertBsMenuToMenuView(menu));
			}
			menuView.setChildren(children);
			getLeftMenu(children);
		}
	}

	@Override
	public BsMenu getMenuFromId(String menuId) {
		BsMenuExample menuExample=new BsMenuExample();
		Criteria criteria=menuExample.createCriteria();
		criteria.andParentMenuIdEqualTo(menuId);
		BsMenu menu=menuMapper.selectByPrimaryKey(menuId);
		return menu;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
