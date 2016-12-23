package info.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.spring.tutorial.domain.User;
import info.spring.tutorial.repository.UsersRepository;

public class ApplicationSpring {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UsersRepository userRepository = appContext.getBean("userRepositorium", UsersRepository.class);
		
		User lukasz = userRepository.createUser("Lukasz", 23, "mercedes");
		
	}

}
