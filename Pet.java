


public class Pet {
	private String name;
	int age;
	private String location;
	
	private String type;
	
	
	public Pet() {
		
	}
	
	public Pet(String n) {
		name = n;
		
	}
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	
	public void setName(String n)
	{
		name = n;
		
		return;
		
	}
	
	
	public String  getName()
	{
		
		return name;
		
	}
	
	
	public void setAge(int a) {
		age = a;
		return;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet dog = new Pet();
		Pet cat = new Pet("jackie");
		
		dog.setName("sunny");
		dog.setAge(5);
		dog.setLocation("18317 Liliiesleaf");
		dog.setType("American");
		
		
		cat.setAge(2);
		
	
		System.out.println("Dog details....");
		System.out.println("Name -> " + dog.getName());
		System.out.println("Age -> " + dog.getAge());
		System.out.println("Type -> " + dog.getType());
		System.out.println("Location -> " + dog.getLocation());
		
		
		
		
		
		

	}

}
