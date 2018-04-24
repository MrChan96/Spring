package com.km.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




/**
 * 演示JDBC的几基本的模板类 
 * @author lenovo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {
	/**
	 * 演示模板类
	 * @Test JUnit4
	 */
	@Test
	public void run1() {
		// Spring框架提供了内置的连接池，不想使用内置，整合其他的连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day03");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// 创建模板类
		JdbcTemplate template = new JdbcTemplate();

		// 设置连接池
		template.setDataSource(dataSource);

		// 完成操作
		template.update("insert into t_account values (null,?,?)", "我是MrChan", 10000);

	}
}
