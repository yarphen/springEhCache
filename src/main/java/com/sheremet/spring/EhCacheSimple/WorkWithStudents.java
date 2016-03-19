package com.sheremet.spring.EhCacheSimple;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
	@Autowired
	private StudentsDao studentsDao;
	public void saveStudentToDb(Student student){
		if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
			studentsDao.addStudent(student);
			System.out.println("Student have been saved "+student);
		}
	}
	public Student getStudentById(int i){
		return studentsDao.getStudentById(i);
	}
}
