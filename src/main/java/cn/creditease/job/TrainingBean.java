package cn.creditease.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

@Repository
public class TrainingBean {
	private int i = 0;
	public void methodA() {
		while (i++ < 10) {
			System.out.println("==============Time:" + i);
		}
	}
	
	@Scheduled(fixedDelay=5000)
	public void doSomething() {
		System.out.println("注解方式执行。。。");
	}
}
