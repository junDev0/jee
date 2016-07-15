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
	
	String pw = request.getParameter("pw");
	if(pw==""){
		%>
		<h2>비밀번호 입력 후 사용해주세요.</h2><br/>
		<a href="<%=ctx %>/member/service/delete.jsp">계정탈퇴 하러가기</a>
		<%
	
	}else{
		bean.setPw(pw);
		String result = service.delete(bean);
		if(result == ""){
			%>
			<h2>비밀번호가 일치하지 않습니다.</h2><br/>
			<a href="<%=ctx %>/member/service/delete.jsp">계정탈퇴 하러가기</a>
			<%
		}else{
			%>
			<h2>계정탈퇴 완료</h2><br/>
			<a href="<%=ctx %>/index.jsp">메인 페이지로 가기</a>
			<%
		}
	}
%>
	
  		</div>
</body>
</html>