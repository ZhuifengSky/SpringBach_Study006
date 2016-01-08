package com.main.testBatch;

import org.springframework.batch.item.ItemProcessor;

/**
 * �������
 * Title:   MessageProcessor.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:55:43
 * @version  1.0
 */
public class MessageProcessor implements ItemProcessor<Users, Message>{
    //����һ���������  һ���������  
	 //Spring batch����ÿ��ֻ����һ����������ﵽд�ı�׼ͳһ�ύ��Writer
	@Override
	public Message process(Users item) throws Exception {
		Message m = new Message();
		m.setContent("Hello " + item.getUserName()
				+ ",please pay promptly at the end of this month.");
		return m;
	}

	
}
