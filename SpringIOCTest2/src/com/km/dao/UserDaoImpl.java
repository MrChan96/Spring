package com.km.dao;

import org.springframework.stereotype.Repository;

/**
 * @Component提供了三个衍生注解
 * @Controller -- 作用在WEB层
 * @Service -- 作用在业务层
 * @Repository -- 作用在持久层
 * 这三个注解是为了让标注类本身的用途清晰，Spring在后续版本会对其增强
 * @author lenovo
 *
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{


		public void save() {
			System.out.println("保存客户、、、");

		}

}
