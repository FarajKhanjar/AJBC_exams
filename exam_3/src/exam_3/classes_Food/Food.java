package exam_3.classes_Food;

import java.io.Serializable;

public class Food implements Serializable
{
	//Fields
	protected String name;
	protected Taste taste;
	protected Category category;
	
	//Constructor
	public Food(String name, Taste taste, Category category) 
	{
		this.name = name;
		this.taste = taste;
		this.category = category;
	}

	@Override
	public String toString() 
	{
		return "Food [name=" + name + ", taste=" + taste + ", category=" + category + "]";
	}
	
	/**
	 * method isDesert that returns true if the food is a sweet carbohydrate.
	 */
	public boolean isDesert()
	{
		if(taste==taste.Sweet && category==category.CarboHydrate)
			return true;
		else
			return false;
	}

	public void setName(String name) throws NonCapatilizedException
	{
		Character theFirstLetterInName = name.charAt(0);
		if(Character.isUpperCase(theFirstLetterInName))
		{
			this.name = name;
		}
		else
		{
			throw new NonCapatilizedException();
		}
		
	}
	
	

}
