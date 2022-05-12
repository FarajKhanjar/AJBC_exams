package exam_4.classes;

public class Tent 
{
	//Fields:
	private int numPeople;
	private float width;
	private float length;
	private float height;
	
	//Constructor:
	public Tent(int numPeople, float width, float length, float height) 
	{
		this.numPeople = numPeople;
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	


	
	@Override
	public String toString() 
	{
		return "Tent [numPeople=" + numPeople + ", width=" + width + ", length=" + length + ", height=" + height + "]";
	}



	public double  getAreaOfTent()
	{
		return length*width;
	}

	public float getHeight() {
		// TODO Auto-generated method stub
		return height;
	}



	public int getNumPeople() {
		// TODO Auto-generated method stub
		return numPeople;
	}
	
	

	
	
	

}
