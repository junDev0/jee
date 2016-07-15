<%@page import="java.util.List"%>
<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
        <%
    String ctx = application.getContextPath();
    %>    
<!doctype html>
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
			<h2>검색(성별)</h2><br/>
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();
	String gender = request.getParameter("gender");
	int result = service.findByGen(gender);
	%>

	
	<% 
	if( gender == ""){
		%>
		<h2>성별을 입력해주세요!</h2><br/><br/>
		<a href="<%=ctx %>/member/service/findByGen.jsp">검색(성별) 페이지가기</a>
		<% 
	}else{
		if(result == 0){
			%>
			<h2>해당 계정이  없습니다.</h2><br/>
			<a href="<%=ctx %>/member/service/findByGen.jsp">검색(성별) 페이지가기</a>
			<%
		}else{
			%>
			<%=gender%> <%= result %> 명 입니다.<br/>
			<%
		}
	}

%>
		<br/><a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
  		</div>
</body>
</html>