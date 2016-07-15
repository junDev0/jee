<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
    
<!doctype html>
<% String ctx = application.getContextPath(); %>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float:left
}
</style>
</head>
<body>
<div class="box">
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();
	
	String old_pw = request.getParameter("old_pw");
	String new_pw = request.getParameter("new_pw");
	if(old_pw=="" || new_pw==""){
		%>
		<h2>빈칸없이 입력해주세요.</h2><br/>
		<a href="<%=ctx %>/member/service/pw_update.jsp">내정보 변경(비번) 하러가기</a>
		<%
	
	}else{
		bean.setPw(old_pw);
		String result = service.update(bean, new_pw);
		if(result == ""){
			%>
			<h2>비밀번호가 일치하지 않습니다.</h2><br/>
			<a href="<%=ctx %>/member/service/pw_update.jsp">내정보 변경(비번) 하러가기</a>
			<%
		}else{
			%>
			<h2>비밀번호 변경 완료! 다시 로그인을 해주세요.</h2><br/>
			<a href="<%=ctx %>/member/service/login.jsp">로그인 하러가기</a>
			<%
		}
	}
%>
	
  		</div>
</body>
</html>