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
			<form action="${pageContext.request.contextPath}/course/save" method="post">
				课程名称：<input type="text" id='coursename' name="coursename" onchange="checkCoursename()"/>
				<span id="coursenamespan"></span>
				<br />
				课程学时：<input type="text" name="hour"/><br />
				课程学分：<input type="text" name="score"/><br />
				<input type="submit" value="提交"/>
			</form>
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.js"></script>
<script type="text/javascript">
function checkCoursename(){
	//通过jquery的post方法发送ajax请求
	//该方法中有四个参数，1：请求的url地址 2：要传递的参数 3：回调函数 4：从controller中返回数据的格式
	var coursename = $('#coursename').val();

	$.post('${pageContext.request.contextPath }/course/checkByName',{coursename:coursename},function(data){
		$('#coursenamespan').html(data);		
	},'html');
	
}
</script>