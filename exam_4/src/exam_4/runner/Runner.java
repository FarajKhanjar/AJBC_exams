package exam_4.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam_4.classes.Tent;

public class Runner 
{
	static final int SIZE = 10;
	static final int NUM_OF_PEOPLE = 6 ;
	static LinkedList<Tent> tentsList = new LinkedList<Tent>();
	static List<Tent> tentsAreasSorted = new ArrayList<>(SIZE);
	static List<Tent> tentsPeopleSorted = new ArrayList<>(SIZE);

	public static void main(String[] args) 
	{

		createAllTentsList();
		System.out.println("The Orginal Tents List:");
		printListValues();	
		
		System.out.println("\nThe Tents List sorted by areas:");
		tentsAreasSorted = tentsListAreaSort();
		tentsAreasSorted.forEach(oneTent -> System.out.println(oneTent));
		printMaximumArea();
		
		//printListValues();	//test of original sort. 
		
		//Q3:
		System.out.println("\nThe Tents List from "+NUM_OF_PEOPLE+" people (the minimum), till the maximum number of people in tent:");
		tentsPeopleSorted = sortTentsListByNumberOfPeople(NUM_OF_PEOPLE);
		tentsPeopleSorted.forEach(oneTent -> System.out.println(oneTent));
		printMaxHighCheck(); 
		
		//Q4:
		Map<Float,List<Tent>> myMap = getListsByHeight();
		myMap.forEach((key,list) -> {System.out.println("\nTents with height = "+ key);
		list.forEach(System.out::println);
		});
		
		//Q5:
		System.out.println("\nThe Tents in the range:");
		List<Tent> rangeList = myRange(myMap,10f,3f);
		rangeList.forEach(oneTent->System.out.println(oneTent));
		

		
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
	
	public static List<Tent> tentsListAreaSort()
	{

		List<Tent> resultList = tentsList.stream().sorted((a,b)->(int)a.getAreaOfTent()-(int)b
				                .getAreaOfTent()).toList();
		
		return resultList;
	}
	
	private static void printListValues() 
	{
		int index = 1;
		
		for (Tent oneTent : tentsList) 
		{
			if(index==SIZE)
				System.out.println(index + ")" + oneTent);
			else
			System.out.println(index + ") " + oneTent);
			index++;
		}	
	}
	
	private static void printMaximumArea()
	{
		System.out.println("The maximum Aria is:  "+ tentsAreasSorted.get(SIZE-1).getAreaOfTent() + " :)");
	
	}
	
	public static List<Tent> sortTentsListByNumberOfPeople(int peopleNumInTent)
	{
		List<Tent> resultList =  tentsList.stream().filter(tent->tent.getNumPeople() >= peopleNumInTent)
                                 .sorted((a, b) -> a.getNumPeople()-b.getNumPeople() ).toList();		
		return resultList;
	}
	
	
	private static void printMaxHighCheck() 
	{
		int index = 1;
		System.out.println();
		for (Tent oneTent : tentsList) 
		{
			System.out.println("Does Tent #"+index + ", [that it hight is: "+oneTent.getHeight()+"] the max height in list?? " + checkTheHighTentMax(oneTent));
			index++;
		}	
	}
	
	private static boolean checkTheHighTentMax(Tent currentMax)
	{
		Tent maxTentHighInList = Collections.max(tentsList, (tent1, tent2) -> Double.compare(tent1.getHeight(), tent2.getHeight()));
		return maxTentHighInList.getHeight() == currentMax.getHeight();
	}
	
	
    public static Map<Float, List<Tent>> getListsByHeight()
    {
		Set<Float> oneTentHigh = tentsList.stream().map(oneTent -> oneTent.getHeight()).distinct().collect(Collectors.toSet());
		
		Map<Float, List<Tent>> myMap = new HashMap<>(oneTentHigh.size());
		Iterator<Float> iterator = oneTentHigh.iterator();
		
		while(iterator.hasNext()) 
		{
			Float cuurentHeight = iterator.next();
			Stream<Tent> checkHight = tentsList.stream().filter(oneTent -> oneTent.getHeight() == cuurentHeight);
			List<Tent> heightList = checkHight.collect(Collectors.toList());
		
			myMap.put(cuurentHeight, heightList);
		}
		
		return myMap;
    }
    
  //5
	
  	public static List<Tent> myRange(Map<Float, List<Tent>> myMap,float max ,float min)
  	{
  		List<Tent> list_1=new ArrayList<>();
  		List<Tent> list_2=new ArrayList<>();
  		
  		Set<Map.Entry<Float, List<Tent>>> values = myMap.entrySet();
  		Iterator<Map.Entry<Float, List<Tent>>> iterator = values.iterator();
  		
  		while(iterator.hasNext()) 
  		{
  			 Map.Entry<Float, List<Tent>> itCheck = iterator.next();
  			 list_1=itCheck.getValue().stream().filter(oneTent-> oneTent.getHeight() <= max).filter(t-> t.getHeight() >= min)
  					 .collect(Collectors.toList());
  			 list_2.addAll(list_1);
  		}
  		return list_2;
  	}	
}
