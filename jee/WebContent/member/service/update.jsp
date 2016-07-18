<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@page import="member.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
<style>
div.box1 {
    border: 5px solid powderblue;
    padding: 30px;
    margin: 0 auto;
    width: 600px;
    text-align: center;
}
	#member_detail{border: 1px solid gray; width: 90%;height: 200px; margin: 0 auto;border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray;height: 20%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color:yellow}
</style>
<div class="box">
<!-- 	//id,age,name,regDate,gender,profileImg -->
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = service.findBy();

%>
	<h2>회원 상세정보</h2>
	<form action="<%=ctx %>/member/result/update_result.jsp" method="post">
	<table id = "member_detail">
		<tr>
			<td rowspan="4" style ="width:30%"><img src="<%=ctx %>/img/<%=bean.getProfileImg() %>" alt="W3Schools.com" width="104" height="142"></td>
			<td style ="width:20%" class="font_bold bg_color_yellow">ID</td>
			<td style="width: 40%"><%=bean.getId() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">비밀번호</td>
			<td ><input type="text" name="pw" value="<%=bean.getPw() %>"/></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">이름</td>
			<td><%=bean.getName() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">성별</td>
			<td><%=bean.getGender() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">e-mail</td>
			<td colspan="2"><input type="text" name="e-mail" value="<%=bean.getEmail() %>"/></td>
		</tr>
		
		<tr>
			<td class="font_bold bg_color_yellow">생년월일</td>
			<td colspan="2"><%=bean.getSsn() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">등록일</td>
			<td colspan="2"><%=bean.getRegDate() %></td>
		</tr>
	</table>
			<input type="submit" value="수정"/>
  		<input type="reset" value="취소"/>
	</form>
		<br/><a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="<%=ctx %>/index.jsp"><img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/></a>

	</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>