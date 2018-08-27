<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/admin-common.css"/>
		<script src="${pageContext.request.contextPath}/static/js/jquery.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/static/js/admin-student.js" type="text/javascript" charset="utf-8"></script>
		
	</head>
	<body>
		<div id="class-title">
			学生列表
		</div>
		<div id="add-div">
			<input type="button" id="add-button" value="添加" onclick="add()"/>			
		</div>
		<table cellspacing="0" id="table">
			<tr>
				<th>学号</th>
				<th>头像</th>
				<th>姓名</th>
				<th>密码</th>
				<th>班级</th>
				<th>操作</th>
			</tr>
			<c:if test="${empty list }">
				<tr>
					<td colspan="5">没有数据</td>
				</tr>			
			</c:if>
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="s" varStatus="l">
					<tr>
											
						<td id="stunum${l.count }">${s.stunum }</td>
						<td id="stunum${l.count }">
						
						<img src="${pageContext.request.contextPath}${s.picurl }" width="40" height="60">
						
						</td>
						<td id="stuname${l.count }">${s.stuname }</td>
						<td id="password${l.count }">${s.password }</td>
						<td id="classname${l.count }">${s.classname }</td>
						<td>
							<a href="javascript:void(0)" onclick="modify('${s.stuid }','${s.classid }','${l.count}')">编辑</a>
							<a href="${pageContext.request.contextPath}/student/delete?stuid=${s.stuid}">删除</a>
						</td>
					</tr>			
				</c:forEach>
			</c:if>
			
		</table>
		<div id="form-div">
			<form id="form1" action="${pageContext.request.contextPath}/student/save" method="post" enctype="multipart/form-data">
				<input type="hidden" name="stuid" id="stuid">
				学号：<input type="text" name="stunum" id="stunum"/><br />
				姓名：<input type="text" name="stuname" id="stuname"/><br />
				密码：<input type="password" name="password" id="password"/><br />
				头像：<input type="file" name="fileurl" id="fileurl"><br>
				班级：<select name="classid" id="classid">
						<c:forEach items="${classes }" var="c">
							<option value="${c.classid }">${c.classname }</option>
						</c:forEach>
					</select>
				<input type="submit" value="提交"/>
			</form>
		</div>

	</body>
</html>



<script type="text/javascript">
$(function(){
	$('#form-div').hide();
});
function add(){
	$('#form-div').show();
	$("#table").hide();
	$('#add-div').hide();
	$('#class-title').html("学生信息");
}


function modify(stuid,classid,count){
	add();
	
	var stunum = $('#stunum'+count).html();
	var stuname = $('#stuname'+count).html();
	var password = $('#password'+count).html();
	var classname = $('#classname'+count).html();
	
	$('#stuid').val(stuid);
	$('#stunum').val(stunum);
	$('#stuname').val(stuname);
	$('#password').val(password);
	
	var str = "<option value='"+classid+"'>"+classname+"</option>";
	
	var old = $('#classid').html();
	$('#classid').html(str+old)

	$('#form1').attr('action','${pageContext.request.contextPath}/student/modify');
	
}


</script>
    