package Q_2.projectClasses;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class House 
{
	@SerializedName("address")
    private Address address;
	private List<Room> rooms = new ArrayList<>();
	private boolean hasYard;
	private boolean hasBasement;
	private float area;
	
	//Constructor
	public House(Address address, List<Room> rooms, boolean hasYard, boolean hasBasement, float area) 
	{
		this.address = address;
		this.rooms = rooms;
		this.hasYard = hasYard;
		this.hasBasement = hasBasement;
		this.area = area;
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", rooms=" + rooms + ", hasYard=" + hasYard + ", hasBasement="
				+ hasBasement + ", area=" + area + "]";
	}
	
}