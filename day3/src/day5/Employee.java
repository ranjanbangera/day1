package day5;

public class Employee extends Company{
	String employeeId;
	int pId;
	
	Address addresss;
	
	Employee(){
		
	}
	
	public Employee(String employeeId, int pId, Address addresss) {
		super();
		this.employeeId = employeeId;
		this.pId = pId;
		this.addresss = addresss;
		
	
	}
	public Employee(String companyName,String address,String employeeId, int pId, Address addresss) {
		super(companyName,address);
		this.employeeId = employeeId;
		this.pId = pId;
		this.addresss = addresss;
	}

	void code() {
		System.out.println("code");
		
	}
	void test() {
		System.out.println("test");
	}
	void clients() {
		System.out.println("child clients");
	}
	void project() {
		System.out.println("child project");
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", pId=" + pId + ", addresss=" + addresss + "]";
	}
	
}
