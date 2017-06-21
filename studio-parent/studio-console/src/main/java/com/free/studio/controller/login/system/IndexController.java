package com.free.studio.controller.login.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.free.studio.pojo.system.BsMenu;
import com.free.studio.service.system.IIndexService;
import com.free.studio.view.system.MenuView;

/**
 * <p>Title: IndexController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: com.free.studio</p>
 * @author yewp
 * @date 2017年5月24日上午11:33:21
 * @version 1.0
 */
@Controller
public class IndexController {
	
	@Autowired
	private IIndexService indexService;
	
	/**
	 * 
	 * @Title: index 
	 * @Description: 访问首页 
	 * @param 
	 * @return String 
	 * @throws
	 */

	@RequestMapping("/welcome")
	public String index() {
		return "common/index";
	}

	/**
	 * 
	 * @Title: welcome 
	 * @Description: 显示欢迎页
	 * @param   
	 * @return String  
	 * @throws
	 */
	@RequestMapping("/login/system/comon/welcome")
	public String welcome(){
		return "common/welcome";
	}
	
	/**
	 * 
	 * <p>Title: findTopMenu</p>
	 * <p>Description: 获取顶级菜单</p>
	 * @return
	 */
	@RequestMapping("/login/system/common/topmenu")
	public ModelAndView findTopMenu(){
		List<BsMenu> menuList=indexService.findTopMenu();
	    ModelMap map=new ModelMap();
	    map.addAttribute("topMenu", menuList);
	    return new ModelAndView("common/top-menu", map);
	}
	
	/**
	 * 
	 * <p>Title: getLeftMenu</p>
	 * <p>Description: 获取左侧菜单</p>
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login/system/common/leftmenu")
	public MenuView getLeftMenu() {
		MenuView menuView=indexService.findLeftMenu("MU20170612000001");
		return menuView;
	}
}
