package springIntro;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//manager.add();
		
		
		
		

	
	
	}
	//IoC - Inversion of Control
	//Dependency Injection
}
