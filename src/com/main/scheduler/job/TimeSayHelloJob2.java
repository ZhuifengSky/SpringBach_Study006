package com.main.scheduler.job;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.main.user.model.User;
import com.main.user.service.IUserService;


public class TimeSayHelloJob2 extends QuartzJobBean{


	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		Map dataMap = context.getJobDetail().getJobDataMap();
		ApplicationContext ctx = (ApplicationContext) dataMap.get("applicationContext");
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("com/main/config/callPay.xml");	*/	
		/*IUserService userServiceImpl = (IUserService) ctx.getBean("userServiceImpl");
		List<User> s = userServiceImpl.searchUser(null);
		for (User user : s) {
			System.out.println(user.getUserName()+"--------");
		}		*/
		JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher");
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		Job job = (Job) ctx.getBean("callPay");
		JobExecution execution = null;
		try {
			execution = jobLauncher.run(job, jobParametersBuilder.addDate("nowDate", new Date()).toJobParameters());
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
			e.printStackTrace();
		}
		System.out.println(execution.toString());
		System.out.println("Exit Status : " + execution.getStatus());
		System.out.println("Done");
		
	}

}
