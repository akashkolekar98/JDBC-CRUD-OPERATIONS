package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class TestRead {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();
		String sql = "SELECT * FROM STUDENT";
		studentDao.showStudents(sql);

	}
}
