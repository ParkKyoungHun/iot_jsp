<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String param = request.getParameter("param");
Gson gs = new Gson();
HashMap hm = gs.fromJson(param, HashMap.class);
int num1 = Integer.parseInt((String)hm.get("num1"));
int num2 = Integer.parseInt((String)hm.get("num2"));
String op = (String)hm.get("op");
int result = 0;
if(op.equals("+")){
	result = num1 + num2;
}else if(op.equals("-")){
	result = num1 - num2;
}else if(op.equals("/")){
	result = num1 / num2;
}else if(op.equals("*")){
	result = num1 * num2;
}
HashMap<String,Object> rm = new HashMap<String, Object>();
rm.put("result",result);
String json = gs.toJson(rm);
out.println(json);
%>