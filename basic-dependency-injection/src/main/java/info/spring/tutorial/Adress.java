package info.spring.tutorial;

public class Adress {
	@Override
	public String toString() {
		return "Adress [locality=" + locality + ", zipCode=" + zipCode + ", street=" + street + ", streetNumber="
				+ streetNumber + "]";
	}


	private String locality;
	private String zipCode;
	private String street;
	private String streetNumber;
	
	
	public Adress(String locality, String zipCode, String street, String streetNumber) {
		this.locality = locality;
		this.zipCode = zipCode;
		this.street = street;
		this.streetNumber = streetNumber;
	}

}
