package lab2;

//Witch subclass
public class Witch extends Monster
{
	//members
	
	
	//constructor
	Witch(String name, int strengthValue)
	{
		super(name, strengthValue);
		strengthValue = 8;
	}
	
	//methods
	public int getStrengthValue()
	{
		return strengthValue;
	}
}
