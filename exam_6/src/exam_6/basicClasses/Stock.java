package exam_6.basicClasses;

public class Stock 
{
	private String name;
	private float buyPrice;
	private float sellPrice;
	
	public Stock(String name, float buyPrice, float sellPrice) 
	{
		setName(name);
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	
	private void setName(String name) 
	{
		if(StockName.valueOf(name.toUpperCase()) != null) //throws IllegalArgumentException
		{   
			this.name=name;
		}
	}
	
	public void addBuyPrice(float addition) 
	{
		this.buyPrice += addition;
	}

	public void minusSellPrice(float decrease) 
	{
		this.sellPrice -= decrease;
	}
	public float getBuyPrice() 
	{
		return buyPrice;
	}

	public float getSellPrice() 
	{
		return sellPrice;
	}

	@Override
	public String toString() 
	{
		return "Stock [name=" + name + ", buyPrice=" + buyPrice + ", sellPrice=" + sellPrice + "]";
	}
	
//	public static void main(String[] args) 
//	{
//		Stock stock = new Stock("doodle", 3.0, 4.0);
//		System.out.println(stock);
//	}
}
