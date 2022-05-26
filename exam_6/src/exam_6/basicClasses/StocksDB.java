package exam_6.basicClasses;

import java.util.HashMap;
import java.util.Map;

public class StocksDB 
{
	private final static Map<String, Stock> stocks = new HashMap<>() 
	{
		{
			put(StockName.DOODLE.name(), new Stock(StockName.DOODLE.name(), 3.72f, 3.6f));
			put(StockName.BARVAZON.name(), new Stock(StockName.BARVAZON.name(), 1.25f, 1f));
			put(StockName.HEADBOOK.name(), new Stock(StockName.HEADBOOK.name(), 9.52f, 9.33f));
		}
	};

	public static Stock getStockByName(String name) throws IllegalArgumentException
	{
		Stock stock = stocks.get(name.toUpperCase());
		if(stock==null)
			throw new IllegalArgumentException("Stock is not found in DB");
		return stock;
	}
	
	public static void getStockDetails() 
	{
		System.out.println(getStockByName("doodle"));
		System.out.println(getStockByName("barvazon"));
		System.out.println(getStockByName("headbook"));
	}

	@Override
	public String toString()
	{
		return "StocksDB ["+stocks+ "]\n";
	}
}