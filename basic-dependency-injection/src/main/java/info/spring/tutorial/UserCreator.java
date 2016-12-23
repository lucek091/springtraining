package info.spring.tutorial;

import java.util.logging.Logger;

public class UserCreator {
	
	Logger logger=Logger.getLogger(this.getClass().getName());
	
	public User createUser(String name, int age){
		logger.info("Tworzenie uzytkownika "+name+"w wieku: " +age);
		User user=new User();
		user.setName(name);
		user.setAge(age);
		return user;
	}

}
