<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!doctype html>
<html lang="en">
<head>
<style type="text/css">
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

#section {
    width:350px;
    float:left;
    padding:10px;
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}
#nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

#nav li {
    float: left;
    border-right:1px solid #bbb;
}

#nav li:last-child {
    border-right: none;
}

#nav li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

#nav li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>
<body>
	
	
<div id="header">
<h1>학생관리 시스템[Student Management System]</h1>
</div>

<div>
	<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다.</h2>
	<a href="<%=ctx %>/member/service/regist.jsp">회원가입 바로가기</a>
	<a href="<%=ctx %>/member/service/login.jsp">로그인 바로가기</a>
</div>
</body></html>