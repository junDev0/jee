<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@page import="member.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
	<div class="box">
	<h2>회원수 페이지</h2><br/>
		<%
		MemberService service = MemberServiceImpl.getInstance();		
		%>
		총 회원수는 <%=service.count() %> 명입니다.
		<a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>