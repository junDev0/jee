<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@page import="member.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
</head>
<body>
	<div class="box">
	<h2>회원수 페이지</h2><br/>
		<%
		MemberService service = MemberServiceImpl.getInstance();		
		%>
		총 회원수는 <%=service.count() %> 명입니다.
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
</body>
</html>