package Q_2.projectClasses;


public class Room 
{	
	//Fields:
    private float width;
	private float length;
	private boolean hasAC;
	
	//Constructor
	public Room(float width, float length, boolean hasAC) 
	{
		super();
		this.width = width;
		this.length = length;
		this.hasAC = hasAC;
	}

	@Override
	public String toString() {
		return "Room [width=" + width + ", length=" + length + ", hasAC=" + hasAC + "]";
	}
	
}
