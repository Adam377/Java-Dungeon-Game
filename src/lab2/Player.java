package lab2;

public class Player
{
	//members
	private int playerHealth;
	
	//constructor
	Player(int playerHlth)
	{
		this.playerHealth = playerHlth;
		playerHealth = 40; //default value
	}
	
	//methods
	public int getPlayerHealth()
	{
		return playerHealth;
	}
	
	public int decPlayerHealth(int inHealth)
	{
		int decHealth = playerHealth - inHealth;
		return decHealth;
	}
}
