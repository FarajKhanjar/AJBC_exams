package exam_6.mainApp;

import java.util.concurrent.ExecutionException;

import exam_6.basicClasses.StocksDB;

public class Runner 
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		//====================[Q1-Q4]======================
	/*	StocksDB myDataBase = new StocksDB();
		
		Stock stock = new Stock("foofle", 3.0, 4.0);
		System.out.println(stock);

		System.out.println(StocksDB.getStockByName("doodle"));
		System.out.println(StocksDB.getStockByName("foofle"));
		
		System.out.println(myDataBase.toString());
	*/	
		
		//====================[Q5+Q6]======================
		InvestingApp.runSystem();
		System.out.println("Basic types and details of Stock:\n");
		StocksDB.getStockDetails();
		System.out.println(InvestingApp.getTransactionsValue());
		
		//====================[Q7-10]======================
		System.out.println("\nAfter deal with transaction command:");
		InvestingApp.transactionsUpdate();
		StocksDB.getStockDetails();
		System.out.println(InvestingApp.getTransactionsValue());
	}
}