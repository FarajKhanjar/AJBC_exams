package exam_6.basicClasses;

public class Command 
{

	public String stockName;
	public Operation operation;
	
	public Command(String stockName, Operation operation) 
	{
		this.stockName = stockName;
		this.operation = operation;
	}
	
	public static enum Operation
	{
		BUY, SELL;
	}

	@Override
	public String toString() {
		return "Command [stockName=" + stockName + ", operation=" + operation + "]";
	}
	
	
	
	
}
