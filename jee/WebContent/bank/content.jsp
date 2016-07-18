<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style type="text/css">
div {
    border: 5px solid powderblue;
    padding: 30px;
    margin: 0 auto;
    width: 200px;
}
</style>	

		<div id = "" class="memberClass box" style="text-align: center;"> <!-- 중괄호 -->
	<h1>회원관리 !!</h1><br/>
<!-- 
	"1.회원가입 2.로그인 3.내정보보기4.내정보수정(비번)5.탈퇴\n"
		+ "--- 관리자화면 ---\n"
	+ "11.회원목록 12.검색(ID) 13.검색(이름) 14.검색(성별) 15.회원수
 -->


 	<ol>
 		
		<li><a href="service/regist.jsp">회원가입</a></li>
		<li><a href="service/detail.jsp">내정보보기</a></li>
		<li><a href="service/update.jsp">내정보수정</a></li>
		<li><a href="service/delete.jsp">탈퇴</a></li>
		<li><a href="service/login.jsp">로그인</a></li>
		<li><a href="service/login_out.jsp">로그아웃</a></li>
		<li><a href="service/list.jsp">리스트</a></li>
		<li><a href="service/findById.jsp">검색</a></li>
		<li><a href="service/count.jsp">회원수</a></li>
 	</ol>	
	<a href="../index.jsp"><img src="../img/home.png" alt="home" style="width: 30px"/></a>
	</div>
