package day5;

public class Address {
	String state;
	String city;
	
	Address(){
	}
	
	
	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	

}
