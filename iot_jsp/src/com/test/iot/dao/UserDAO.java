package com.test.iot.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	public ArrayList<HashMap<String,Object>> selectUserList() throws SQLException;
	public HashMap<String,Object> selectUser();
}
