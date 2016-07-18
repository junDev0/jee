<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<% String ctx = application.getContextPath(); %>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
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
	
	String pw = request.getParameter("pw");
	String email = request.getParameter("e-mail");
	if(pw=="" || email==""){
		%>
		<h2>빈칸없이 입력해주세요.</h2><br/>
		<a href="<%=ctx %>/member/service/update.jsp">내정보 변경(비번,email) 하러가기</a>
		<%
	
	}else{
		bean.setPw(pw);
		bean.setEmail(email);
		String result = service.update(bean);
		if(result == ""){
			%>
			<h2>회원정보가 일치하지 않습니다.</h2><br/>
			<a href="<%=ctx %>/member/service/update.jsp">내정보 변경(비번,email) 하러가기</a>
			<%
		}else{
			response.sendRedirect(ctx+"/member/service/detail.jsp");
		}
	}
%>
	
  		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>