package exam_3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import exam_3.classes_Food.Category;
import exam_3.classes_Food.Food;
import exam_3.classes_Food.Taste;

@TestInstance(Lifecycle.PER_METHOD)
class FoodTest 
{
	private Food[] foods = new Food[4];

	public FoodTest() 
	{
		foods[0] = new Food("Salmon",Taste.Sour,Category.Fat);
		foods[1] = new Food("Burger",Taste.Sweet,Category.Protein);
		foods[2] = new Food("KFC",Taste.Salty,Category.Protein);
		foods[3] = new Food("IceCream",Taste.Sweet,Category.CarboHydrate);
	
	}

	@Test
	void checkIfArrayIsNotNull() 
	{
		assertNotNull(foods[0]);
		assertNotNull(foods[1]);
		assertNotNull(foods[2]);
		assertNotNull(foods[3]);
	}
	
	@Test
	void checkFoodIsDesertMethod() 
	{
		         //(expectedValue,actualValue)
		assertEquals(false, foods[0].isDesert());
		assertEquals(false, foods[1].isDesert());
		assertEquals(false, foods[2].isDesert());
		assertEquals(true, foods[3].isDesert());
	}
	
	/*@Test
	void checkFoodSetNameMethod() 
	{
		         //(expectedValue,actualValue)
		assertEquals("pizza", foods[0].setName("pizza"));
		assertEquals("Pizza", foods[1].setName("Pizza"));
		assertEquals("coocize", foods[2].setName("coocize"));
		assertEquals("Fries", foods[3].setName("Fries"));
	}
	*/
	
	@Test
	void exceptionIsThrown() 
	{
		assertThrows(IOException.class, ()-> NonCapatilizedException());
	}

	void NonCapatilizedException() throws IOException
	{
		throw new IOException();
	}
	
	
}
