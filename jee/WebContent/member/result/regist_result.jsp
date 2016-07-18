<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>    
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
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	String ssn = request.getParameter("ssn");
	bean.JspBean(name, id, pw, ssn,email);
	String result = service.regist(bean);
	%>

	
	<% 
	if( result == "회원가입 실패"){
		%>
		<h2>회원가입 실패!</h2><br/>
		<a href="<%=ctx %>/member/service/regist.jsp">회원가입 하러가기</a>
		<% 
	}else{
		%>
		회원가입을 축하드립니다. <%= request.getParameter("name")%>님
		
		<% 
	}

%>
	<br/><a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>
		<%
		application.log("리얼패스"+application.getContextPath());
		%>
  		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>