<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>유저 리스트</title>
</head>
<body>
<%
ArrayList<HashMap<String,Object>> userList = null;
userList = (ArrayList<HashMap<String,Object>>)request.getAttribute("list");
out.println(userList);
%>
</body>
</html>