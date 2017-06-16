<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<c:forEach items="${topMenu}" var="item" varStatus="status">
 	  <c:if test="${item.isLeaf =='NO' }">
 	  		<li><a href="${item.menuUrl}" id="${item.menuId}">${item.menuName}</a></li>
 	  </c:if>
</c:forEach> 
