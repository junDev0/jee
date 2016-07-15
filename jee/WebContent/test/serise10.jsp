<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	int i = 1,sum=0;
	String result = "";
	for(; i<=10; i++){
		sum += i;
		result = result+"+"+i;
	}
	
%>
	<%= result = result.substring(1,result.length())%>=<%= sum %> 입니다.<br/>

<%
	result = "";
	for(int k=0; k<2;k++){
		
		for(int n=1; n<10; n++){
			
			for(int j=2+(4*k);j<6+(4*k); j++){
				result = j+"*"+n+"=";
				%>
				<%=result%><%=j*n %>&nbsp;&nbsp;
				<%
			}
			%>
			<br/>
			<% 
		}
		%>
		<br/>
		<% 
	}
%>	
</body>
</html>