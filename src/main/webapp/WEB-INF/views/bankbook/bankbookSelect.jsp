<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Bank Book Select Page</h1>

<c:if test="${dto==null}">
<h3>상품이 없습니다</h3>
</c:if>

<h1>${dto.bookName}</h1>
<h1>${dto.bookRate}</h1>
<h1>${dto.bookSale}</h1>

</body>
</html>