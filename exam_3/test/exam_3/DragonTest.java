package exam_3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exam_3.classes_Dragon.Dragon;
import exam_3.classes_Food.Category;
import exam_3.classes_Food.Food;
import exam_3.classes_Food.Taste;

class DragonTest 
{

	private Dragon[] dragons = new Dragon[3];


	public DragonTest() 
	{
		dragons[0] = new Dragon("myManster",LocalDate.of(700, 5, 7),10f);
		dragons[1] = new Dragon("Lord",LocalDate.of(450, 5, 7),8f);
	}
	
	@Test
	void checkIfArrayIsNotNull() 
	{
		assertNotNull(dragons[0]);
		assertNotNull(dragons[1]);
	}
	
	@Test
	void exceptionIsThrown() 
	{
		assertThrows(IOException.class, ()-> TooYoungException());
	}

	void TooYoungException() throws IOException
	{
		throw new IOException();
	}

}
