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
		<span class="meta">이름</span> <%= request.getParameter("name") %><br/>
		<span class="meta">ID</span><%= request.getParameter("id") %><br/>
		<span class="meta">비밀번호</span><%= request.getParameter("pw") %><br/>
		<span class="meta">SSN</span><%= request.getParameter("ssn") %><br/>
		<span class="meta">전공</span><%= request.getParameter("major") %><br/>
		<%
		String[] subjects = request.getParameterValues("subject");
		if(subjects != null){
			for(int i =0; i< subjects.length;i++){
		%>
			<%= subjects[i] %><br/>
		<%		
			}
		}
		%>
		
		회원가입을 축하드립니다. <%= request.getParameter("name")%>님
		<br/><a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="<%=ctx %>/index.html"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>
		<%
		application.log("리얼패스"+application.getContextPath());
		%>
  		</div>
</body>
</html>