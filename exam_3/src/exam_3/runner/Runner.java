package exam_3.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exam_3.classes_Dragon.Dragon;
import exam_3.classes_Dragon.TooYoungException;
import exam_3.classes_Food.Category;
import exam_3.classes_Food.Food;
import exam_3.classes_Food.NonCapatilizedException;
import exam_3.classes_Food.Taste;

public class Runner 
{

	public static void main(String[] args) throws TooYoungException
	{
		Food food_1 = new Food("Chocolate",Taste.Sweet,Category.CarboHydrate);
		Food food_2 = new Food("Yogurt",Taste.Bitter,Category.Protein);
		
		Dragon dragon_1 = new Dragon("Droogo",LocalDate.of(450, 12, 20),5f);
		Dragon dragon_2 = new Dragon("BigFire",LocalDate.of(300, 5, 7),8.5f);
				
		 // create a list of the 4 type of objects
        List<Object> list = new ArrayList<>();
        list.add(food_1);
        list.add(food_2);
        list.add(dragon_1);
        list.add(dragon_2);
        randAndSendToSaveClass(list); //first random object
        randAndSendToSaveClass(list); //second random object
        
        
       // ============[Question 2]===============
        
        System.out.println(food_1.isDesert());
        System.out.println(food_2.isDesert());
        
     
        
       //Working try:
     /*   try 
        {
			food_2.setName("Apple");
		} 
        catch (NonCapatilizedException e) 
        {
			e.printStackTrace();
		}
     */   
               
      //Error try:
        try 
        {
        	food_1.setName("banana");
		} 
        catch (NonCapatilizedException e) 
        {
			System.out.println(e);
		}
        
        
      //Working try:
        LocalDate myChangingBirthday_1 = LocalDate.of(500, 10, 8);
        dragon_1.setBirthDay(myChangingBirthday_1);
        
      //Error try:
      //  LocalDate myChangingBirthday_2 = LocalDate.of(1500, 10, 8);
      //  dragon_1.setBirthDay(myChangingBirthday_2);
        		
	}
	
	public static void randAndSendToSaveClass(List<Object> list) 
	{
		Random rand = new Random();
		System.out.println("Randomly selects 1 out of the 4 objects:");
        Object randObj = (list.get(rand.nextInt(list.size())));
        //System.out.println(randObj);
        ObjectSave.writeObjInfile(randObj);
        readObjFromFile();		
	}
	
	public static void readObjFromFile() 
	{
        ObjectSave.readObjfromfile();		
	}
	

}
