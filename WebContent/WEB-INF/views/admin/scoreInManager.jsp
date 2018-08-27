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
		
	</head>
	<body>
		<div id="class-title">
			学生成绩表
		</div>
		<!-- <div id="add-div">
			<input type="button" id="add-button" value="添加" onclick="add()"/>
			<div id="form-div">
				<form action="" method="post">
					<span>张无忌</span>成绩：<input type="text" name="score"/>
					<input type="submit" value="提交"/>
				</form>
			</div>
		</div> -->
		<form action="${pageContext.request.contextPath}/scorein/batModify" method="post">
			<table cellspacing="0">
				<tr>
					<th>班级</th>
					<th>学生学号</th>
					<th>学生名称</th>
					<th>学年</th>
					<th>学期</th>
					<th>课程</th>				
					<th>学分</th>
					<th>成绩</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="c" varStatus="s">
					<tr>
						<input type="hidden" name="selections[${s.index }].selid" value="${c.selid }"/>
						<td>${c.classname }</td>
						<td>${c.stunum }</td>
						<td>${c.stuname }</td>
						<td>${c.year }</td>
						<td>${c.term }</td>
						<td>${c.coursename }</td>
						<td>${c.score }</td>
						<td><input type="text" id="grade${s.index }" name="selections[${s.index }].grade" value="${c.grade }"/></td>
						<td>
							<a href="javascript:void(0)" onclick="modify('${c.selid}','${s.index }')">编辑</a>
							<a href="${pageContext.request.contextPath}/scorein/deleteScore?selid=${c.selid }">删除</a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
			
			<input type="submit" value="批量录入"/>
		</form>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.js"></script>
<script type="text/javascript">
function modify(selid,index){
	var grade = $('#grade'+index).val();	
	var url = '${pageContext.request.contextPath}/scorein/modify?selid=' + selid + '&grade=' + grade;
	location.href = url;	
}

</script>








