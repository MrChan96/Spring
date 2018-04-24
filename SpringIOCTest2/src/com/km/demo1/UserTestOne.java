package com.km.demo1;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.km.service.UserService;

/**
 * Spring框架整合JUtil单元测试
 * 为了简化了JUnit的测试，使用Spring框架也可以整合测试
 * 具体步骤
 * 要求：必须先有JUnit的环境（即已经导入了JUnit4的开发环境）！！
 * 步骤一：在程序中引入:spring-test.jar
 * 步骤二：在具体的测试类上添加注解 
 * @author lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:applicationContext.xml") 
public class UserTestOne {
	
	@Test
	public void UserTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService  userService  = (UserService) ac.getBean("userService");
		userService.sayHello();
	}
	
	
	
	/**
	 * 如果想按名称注入
	 * @Qualifier -- 强制使用名称注入
	 * @Resource -- 相当于@Autowired和@Qualifier一起使用
	 * 如：@Resource(name="userService") 
	 */
	@Autowired  //默认按类型进行自动装配
	private UserService userService; 
	
	@Test
	public void UserTest2() {
		userService.sayHello();
	}

}
