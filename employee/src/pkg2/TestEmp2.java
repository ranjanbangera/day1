package pkg2;
import pkg1.Employee;

public class TestEmp2 {

	public static void main(String[] args) {
		System.out.println("main");
		Employee emp1=new Employee();
		System.out.println(emp1.getname());
		System.out.println(emp1.getempId());
		System.out.println(emp1.getage());
		System.out.println(emp1.getcontactNo());
		
		emp1.setname("kavya");
		emp1.setage(24);
		
		System.out.println(emp1.getname());
		System.out.println(emp1.getage());
		System.out.println(emp1);
		
	}

}
