<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<link rel="stylesheet" type="text/css" href="css/common/top.css">


<!-- 系统菜单 -->
<nav class="navbar navbar-default" style="margin-bottom: 3px;height: 65px;">
  <div class="container-fluid">
    <div class="navbar-header" style="float: left;width: 25%">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="images/common/zhfw-logo.png" style="height: 40px;">
      </a>
    </div>
    <div style="float: left;width: 64%">
		<nav role="navigation" style="margin-top: 12.5px;">
		  <ul class="nav navbar-nav nav-justified" id="topMenu">

		  </ul>
		</nav>
    </div>
    <div style="float: left;width: 11%">
		<nav role="navigation" style="margin-top: 12.5px;">
		  <ul class="nav navbar-nav nav-justified">
			  <li class="dropdown">
			    <a class="dropdown-toggle" data-toggle="dropdown" href="###">admin<span class="caret"></span></a>
			    <ul class="dropdown-menu">
			      <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-user"></i>用户信息</a></li>
			      <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-lock"></i>更改密码</a></li>
			      <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-off"></i>退出系统</a></li>
			    </ul>
			  </li>
		  </ul>
		</nav>
    </div>
  </div>
</nav>
<script type="text/javascript" src="js/common/top.js"></script>
