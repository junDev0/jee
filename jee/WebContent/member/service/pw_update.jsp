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

</head>
<body>
	<div class="box">
	<form action="<%=ctx %>/member/result/pw_update_result.jsp" method="post">
		<span class="meta">(구)비밀번호</span><input type="text" name="old_pw"/><br/>
		<span class="meta">(새)비밀번호</span><input type="text" name="new_pw"/><br/>
		<input type="submit" value="확인"/>
  		<input type="reset" value="취소"/>
	</form>
		<br/><a href="<%=ctx %>/member/member_controller.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>
	
	</div>
	</body>
</html>