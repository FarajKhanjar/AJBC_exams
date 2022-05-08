package exam_3.runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSave 
{
	public static void writeObjInfile(Object myObj)
	{
		try (FileOutputStream file = new FileOutputStream("myFiles/objFile.ser");
			ObjectOutputStream output = new ObjectOutputStream(file))
		{
			output.writeObject(myObj); //that I randomly selects
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	public static void readObjfromfile()
	{
		try (FileInputStream file = new FileInputStream("myFiles/objFile.ser");
				ObjectInputStream input = new ObjectInputStream(file))
				
		{
			Object obj1 = (Object) input.readObject();
					System.out.println(obj1);
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
