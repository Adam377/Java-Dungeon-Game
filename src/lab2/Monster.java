package lab2;

//Monster superclass
public class Monster
{
	//members
	String name;
	int strengthValue;
	
	//constructor
	Monster(String name, int strengthValue)
	{
		this.name = name;
		this.strengthValue = strengthValue;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getStrengthValue()
	{
		return strengthValue;
	}
	
	//methods
}
