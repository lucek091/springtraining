package info.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("beanContext.xml");
		SomeBean user = appContext.getBean("someBean", SomeBean.class);
		SomeBean user2 = appContext.getBean("someBean2", SomeBean.class);
		
		System.out.println(user.getStringValue());
		System.out.println(user2.getStringValue());
	}

}
