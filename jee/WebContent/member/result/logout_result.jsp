<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	bean.setId(id);
	bean.setPw(pw);
	String result = service.logout(bean);
	if(result == ""){
		response.sendRedirect(ctx+"/index.jsp");
	}else{
		response.sendRedirect(ctx+"/index.jsp");
		
	}
%>	
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>