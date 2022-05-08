package exam_3.classes_Dragon;

public class TooYoungException extends Exception 
{
	public TooYoungException() 
	{
		super("The dragon birthdate is after 8/8/888");
	}
}
