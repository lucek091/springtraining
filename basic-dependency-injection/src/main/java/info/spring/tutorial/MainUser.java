package info.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUser {
	public static void main(String[] args){
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("userContext.xml");
		User user=appContext.getBean("someUser", User.class);
		
		System.out.println(user);
		
	}

}
