<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>

</head>
<body>
	<div class="box">
	<h2>검색(이름) 페이지</h2><br/>
	<form action="<%=ctx %>/member/result/findByName_result.jsp" method="post">
		<span class="meta">검색할 이름 입력</span><input type="text" name="name"/><br/><br/>
		<input type="submit" value="확인"/>
  		<input type="reset" value="취소"/>
	</form><br/>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
</html>