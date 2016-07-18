<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ctx = application.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css"/>
<style type="text/css">
div.box1 {
    border: 5px solid powderblue;
    padding: 30px;
    margin: 0 auto;
    width: 600px;
    text-align: center;
}
	#member_detail{border: 1px solid gray; width: 90%;height: 300px; margin: 0 auto;border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray;height: 20%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color:yellow}
</style>
</head>
<body>
<div class="box">
<!-- 	//id,age,name,regDate,gender,profileImg -->
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String reg_date = request.getParameter("reg_date");
	String gender = request.getParameter("gender");
	String ssn = request.getParameter("ssn");
	
	%>
	<h2>회원 상세정보</h2>
	
	<table id = "member_detail">
		<tr>
			<td rowspan="3" style ="width:30%"><img src="<%=ctx %>/img/w3schools.jpg" alt="W3Schools.com" width="104" height="142"></td>
			<td style ="width:20%" class="font_bold bg_color_yellow">ID</td>
			<td style="width: 40%"><%=id %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">성별</td>
			<td><%=gender %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">생년월일</td>
			<td colspan="2"><%=ssn %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">등록일</td>
			<td colspan="2"><%=reg_date %></td>
		</tr>
	</table>
	
	
		<br/><a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
</body>
</html>