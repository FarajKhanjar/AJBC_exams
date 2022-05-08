package exam_3.runner;

import java.time.LocalDate;

import exam_3.classes_Dragon.Dragon;
import exam_3.classes_Food.Category;
import exam_3.classes_Food.Food;
import exam_3.classes_Food.Taste;

public class Runner {

	public static void main(String[] args) 
	{
		Food food_1 = new Food("Chocolate",Taste.Sweet,Category.CarboHydrate);
		Food food_2 = new Food("Yogurt",Taste.Bitter,Category.Protein);
		
		Dragon dragon_1 = new Dragon("Droogo",LocalDate.of(1000, 12, 20),5f);
		Dragon dragon_2 = new Dragon("Droogo",LocalDate.of(500, 5, 7),8.5f);
		
		System.out.println(food_1);
		System.out.println(food_1);
		
		System.out.println(dragon_1);
		System.out.println(dragon_2);
		
	}
	

}
