package lab2;

//Dragon subclass
public class Dragon extends Monster
{
	//members
	
	
	//constructor
	Dragon(String name, int strengthValue)
	{
		super(name, strengthValue);
		strengthValue = 10;
	}
	
	//methods
	public int getStrengthValue()
	{
		return strengthValue;
	}
}
