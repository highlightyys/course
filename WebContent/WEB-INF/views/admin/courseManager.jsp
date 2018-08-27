<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/admin-common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/admin-course.css"/>
		<script src="${pageContext.request.contextPath}/static/js/jquery.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			a{
				text-decoration: none;
			}
		</style>
	</head>
	<body>
		<div id="class-title">
			课程列表
		</div>
		<div id="add-div">
			<form action="${pageContext.request.contextPath}/course/showAdd" method="post">
				<input type="submit"value="添加"/>		
			</form>
				
		</div>
		<table cellspacing="0">
			<tr>
				<th>课程ID</th>
				<th>课程名称</th>
				<th>课程学时</th>
				<th>课程学分</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${pageBean.list }" var="c">
				<tr>
					<td>${c.courseid }</td>
					<td>${c.coursename }</td>
					<td>${c.hour }</td>
					<td>${c.score }</td>
					<td>
						<a href="${pageContext.request.contextPath}/course/showModify?courseid=${c.courseid}">编辑</a>
						<a href="${pageContext.request.contextPath}/course/delete?courseid=${c.courseid}">删除</a>
					</td>
				</tr>
			</c:forEach>
			
			
		</table>
		<div id="fenye">
			<div class="page">
				<c:if test="${pageBean.nowPage == 1}">
					<
				</c:if>
				<c:if test="${pageBean.nowPage > 1}">
					<a href="${pageContext.request.contextPath}/course/list?nowPage=${pageBean.nowPage - 1}"><</a>
				</c:if>
				
			</div>
			<div class="page">
				${pageBean.nowPage }
			</div>
			<div class="page">
				<c:if test="${pageBean.nowPage == pageBean.totalPage}">
					>
				</c:if>
				<c:if test="${pageBean.nowPage < pageBean.totalPage}">
					<a href="${pageContext.request.contextPath}/course/list?nowPage=${pageBean.nowPage + 1}">></a>
				</c:if>				
			</div>
			<div class="page">
				${pageBean.totalPage}
			</div>
			<div class="page">
				${pageBean.count }
			</div>
		</div>
	</body>
</html>

    