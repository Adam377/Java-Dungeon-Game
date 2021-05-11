package lab2;

//Skeleton subclass
public class Skeleton extends Monster
{
	//members
	
	//constructor
	Skeleton(String name, int strengthValue)
	{
		super(name, strengthValue);
		strengthValue = 2;
	}
	
	public int getStrengthValue()
	{
		return strengthValue;
	}
	
	public String getName()
	{
		return name;
	}
	
	//methods
}
