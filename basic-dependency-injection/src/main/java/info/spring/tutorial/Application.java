//package info.spring.tutorial;
//
//import info.spring.tutorial.implementations.LoggerImpl;
//import info.spring.tutorial.implementations.UserRepositoryImpl;
//import info.spring.tutorial.repository.Logger;
//import info.spring.tutorial.repository.UsersRepository;
//
//public class Application {
//
//	public static void main(String[] args) {
//		
//		Logger tryLogger=new LoggerImpl();
//		tryLogger.setLoggerName("Loggernumer1");
//		UsersRepository usersRepository=new UserRepositoryImpl();
//		
//		usersRepository.setLogger(tryLogger);
//		usersRepository.createUser("Lukasz", 23, "mercedes");
//
//	}
//
//}
