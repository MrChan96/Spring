package com.km.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {

	@Test
	public void run1() {
	// 创建工厂，加载核心配置文件
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

	Student student = (Student) applicationContext.getBean("student");
		
		System.out.println(student);
	}
}
