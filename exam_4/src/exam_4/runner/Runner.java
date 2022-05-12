package exam_4.runner;

import java.util.ArrayList;
import java.util.List;

import exam_4.classes.Tent;

public class Runner 
{
	static List<Tent> tentsList = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		createAllTentsList();
		createCopyListAndSortedByArea();
		
	}
	
	public static void createAllTentsList()
	{
		tentsList.add(new Tent(5,2.5f,2f,3f));
		tentsList.add(new Tent(4,3f,2.5f,3f));
		tentsList.add(new Tent(10,6f,5.5f,2f));
		tentsList.add(new Tent(5,5.5f,2f,2.5f));
		tentsList.add(new Tent(7,3.5f,4f,3f));
		tentsList.add(new Tent(10,2.5f,2f,3f));
		tentsList.add(new Tent(3,1.5f,3f,3f));
		tentsList.add(new Tent(2,1f,2f,2f));
		tentsList.add(new Tent(3,1.5f,2f,3f));
		tentsList.add(new Tent(4,2f,2.5f,2.5f));	
	}
	
	public static List<Tent> createAllTentsList(List<Tent> orginalList)
	{
	
	}

}
