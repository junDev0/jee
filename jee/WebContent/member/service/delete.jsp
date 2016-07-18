<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
	<div class="box">
<embed src="<%=ctx %>/img/minjung.gif" style="width: 300px;height: 200px;">
	<h2>회원탈퇴 페이지</h2><br/>
	<form action="<%=ctx %>/member/result/delete_result.jsp" method="post">
		<span class="meta">비밀번호 입력</span><input type="text" name="pw"/><br/><br/>
		<input type="submit" value="확인"/>
  		<input type="reset" value="취소"/>
	</form><br/>
		<a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>

	</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>