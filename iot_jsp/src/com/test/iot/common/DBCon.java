package com.test.iot.common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBCon {
	private static Connection conn; 
	public static void commit() {
		try {
			DBCon.conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback() {
		try {
			DBCon.conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		if(DBCon.conn == null) {
			Context initContext;
			try {
				initContext = new InitialContext();
				Context envContext  = (Context)initContext.lookup("java:/comp/env");
				DataSource ds = (DataSource)envContext.lookup("jdbc/IOT");
				System.out.println(ds);
				DBCon.conn = ds.getConnection();
			} catch (NamingException | SQLException e) {
				e.printStackTrace();
			}
		}
		return DBCon.conn;
	}
	
	public static void closeCon() {
		try {
			DBCon.conn.close();
			DBCon.conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
