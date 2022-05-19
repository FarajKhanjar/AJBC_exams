package Q_2.projectClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class JsonDeSerialization 
{
	public static void run() 
	{
		File file = new File(Path.of("myFiles", "lostJSONFile.json").toString());

		try (FileReader reader = new FileReader(file);) 
		{
			JsonReader jsonReader = new JsonReader(reader);
			Gson gson = new Gson();

			java.lang.reflect.Type listType = new TypeToken<ArrayList<House>>() {}.getType();
			List<House> houseList = gson.fromJson(jsonReader, listType);
			houseList.forEach(System.out::println);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
