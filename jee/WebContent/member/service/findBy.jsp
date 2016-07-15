<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
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
<link rel="stylesheet" href="<%=ctx %>/css/member_info.css"/>
<style type="text/css">
iframe.ifrm {
	border: none;
	width: 400px;
	height: 400px;
}
</style>
</head>
<body>
	<div class="box">
	<h2>내정보검색</h2><br/>
	<%
	MemberService service = MemberServiceImpl.getInstance();
	String result = service.findBy();	
		if(result == ""){
			%>
			<h2>로그인을 해주세요</h2>
			<a href="<%=ctx %>/member/service/login.jsp">로그인 하러가기</a>
			<%
		}else{
			%>
			<%=result %>
	<br/><a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>			
			<% 
		}
	
%>

	</div>
	
</html>