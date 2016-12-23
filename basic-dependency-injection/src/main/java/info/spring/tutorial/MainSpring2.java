package info.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring2 {
	public static void main(String[] args){
		ApplicationContext appContext=new ClassPathXmlApplicationContext("context11.xml");
		User user1 = appContext.getBean("newUser", User.class);
		
		System.out.println(user1);
		
	}

}
