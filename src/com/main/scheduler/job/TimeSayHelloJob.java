package com.main.scheduler.job;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.user.model.User;
import com.main.user.service.IUserService;


public class TimeSayHelloJob{


	protected void execute(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/main/config/applicationContext.xml");
		IUserService userServiceImpl = (IUserService) context.getBean("userServiceImpl");
		List<User> s = userServiceImpl.searchUser(null);
		for (User user : s) {
			System.out.println(user.getUserName()+"--------");
		}
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/main/config/callPay.xml");		
		JobLauncher jobLauncher = (JobLauncher) context1.getBean("jobLauncher");
		Job job = (Job) context1.getBean("callPay");
		JobExecution execution = null;
		try {
			execution = jobLauncher.run(job, new JobParameters());
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(execution.toString());
		System.out.println("Exit Status : " + execution.getStatus());
		System.out.println("Done");
	}

}
