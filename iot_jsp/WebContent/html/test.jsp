<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String param = request.getParameter("param");
Gson gs = new Gson();
//ArrayList<HashMap<String,String>> hm = gs.fromJson(param, 
//		new TypeToken<ArrayList<HashMap<String,String>>>() {}.getType());
HashMap hm = gs.fromJson(param, HashMap.class);
String res = gs.toJson(hm);
out.println(res);
%>