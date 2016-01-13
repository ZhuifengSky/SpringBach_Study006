package com.main.testBatch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.BindException;

import com.main.user.model.User;

/**
 * 
 * Title:   UserMapper.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:50:19
 * @version  1.0
 */
public class UserMapper implements RowMapper<User>{

	
   /*//�÷����������ǽ����������ݷ�װ��������
	//��װΪ����
	@Override
	public User mapFieldSet(FieldSet fs) throws BindException {
		User u = new User();
		u.setUserName(fs.readString(0));
		u.setSex(fs.readString(1));
		return u;
	}*/

@Override
public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	User user = new  User();   
	user.setUserName(rs.getString("STUDENTNAME" ));
	user.setSex(rs.getString("AGE"));
 
     return  user;        
}

}
