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

<c:forEach items="${ list }" var="dto" >
	<h3>상품코드 : ${ dto.productcode }</h3><br>
	<h3>상품이름 : ${ dto.productname }</h3><br>
	<h3>가격 : ${ dto.price }</h3><br>
	<h3>회사 : ${ dto.company }</h3><br>
	<h3>개수 : ${ dto.balance }</h3><br>
	<h3>날짜 : ${ dto.date }</h3><br>
</c:forEach>	



</body>
</html>