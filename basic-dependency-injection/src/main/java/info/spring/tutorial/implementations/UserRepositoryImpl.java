package info.spring.tutorial.implementations;

import info.spring.tutorial.domain.User;
import info.spring.tutorial.repository.Logger;
import info.spring.tutorial.repository.UsersRepository;

public class UserRepositoryImpl implements UsersRepository{
	
	private Logger logger;

	public User createUser(String name, int age, String car) {
		logger.log("Tworzenie uzytkownika "+name+", wiek: "+age+", samochod: "+car);
		return new User(name, age, car);
	}

	public void setLogger(Logger logger) {
		this.logger=logger;
	}

}
