package com.main.testBatch;

import org.springframework.batch.item.ItemProcessor;

import com.main.user.model.User;

/**
 * �������
 * Title:   MessageProcessor.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:55:43
 * @version  1.0
 */
public class UserProcessor implements ItemProcessor<User, User>{

	@Override
	public User process(User user) throws Exception {
		System.out.println("���ڴ���"+user.getUserName());
		return user;
	}
    //����һ���������  һ���������  
	 //Spring batch����ÿ��ֻ����һ����������ﵽд�ı�׼ͳһ�ύ��Writer
	

	
}
