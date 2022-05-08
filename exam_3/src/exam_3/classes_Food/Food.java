package exam_3.classes_Food;

public class Food 
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
	public String toString() {
		return "Food [name=" + name + ", taste=" + taste + ", category=" + category + "]";
	}
	
	
	

}
