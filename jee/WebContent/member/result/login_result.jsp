<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<% String ctx = application.getContextPath(); %>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float:left
}
</style>
<div class="box">
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(id=="" || pw==""){
		%>
		<h2>로그인 실패!!!</h2>
		<a href="<%=ctx %>/member/service/login.jsp">로그인 하러가기</a>
		<%
	
	}else{
		bean.setId(id);
		bean.setPw(pw);
		
		String name = service.login(bean);
		if(name == ""||name=="로그인실패"){
			%>
			<h2>로그인 실패</h2>
			<a href="<%=ctx %>/member/service/login.jsp">로그인 하러가기</a>
			<%
		}else{
			response.sendRedirect(ctx+"/member/main.jsp");
		}
	}
%>
	
  		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>