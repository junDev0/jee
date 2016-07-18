<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@page import="java.util.*"%>
<% String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float:left
}


div.joinDiv {
border: 1px dotted gray;
width: 80%;
margin: 10px 50px 10px 50px;
}
</style>
	<div class="box">
	<form action="<%=ctx %>/member/result/regist_result.jsp" method="post">
		<span class="meta">이름</span> <input type="text" name="name"/><br/>
		<span class="meta">ID</span><input type="text" name="id"/><br/>
		<span class="meta">비밀번호</span><input type="text" name="pw"/><br/>
		<span class="meta">email</span><input type="text" name="email"/><br/>
		<span class="meta">SSN</span><input type="text" name="ssn"/><br/><br/>

		<input type="submit" value="회원가입"/>
  		<input type="reset" value="취소"/>
	</form>
		<br/><a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>
	
  		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>