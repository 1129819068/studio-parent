package com.free.studio.service.system;

import java.util.List;

import com.free.studio.pojo.system.BsMenu;

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
}
