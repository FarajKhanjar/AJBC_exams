package exam_6.mainApp;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import exam_6.basicClasses.Command;
import exam_6.basicClasses.Command.Operation;
import exam_6.basicClasses.Stock;
import exam_6.basicClasses.StocksDB;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvestingApp {
	private static List<Command> transactionsList = new ArrayList<>();
	private static float totalFundPrices = 0;
	private static final int NUM_OF_TRANSACTIONS = 12;
	private static final int NUM_Of_THREADS = 3;
	private static final float PRICE_BUY_INCREASE = 0.02f;
	private static final float PRICE_SELL_DECREASE = 0.01f;

	public static void runSystem() 
	{

		transactionsList = appDB.createListOfCommands();
		//transactionsList = appDB.addAIllegalArgumentTolist();
		System.out.println("Transactions list: ");
		appDB.printListValues();
	}

	public static String getTransactionsValue() 
	{
		return "Total funds prices= " + totalFundPrices;
	}

	protected static void transactionsUpdate() throws InterruptedException 
	{
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Callable<Float>> callablesList = new ArrayList<>();

		for (Command oneCommand : transactionsList) 
		{
			callablesList.add(() -> {
				float fundsPrice = 0;
				try {
					Stock stock = StocksDB.getStockByName(oneCommand.stockName);

					if (oneCommand.operation == Operation.BUY) {
						fundsPrice = stock.getBuyPrice();
						stock.addBuyPrice(fundsPrice + PRICE_BUY_INCREASE);
					} else {
						fundsPrice = stock.getSellPrice();
						stock.minusSellPrice(fundsPrice - PRICE_SELL_DECREASE);
					}
				} catch (IllegalArgumentException e) {
					System.err.println("We didnt fount this in the data base + [" + oneCommand.stockName + "]");
				}
				return fundsPrice;
			});
		}

		List<Future<Float>> futuresList;
		try 
		{
			futuresList = executorService.invokeAll(callablesList);

			for (Future<Float> future : futuresList) 
			{
				totalFundPrices += future.get();
			}
		} catch (ExecutionException e) {

			e.printStackTrace();
		}

		executorService.shutdown(); // gracefully shutdown
		executorService.awaitTermination(1, TimeUnit.SECONDS);
	}
}