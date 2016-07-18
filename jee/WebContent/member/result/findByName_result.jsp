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
	MemberBean bean = new MemberBean();
	String name = request.getParameter("name");
	List<MemberBean> result = service.findByName(name);
	%>

	
	<% 
	if( name == ""){
		%>
		<h2>이름을 입력해주세요!</h2><br/><br/>
		<a href="<%=ctx %>/member/service/findByName.jsp">검색(NAME) 페이지가기</a>
		<% 
	}else{
		if(result == null){
			%>
			<h2>해당 계정이  없습니다.</h2><br/>
			<a href="<%=ctx %>/member/service/findByName.jsp">검색(NAME) 페이지가기</a>
			<%
		}else{
			for(int i=0; i<result.size();i++){
			%>
			<%= result.get(i).toString() %><br/>
			<%
			}
		}
	}

%>
		<br/><a href="<%=ctx %>/member/main.jsp"><img src="<%=ctx %>/img/user.jpg" alt="user" style="width: 30px"/></a>
  		</div>
<jsp:include page = "../../global/footer.jsp"/>
<jsp:include page = "../../global/end.jsp"/>