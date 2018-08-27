<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<div id="form-div">
			<form action="${pageContext.request.contextPath}/course/modify" method="post">
				<input type="hidden" name="courseid" value="${c.courseid}"/>
				课程名称：<input type="text" name="coursename" value="${c.coursename }"/><br />
				课程学时：<input type="text" name="hour" value="${c.hour }"/><br />
				课程学分：<input type="text" name="score" value="${c.score }"/><br />
				<input type="submit" value="提交"/>
			</form>
		</div>
	</body>
</html>
    