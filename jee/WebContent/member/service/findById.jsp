<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색(ID)</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>

<style>
body {background-color: yellow;}
h1   {color: blue;}
p    {color: red;}
</style>
</head>
<body>
	<div class="box">
	<embed width="100%" height="60px" src="<%=ctx %>/img/desert.jpg"/>
	<h2>내정보보기(ID) 페이지</h2><br/>
	<form action="<%=ctx %>/member/result/findById_result.jsp" method="post">
		<span class="meta">검색할 아이디 입력</span><input type="text" name="id"/><br/><br/>
		<input type="submit" value="확인"/>
  		<input type="reset" value="취소"/>
	</form><br/>
	<img src="<%=ctx %>/img/w3schools.jpg" alt="W3Schools.com" width="104" height="142"><br/>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
	</body>
</html>