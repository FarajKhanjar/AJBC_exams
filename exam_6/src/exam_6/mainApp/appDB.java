package exam_6.mainApp;

import java.util.ArrayList;
import java.util.List;

import exam_6.basicClasses.Command;
import exam_6.basicClasses.Command.Operation;
import exam_6.basicClasses.StockName;
import exam_6.basicClasses.StocksDB;

public class appDB 
{
	static 	List<Command> list = new ArrayList<>();
	private static final int  SIZE=12;
	
	protected static List<Command> createListOfCommands()
	{
		 Command command_1 = new Command(StockName.DOODLE.toString(), Operation.BUY);
		 Command command_2 = new Command(StockName.BARVAZON.toString(), Operation.BUY);
		 Command command_3 = new Command(StockName.HEADBOOK.toString(), Operation.SELL);
		 Command command_4 = new Command(StockName.BARVAZON.toString(), Operation.SELL);
		 Command command_5 = new Command(StockName.HEADBOOK.toString(), Operation.SELL);
		 Command command_6 = new Command(StockName.DOODLE.toString(), Operation.BUY);
		 Command command_7 = new Command(StockName.DOODLE.toString(), Operation.BUY);
		 Command command_8 = new Command(StockName.BARVAZON.toString(), Operation.BUY);
		 Command command_9 = new Command(StockName.HEADBOOK.toString(), Operation.SELL);
		 Command command_10 = new Command(StockName.BARVAZON.toString(), Operation.BUY);
		 Command command_11 = new Command(StockName.DOODLE.toString(), Operation.SELL);
		 Command command_12 = new Command(StockName.HEADBOOK.toString(), Operation.BUY);
				 
		 list.add(command_1);
		 list.add(command_2);
		 list.add(command_3);
		 list.add(command_4);
		 list.add(command_5);
		 list.add(command_6);
		 list.add(command_7);
		 list.add(command_8);
		 list.add(command_9);
		 list.add(command_10);
		 list.add(command_11);
		 list.add(command_12);

		 return list;	
	}
	
	protected static void printListValues() 
	{
		int index = 1;
		
		for (Command oneCommand : list) 
		{
			if(index==SIZE)
				System.out.println(index + ")" + oneCommand);
			else
			System.out.println(index + ") " + oneCommand);
			index++;
		}	
	}
	
	protected static List<Command> addAIllegalArgumentTolist()
	{			
		 list.add(new Command("JavaJava", Operation.BUY));
	     System.out.println(StocksDB.getStockByName(list.get(SIZE).stockName));
		 return list;	
	}
}