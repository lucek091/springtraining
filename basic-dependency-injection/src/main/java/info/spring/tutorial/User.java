package info.spring.tutorial;

import java.util.Locale;

public class User {
	
/*	public static User getInstance(String name, int age){
		User user=new User();
		user.name=name;
		user.age=age;
		
		return user;
	}*/

	private int age;
	private String name;
	private Locale locale;

	public User(int age, String name, Locale locale) {
		this.age = age;
		this.name = name;
		this.locale=locale;
	}

/*	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	
//	private User(){}
	
/*	public void setName(String name) {
		this.name = name;
	}*/

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", locale=" + locale + "]";
	}
	
	

}
