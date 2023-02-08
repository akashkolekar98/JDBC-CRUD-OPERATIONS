package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class MainController {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();

		// To save the Details in table
		Student s1 = new Student();
		s1.setId(133);
		s1.setName("KETAN");
		s1.setEmail("ketan@gmail.com");
		studentDao.saveStudent(s1);

		// To delete the data from the table
		Student s2 = new Student();
		s2.setId(201);
		studentDao.deleteStudentById(s2);

		// To Update the data in the table
		Student s3 = new Student();
		s3.setId(169);
		studentDao.updateStudentById(s3);

		// To get all the details from the table
		String sql = "SELECT * FROM STUDENT";
		studentDao.showStudents(sql);

		// To add multiple students details in table
		Student st1 = new Student();
		st1.setId(151);
		st1.setName("NISHANT");
		st1.setEmail("nishant@gmail.com");

		Student st2 = new Student();
		st2.setId(152);
		st2.setName("OMKAR");
		st2.setEmail("omkar@gmail.com");

		ArrayList<Student> al = new ArrayList<>();
		al.add(st1);
		al.add(st2);

		studentDao.addMultipleStudents(al);

	}
}
