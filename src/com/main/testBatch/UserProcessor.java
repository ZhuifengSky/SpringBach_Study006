package com.main.testBatch;

import org.springframework.batch.item.ItemProcessor;

import com.main.user.model.User;

/**
 * 处理过程
 * Title:   MessageProcessor.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月31日下午2:55:43
 * @version  1.0
 */
public class UserProcessor implements ItemProcessor<User, User>{

	@Override
	public User process(User user) throws Exception {
		System.out.println("正在处理"+user.getUserName());
		return user;
	}
    //定义一个输入对象  一个输出对象  
	 //Spring batch定义每次只处理一个。当结果达到写的标准统一提交给Writer
	

	
}
