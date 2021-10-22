package day5;

public class Inheritance {

	public static void main(String[] args) {
		//reference and object type is parent
		Company c=new Company();
		System.out.println(c.address);
		System.out.println(c.companyName);
		c.clients();
		c.project();
		System.out.println();
		
		//reference and object type cis child
		Employee e=new Employee();
		System.out.println(e.employeeId);
		System.out.println(e.pId);
		System.out.println(e.address);
		System.out.println(e.companyName);
		e.code();
		e.test();
		e.clients();
		e.project();
		System.out.println();
		
		//reference is parent and object type is child
		Company c1=new Employee();
		System.out.println(c1.companyName);
		c1.clients();
		c1.project();
		
		Person p=new Person();
		System.out.println(p.employeeId);
		System.out.println(p.address);
		p.clients();
		Address addr=new Address("kar","ban");
		Employee emp=new Employee("cap","bangalore","e41",112,addr);
		
		System.out.println(emp);
		
		
		}
		
		
		
		/*
		// Without inheritance
		Company comp = new Company();
		System.out.println(comp.ncompanyName);
		System.out.println(comp.address);
		
		comp.clients();
		comp.project();
		
		System.out.println();
		Employee em= new Employee();
		System.out.println(em.employeeId);
		System.out.println(em.pId);	
		em.code();
		em.test();
		
		*/

	

}
