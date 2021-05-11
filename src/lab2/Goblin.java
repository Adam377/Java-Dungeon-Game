package lab2;

//Goblin subclass
public class Goblin extends Monster
{
	//members
	
	
	//constructor
	Goblin(String name, int strengthValue)
	{
		super(name, strengthValue);
		strengthValue = 5;
	}
	
	public int getStrengthValue()
	{
		return strengthValue;
	}
	
	//methods
}
