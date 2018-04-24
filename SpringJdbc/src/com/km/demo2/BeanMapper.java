package com.km.demo2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 自己手动的来封装数据（一行一行封装数据）
 * @author Administrator
 */
class BeanMapper implements RowMapper<Account>{
	
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {

		Account ac = new Account();
		ac.setId(rs.getInt("id"));
		ac.setName(rs.getString("name"));
		ac.setMoney(rs.getDouble("money"));
		return ac;
	}
}
