package exam_3.classes_Dragon;

import java.time.LocalDate;

public class Dragon 
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
	public String toString() {
		return "Dragon [name=" + name + ", birthDate=" + birthDate + ", flameIntensity=" + flameIntensity + "]";
	}
		

	

}
