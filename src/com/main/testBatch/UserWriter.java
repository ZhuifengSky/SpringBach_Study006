package com.main.testBatch;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.main.user.model.User;
import com.main.user.service.IUserService;

/**
 * 写入方法
 * Title:   MessageItemWriter.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月31日下午2:52:42
 * @version  1.0
 */
public class UserWriter implements ItemWriter<User>{

	@Resource
	private IUserService userServiceImpl;
	
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("write results");
		for (User user : users) {
			userServiceImpl.saveUser(user);
		}

	}

	

}
