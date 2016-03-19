package com.sheremet.spring.EhCacheSimple;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int index);
}
