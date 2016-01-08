package com.main.testBatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * 
 * Title:   UserMapper.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:50:19
 * @version  1.0
 */
public class UserMapper implements FieldSetMapper<Users>{

	
   //�÷����������ǽ����������ݷ�װ��������
	//��װΪ����
	@Override
	public Users mapFieldSet(FieldSet fs) throws BindException {
		Users u = new Users();
		u.setUserName(fs.readString(0));
		u.setAge(fs.readInt(1));
		return u;
	}

}
