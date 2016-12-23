package info.spring.tutorial;

public class SomeBean {
	
	private int intValue;
	private String stringValue;
	private User user;

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	
	public int getIntValue() {
		return intValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	

}
