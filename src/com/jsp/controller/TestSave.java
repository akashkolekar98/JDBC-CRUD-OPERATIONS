package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestSave {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1100);
		student.setName("Akash");
		student.setEmail("akash@gmail.com");

		StudentDao studentDao = new StudentDao();
		Student s1 = studentDao.saveStudent(student);
		System.out.println(s1.getId() + " has been updated");

	}
}
