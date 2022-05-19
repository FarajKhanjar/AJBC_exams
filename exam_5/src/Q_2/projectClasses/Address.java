package Q_2.projectClasses;

public class Address 
{
	//Fields:
    private String street;
    private int number;
    private String state;
    private String city;
	
    //Constructor
    public Address(String street, int number, String state, String city) 
    {
		this.street = street;
		this.number = number;
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", state=" + state + ", city=" + city + "]";
	}
    
}