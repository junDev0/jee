<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();

%>
<div class="box">

	<form action="<%=ctx %>/member/result/logout_result.jsp" method="post">
		<input type="hidden" name="<%=service.findBy().getId()%>"/><br/>
		<input type="hidden" name="<%=service.findBy().getPw()%>"/><br/>
		<input type="submit" value="로그아웃"/>
  		<input type="reset" value="취소"/>
	</form>
	
		<br/><a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>

	</div>
	
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>