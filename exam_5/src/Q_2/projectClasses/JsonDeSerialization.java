package Q_2.projectClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class JsonDeSerialization 
{
	public static void run() 
	{
		
		List<House> housesList = readHousesFromTheLostFile();
		System.out.println("The Houses list: ");
		housesList.forEach(System.out::println);
	
	}
	
	private static List<House> readHousesFromTheLostFile() 
	{
		File file = new File(Path.of("myFiles", "lostJSONFile.json").toString());
		
		List<House> housesList = new ArrayList<House>();

		try (FileReader fileReader = new FileReader(file)) 
		{
			JsonReader jsonReader = new JsonReader(fileReader);
			Gson gson = new Gson();
			
			Type listType = new TypeToken<ArrayList<House>>() 
			{
			}.getType();
			housesList = gson.fromJson(jsonReader, listType);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return housesList;
	}
}