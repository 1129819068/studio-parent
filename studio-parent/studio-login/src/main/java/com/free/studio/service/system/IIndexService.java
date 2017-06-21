package com.free.studio.service.system;

import java.util.List;

import com.free.studio.pojo.system.BsMenu;
import com.free.studio.view.system.MenuView;

/**
 * <p>Title: IIndexService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: com.free.studio</p>
 * @author yewp
 * @date 2017年6月15日下午3:21:45
 * @version 1.0
 */
public interface IIndexService {
	/**
	 * 
	 * <p>Title: findTopMenu</p>
	 * <p>Description: 获取顶级菜单 </p>
	 * @return
	 */
	public List<BsMenu> findTopMenu();

	/**
	 *
	 * <p>Title: findLeftMenu</p>
	 * <p>Description: 获取左侧菜单</p>
	 * @param parentId
	 * @return
	 */
	public MenuView findLeftMenu(String parentId);
	
	/**
	 * 
	 * <p>Title: getMenuFromId</p>
	 * <p>Description: 根据菜单编号获取菜单对象</p>
	 * @param MenuId
	 * @return
	 */
	public BsMenu getMenuFromId(String menuId);
}
