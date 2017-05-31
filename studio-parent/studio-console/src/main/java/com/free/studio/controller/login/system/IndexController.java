package com.free.studio.controller.login.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	/**
	 * 
	 * @Title: index 
	 * @Description: 访问首页 
	 * @param 
	 * @return String 
	 * @throws
	 */

	@RequestMapping("/")
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
	@RequestMapping("/login/system/comon/welcome.html")
	public String welcome(){
		return "common/welcome";
	}
	
	/**
	 * 
	 * @Title: getMenu 
	 * @Description: 获取菜单
	 * @param   
	 * @return ModelAndView  
	 * @throws
	 */
	@RequestMapping("/login/system/common/menu.html")
	public ModelAndView getMenu() {
		return new ModelAndView("common/menu.jsp");
	}
}
