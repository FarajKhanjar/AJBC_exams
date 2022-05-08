package exam_3.classes_Food;

public class NonCapatilizedException extends Exception 
{
	public NonCapatilizedException() 
	{
		super("the name of the food doesn't start with a capital letter.");		
	}

}
