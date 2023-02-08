package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList();
		Student s1 = new Student();
		s1.setId(500);
		s1.setName("akash");
		s1.setEmail("akash.dg@mail.com");

		Student s2 = new Student();
		s2.setId(501);
		s2.setName("akash");
		s2.setEmail("akash.dg@mail.com");

		Student s3 = new Student();
		s3.setId(502);
		s3.setName("akash");
		s3.setEmail("akash.dg@mail.com");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		StudentDao studentDao = new StudentDao();
		studentDao.addMultipleStudents(al);

	}

}
