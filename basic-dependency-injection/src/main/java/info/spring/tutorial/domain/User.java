package info.spring.tutorial.domain;

public class User {
	
	private String name;
	private int age;
	private String car;
	
	
	public User(String name, int age, String car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	public int getAge() {
		return age;
	}
	public String getCar() {
		return car;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
