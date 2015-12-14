<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/application.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags" %>

<script type="text/javascript">
	$().ready(function(){
		$("#btn_order").click(function(){
			
			
		});		
	});

</script>

<table width="70%" align="center" border=1>
<c:forEach var="m" items="${page.result}">
		<tr>
		<td><img alt="" src="${pageContext.request.contextPath}/static/images/logo.jpg"/></td>
		<td>${m.customerUuid }</td>
		<td>${m.goodsUuid }</td>
		<td>${m.buyNum }</td>
		</tr>
</c:forEach>

	<tr>
		<td colspan=4>
			<a id="btn_order" href="${pageContext.request.contextPath}/order">提交订单</a>
		</td>
	</tr>
</table>

</body>
</html>