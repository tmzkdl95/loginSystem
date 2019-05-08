<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
	<div>
		<form action = "login" method = "post" id = "idpw">
		 ID : <input name="id" type="text" size="10"id="userID">
		 Password : <input name="passwd" type="text"size="10" id="userPW">
		 
		 <input type = "submit">
		</form>
	</div>
	
	<div>
		 <a href="memberJoin">Member Join</a>
	</div>

</body>
</html>