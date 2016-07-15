<%@page import="member.MemberBean"%>
<%@page import="java.util.List"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<div >
	<h2>리스트 페이지</h2>
	
	<%
	MemberService service = MemberServiceImpl.getInstance();
	List<MemberBean> list = service.show();
	
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>이 름</th>
			<th>등록일</th>
			<th>성별</th>
			<th>생년월일</th>
		</tr>
	<%
	for(int i=0; i<list.size(); i++){
		%>
		<tr>
			<td><%= list.get(i).getId()%></td>
			<td><a href="<%=ctx%>/member/service/detail.jsp
			?id=<%=list.get(i).getId()%>&name=<%= list.get(i).getName()%>&gender=<%=list.get(i).getGender()%>&reg_date=<%= list.get(i).getRegDate()%>&ssn=<%= list.get(i).getSsn()%>
			"><%= list.get(i).getName()%></a></td>
			<td><%= list.get(i).getGender()%></td>			
			<td><%= list.get(i).getRegDate()%></td>
			<td><%= list.get(i).getAge()%></td>
		<tr>
		<%
		
	}
	%>	
		
	
	</table><br/>
		<a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>

	</div>
</body>
</html>