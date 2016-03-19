package com.sheremet.spring.EhCacheSimple;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.ehcache.annotations.Cacheable;
@Repository
public class HibernateTeacherDao implements TeachersDao{
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	public void addTeacher(Teacher teacher) {
		currentSession().save(teacher);
	}
	@Cacheable(cacheName = "teachersCache")
	public Teacher getTeacherById(int id) {
		System.out.println("Teacher with id="+id+" have been returned.");
		return (Teacher) currentSession().get(Teacher.class, id);
	}
	public void saveTacher(Teacher teacher) {
		currentSession().update(teacher);
	}
}
