package exam_3.classes_Dragon;

import java.io.Serializable;
import java.time.LocalDate;

public class Dragon  implements Serializable
{
	//Fields
	protected String name;
	protected LocalDate birthDate;
	protected float flameIntensity;
	
	//Constructor
	public Dragon(String name, LocalDate birthDate, float flameIntensity) 
	{
		this.name = name;
		this.birthDate = birthDate;
		this.flameIntensity = flameIntensity;
	}

	@Override
	public String toString() 
	{
		return "Dragon [name=" + name + ", birthDate=" + birthDate + ", flameIntensity=" + flameIntensity + "]";
	}
	
	
	public void setBirthDay(LocalDate birthDate) throws TooYoungException
	{
		LocalDate theBasicBirthday = LocalDate.of(888, 8, 8);
		if(birthDate.isAfter(theBasicBirthday))
		{
			throw new TooYoungException();

		}
		else
		{
			this.birthDate = birthDate;
			System.out.println("Sucsess to change birthDate");
		}
	}
		

	

}
