<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>폼태그</title>
</head>
<body>
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
</body>
</html>