<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/common/center-left.css">
<script type="text/javascript" src="js/common/center-left.js"></script>

<div style="border:1px solid #DEDEDE;width: 203px;float: left;height: auto;min-height: 620px;">
	<!-- 标题 -->
	<div style="margin-bottom: 5px;min-height: 28px;width: 200px;border:1px solid #DEDEDE;background-color: #F7F7F7">
		<div style="margin-top: 4px;">功能菜单</div>
	</div>
	<!-- 菜单 -->
	<nav class="menu" data-ride="menu" style="width: 200px">
	  <ul id="treeMenu" class="tree tree-menu" data-ride="tree">
	    <li><a href="#"><i class="icon icon-th"></i>首页</a></li>
	    <li><a href="#"><i class="icon icon-user"></i>个人资料</a></li>
	    <li>
	      <a href="#"><i class="icon icon-time"></i>更新时间</a>
	      <ul>
	        <li><a href="#">今天</a></li>
	        <li><a href="#">明天</a></li>
	        <li><a href="#">昨天</a></li>
	        <li><a href="#">本周</a></li>
	      </ul>
	    </li>
	    <li><a href="#"><i class="icon icon-trash"></i>垃圾篓</a></li>
	    <li><a href="#"><i class="icon icon-list-ul"></i>全部</a></li>
	    <li class="open">
	      <a href="#"><i class="icon icon-tasks"></i>状态</a>
	      <ul>
	        <li>
	          <a href="#"><i class="icon icon-circle-blank"></i>已就绪</a>
	          <ul>
	            <li><a href="#">已取消</a></li>
	            <li><a href="#">已关闭</a></li>
	          </ul>
	        </li>
	        <li class="active"><a href="#"><i class="icon icon-play-sign"></i>进行中</a></li>
	        <li><a href="#"><i class="icon icon-ok-sign"></i>已完成</a></li>
	      </ul>
	    </li>
	  </ul>
	</nav>
</div>