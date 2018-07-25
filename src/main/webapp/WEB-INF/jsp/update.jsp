<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
String path=request.getContextPath();
%>
</head>
<body>
<form action="<%=path%>/book" method="post">
编号：<input type="text" name="bookNo" value="${book.bookNo}" readonly="readonly"><br/>
书籍名称：<input type="text" name="bookTitle" value="${book.bookTitle}"><br/>
作者：<input type="text" name="bookAuthor" value="${book.bookAuthor}"><br/>
书籍类型：<input type="text" name="bookType" value="${book.bookType}"><br/>
价格：<input type="text" name="price" value="${book.price}"><br/>
<input type="hidden" name="_method" value="put" > 
<input type="submit" value="更新">
</form>
</body>
</html>