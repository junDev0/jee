<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>    
<div class = "box">
	<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다.</h2>
	<a href="<%=ctx %>/member/service/regist.jsp">회원가입 바로가기</a>
	<a href="<%=ctx %>/member/service/login.jsp">로그인 바로가기</a>
	<a href="<%=ctx %>/global/main.jsp">[임시]글로벌메인</a>
</div>