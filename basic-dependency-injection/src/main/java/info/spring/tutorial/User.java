package info.spring.tutorial;

import java.util.Locale;

public class User {


	public Adress getAdress() {
		return adress;
	}


	public void setAdress(Adress adress) {
		this.adress = adress;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Locale getLocale() {
		return locale;
	}


	public void setLocale(Locale locale) {
		this.locale = locale;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private Adress adress;
	private int age;
	private Locale locale;
	private String name;
	
	public User(){}

	public User(int age, String name, Locale locale) {
		this.age = age;
		this.name = name;
		this.locale=locale;
	}


	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", locale=" + locale + ", adress=" + adress + "]";
	}


	

}
