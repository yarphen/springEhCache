package com.sheremet.spring.EhCacheSimple;

public interface TeachersDao {
	void addTeacher(Teacher teacher);
	Teacher getTeacherById(int id);
	void saveTacher(Teacher teacher);
}
