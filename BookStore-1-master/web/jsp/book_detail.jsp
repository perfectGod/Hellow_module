<%@ page import="com.nf.bookstore1.entity.Book" %>
<%@ page import="util.WebUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
    <style>
        .msg {
            font-size: 2em;
            color: greenyellow;
        }
    </style>
</head>
<body>

<%
    Book book = (Book) request.getAttribute("book");
%>

<%= WebUtil.popSessionMsg(request) %>

<h1><%=book.getName()%></h1>
<ul>
    <li><%=book.getAuthor()%></li>
    <li><%=book.getPrice()%></li>
    <li><%=book.getPress()%></li>
</ul>

</body>
</html>
