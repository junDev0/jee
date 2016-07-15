<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<link rel="stylesheet" href="../css/member.css"/>
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
<style type="text/css">
span {
	font-size: 110%;
	color: blue;
	border: 1px solid black;
}


div.joinDiv {
	border: 3px solid powderblue; padding : 30px; margin : 0 auto;
	width: 80%;
	margin: 10px 10px;
	padding: 30px;
	margin: 0 auto;
	text-align: center
}
</style>	
</head>
<body>
	<div class="box">
	<form action="" method="get">
		이름 : <input type="text" name="name"/> <br/>
		ID : <input type="text" name="id"/><br/>
		비밀번호 : <input type="password" name="pw"/><br/>
		SSN : <input type="text" name="ssn"/><br/>
		통신사 : 
		<input type="checkbox" name="SKT" value="skt">sk
		<input type="checkbox" name="KT" value="kt">kt
		<input type="checkbox" name="LGU" value="lgu">lgu<br/>
		성별 :
	    <input type="radio" name="gender" value="male" checked/> Male
  	    <input type="radio" name="gender" value="female"/>female
  		<input type="radio" name="gender" value="other"/>other<br/>
  		<input type="submit" value="회원가입"/>
  		<input type="reset" value="취소"/>
	</form>
		<br/><a href="../member2/memberController.html"><img src="../img/user.jpg" alt="user" style="width: 30px"/></a>
		<a href="../index.html"><img src="../img/home.png" alt="home" style="width: 30px"/></a>
	
  		</div>
</body>
</html>