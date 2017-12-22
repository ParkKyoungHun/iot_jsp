package com.test.iot.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.iot.service.UserService;
import com.test.iot.service.impl.UserServiceImpl;

public class UserServlet extends HttpServlet {
	UserService us = new UserServiceImpl();
	public String getCommand(String uri) {
		int idx = uri.lastIndexOf(".do");
		if(idx!=-1) {
			return uri.substring(1, idx);
		}
		return "";
	}
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
			throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		String uri = req.getRequestURI();
		String cmd = getCommand(uri);
		System.out.println("cmd : " + cmd);
		if(cmd.equals("user/list")) {
			us.getUserList();
		}else if(cmd.equals("user/view")) {
			us.getUser();
		}else {
			cmd = "/common/error";
		}
		cmd += ".jsp"; 
		RequestDispatcher rd = req.getRequestDispatcher("/" + cmd);
		rd.forward(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("야야야야~");
	}
	
}
