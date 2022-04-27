<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${ prolist }" var="list" >
	<h3>상품코드 : ${ list.productcode }</h3><br>
	<h3>상품이름 : ${ list.productname }</h3><br>
	<h3>가격 : ${ list.price }</h3><br>
	<h3>회사 : ${ list.company }</h3><br>
	<h3>개수 : ${ list.balance }</h3><br>
	<h3>날짜 : ${ list.date }</h3><br>
</c:forEach>
<c:forEach items="" var="">
</c:forEach>



</body>
</html>