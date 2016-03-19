package com.sheremet.spring.EhCacheSimple;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		WorkWithStudents worker1 = 
				(WorkWithStudents) context.getBean("worker");
		WorkWithTeacher worker2 = 
				(WorkWithTeacher) context.getBean("teachersWorker");
		Student student = worker1.getStudentById(1);
		System.out.println(student);
		student = worker1.getStudentById(1);
		System.out.println(student);
		Teacher teacher = worker2.getTeacherById(1);
		System.out.println(teacher);
		teacher = worker2.getTeacherById(1);
		System.out.println(teacher);

	}

}
