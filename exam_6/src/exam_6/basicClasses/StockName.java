package exam_6.basicClasses;

public enum StockName 
{

	DOODLE("Doodle"),
	HEADBOOK("Headbook"),
	BARVAZON("Barvazon");
	
	String title;
	
	StockName(String stockName) 
	{
		this.title = stockName;
	}
	public String getTitle() 
	{
		return title;
	}
	
	@Override
	public String toString()
	{
		return getTitle();
	}
	
}
