<%@page import="java.util.List"%>
<%@page import="member.MemberBean"%>
<%@page import="member.MemberServiceImpl"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>    
<jsp:include page="../../global/top.jsp"/>	
<jsp:include page="../../global/header.jsp"/>	
<jsp:include page="../../global/navi.jsp"/>
<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float:left
}
</style>

	<div class="box">
			<h2>검색(ID)</h2><br/>
	
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
		<a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
 		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>