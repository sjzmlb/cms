<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
<table width="100%">
	<tr height="200">
		<td colspan="2">&nbsp;</td>
	</tr>
	<tr>
		<td width="350">&nbsp;</td>
		<td>
			<table>
				<tr>
					<td>登录名：</td>
					<td><input type="text" name="customerId"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录"></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</form>

</body>
</html>