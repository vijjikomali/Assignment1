

/**
 * Create a Custom Class (anything you want - car, phone, holiday, etc.).
 * Requirements:
 * Minimum 3 private instance variables
 * An empty constructor
 * A constructor that uses only 2 of your 3 variables
 * A constructor that uses all 3 of your instance variables
 * Get methods for all 3 of your instance variables
 * Set methods for all 3 of your instance variables
 * A method that returns a Boolean
 * A method that returns a String
 * @author vijji
 *
 */
public class Phone {
	
	String phoneNum = null;
	boolean isLandline = false;
	String registeredPerson = null;
	
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean isLandline() {
		return isLandline;
	}

	public void setLandline(boolean isLandline) {
		this.isLandline = isLandline;
	}

	public String getRegisteredPerson() {
		return registeredPerson;
	}

	public void setRegisteredPerson(String registeredPerson) {
		this.registeredPerson = registeredPerson;
	}



	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone(String phoneNum, String owner) {
		this.phoneNum = phoneNum;
		this.registeredPerson = owner;
	}
	
	public Phone(String phoneNum, boolean landline, String owner) {
		this.phoneNum = phoneNum;
		this.registeredPerson = owner;
		this.isLandline = landline;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone landlinePhone = new Phone("248-212-0366", true, "Vijaya Komali");
		
		Phone mobilePhone = new Phone("408-603-1945", "Vijaya Komali");
		mobilePhone.setLandline(false);
		
		System.out.println("Landline Phone Details:");
		System.out.println("Phone # " + landlinePhone.getPhoneNum());
		System.out.println("Name - " + landlinePhone.getRegisteredPerson());
		System.out.println("Landline ? -> "+ landlinePhone.isLandline());
		
		

		System.out.println("Mobile Phone Details:");
		System.out.println("Phone # " + mobilePhone.getPhoneNum());
		System.out.println("Name - " + mobilePhone.getRegisteredPerson());
		System.out.println("Landline ? -> "+ mobilePhone.isLandline());
		
		
		
		
		

	}

}
