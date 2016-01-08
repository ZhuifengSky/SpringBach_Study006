package com.main.user.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
 
/**
 * ledger––µƒ”≥…‰¿‡
 * @author Administrator
 *
 */
@Component("userMapper")
public class UserMapper implements RowMapper {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setSex(rs.getString("user_type"));
		user.setUserName(rs.getString("account_no"));
		return user;
	}
}

