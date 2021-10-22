package day5;

public class Company {
	String companyName;
	String address;
	
	Company(){
		
	}
	
	public Company(String companyName, String address) {
		super();
		this.companyName = companyName;
		this.address = address;
	}
	
	
	void project() {
		System.out.println("project");
	}
	void clients() {
		System.out.println("clients");
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", address=" + address + "]";
	}
}
