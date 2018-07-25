<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<div id="div1">
<table border="1">
<tr>
<th>编号</th>
<th>书名</th>
<th>作者</th>
<th>型号</th>
<th>价格</th>
<th><a href="<%=path%>/book/toadd">添加</a></th>
</tr>
<c:forEach items="${books}" var="book">
<tr>
<td>${book.bookNo}</td>
<td>${book.bookTitle}</td>
<td>${book.bookAuthor}</td>
<td>${book.bookType}</td>
<td>${book.price}</td>
<td><a href="<%=path%>/book/${book.bookNo}?method=delete">删除</a></td>
<td><a href="<%=path%>/book/${book.bookNo}">修改</a></td>
</tr>
</c:forEach>
</table>
<c:if test="${pageNow > 1}">
<a href="<%=path %>/book/list?pageNow=${pageNow-1}" id="up">上一页</a>
</c:if>
<c:forEach begin="1" end="${pageCount}" varStatus="page">
<a href="<%=path %>/book/list?pageNow=${page.index}" class="yema">${page.index}</a>
</c:forEach>
<c:if test="${pageNow < pageCount}">
<a href="<%=path %>/book/list?pageNow=${pageNow+1}" id="down">下一页</a>
</c:if>
</div>
</body>
<script type="text/javascript">
window.onload=function(){
	var mes="${mes}";
	if(mes!=null&&mes!=""&&mes!=undefined){
		alert(mes);
	}
}

</script>
</html>