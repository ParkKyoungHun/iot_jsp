<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>유저입력</title>
</head>
<body>
<%
System.out.println(request.getParameter("r1"));
System.out.println(request.getParameter("r2"));
%>
<form> 
	성별 : 여자 <input type="radio" name="r1" value="여행">, 남자<input type="radio" name="r1" value="독서"><br>
	<input type="submit" value="전송">
</form>
</body>
</html>