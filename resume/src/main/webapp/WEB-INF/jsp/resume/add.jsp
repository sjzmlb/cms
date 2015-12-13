<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/resume/add" method="post">
	<div class="container  theme-showcase" role="main">
		<table class="table">
			<tr>
				<td colspan=4 align=center class="tableLineBg">新增简历</td>
			</tr>
			<tr>
				<td>简历编号</td>
				<td><input type="text" name="customerId" class="input"></td>
				<td>客户密码</td>
				<td><input type="text" name="pwd" class="input"></td>
			</tr>
			<tr>
				<td>显示名称</td>
				<td><input type="text" name="showName" class="input"></td>			
				<td>真实姓名</td>
				<td><input type="text" name="trueName" class="input"></td>
			</tr>		
			<tr>
				<td colspan=4 align=center><input type="submit" value="新增" class="button"></td>
			</tr>
		</table>
		<div class="row">
		  <div class="col-md-1">.col-md-1</div>
		</div>
	</div>
</form>

</body>
</html>