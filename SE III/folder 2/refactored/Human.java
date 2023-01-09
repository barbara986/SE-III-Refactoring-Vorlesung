package refactored;
// Refactoring technique: Extract Class, Move Method, Hide Delegate
public class Human {
	public String name;
	public String age;
    private Address address = new Address();

	public String getFullAddress() { 
		return address.getFullAddress();
	}

 }
