package info.spring.tutorial.repository;

import info.spring.tutorial.domain.User;

public interface UsersRepository {
	
	User createUser(String name, int age, String car);
//	void setLogger(Logger logger);

}
