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
		<script src="${pageContext.request.contextPath}/static/js/jquery.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/static/js/admin-class.js" type="text/javascript" charset="utf-8"></script>
		
	</head>
	<body>
		<c:if test="${!empty message }">
			<script type="text/javascript">
				alert('${message}');
			</script>
		</c:if>
		<div id="class-title">
			班级列表
		</div>
		<div id="add-div">
			<input type="button" id="add-button" value="添加" onclick="add()"/>
			<div id="form-div">
				<form id="form1" action="${pageContext.request.contextPath}/class/save" method="post">
					<input type="hidden" name="classid" id="classid">
					班级名称：<input type="text" name="classname" id="classname"/>
					<input type="submit" value="提交"/>
				</form>
			</div>
		</div>
		<table cellspacing="0">
			<tr>
				<th>班级ID</th>
				<th>班级名称</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="c">
				<tr>
					<td>${c.classid }</td>
					<td>${c.classname }</td>
					<td>
						<a href="javascript:void(0)" onclick="edit('${c.classid}','${c.classname }')">编辑</a>
						<a href="${pageContext.request.contextPath}/class/delete?classid=${c.classid}">删除</a>
					</td>
				</tr>
			</c:forEach>
			
			
		</table>
		
<script type="text/javascript">
function edit(classid,classname){
	/* document.getElementById("classid").value = classid;
	document.getElementById("classname").value = classname;	 */
	
	$('#classid').val(classid);
	$('#classname').val(classname);
	$('#form-div').show();
	$('#form1').attr('action','${pageContext.request.contextPath}/class/modify');

	
}

</script>
	</body>
</html>
    