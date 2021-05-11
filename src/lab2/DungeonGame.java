package lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class DungeonGame
{
	public static void main(String[] args)
	{
		//1 dragon; 2 witches; 3 goblins; 4 skeletons
		ArrayList<Monster> Monsters = new ArrayList<Monster>();
		ArrayList<Monster> Dungeon = new ArrayList<Monster>();
		Scanner input = new Scanner(System.in);
		Boolean moreMonsters = true;
		int score = 0;
		
		Player player = new Player(40);
		int playerHealth = player.getPlayerHealth();
		
		//populating Monsters ArrayList with monsters
		Monsters.add(new Dragon("Dragon", 10));
		for(int i=0; i<=1; i++)
		{
			Monsters.add(new Witch("Witch", 8));
		}
		for(int i=0; i<=2; i++)
		{
			Monsters.add(new Goblin("Goblin", 5));
		}
		for(int i=0; i<=3; i++)
		{
			Monsters.add(new Skeleton("Skeleton", 2));
		}
		
		while (moreMonsters == true) //adding monsters to dungeon
		{
			System.out.print("Put in another monster? ");
			String answer = input.next();
			
			if(answer.compareTo("Yes") == 0)
			{
				Random rnd = new Random();
				int pickEnemy = rnd.nextInt(9);
				Dungeon.add(Monsters.get(pickEnemy));

				if(pickEnemy == 0)//Dragon
				{
					Dragon dragon = (Dragon)Monsters.get(0);
					score = score + dragon.getStrengthValue();
				}
				
				else if(pickEnemy==1 || pickEnemy==2)//Witch
				{
					Witch witch = (Witch)Monsters.get(1);
					score = score + witch.getStrengthValue();
				}
				
				else if(pickEnemy>=3 && pickEnemy<=5)//Goblin
				{
					Goblin goblin = (Goblin)Monsters.get(3);
					score = score + goblin.getStrengthValue();
				}
				
				else if(pickEnemy>=6 && pickEnemy<=9)//Skeleton
				{
					Skeleton skeleton = (Skeleton)Monsters.get(6);
					score = score + skeleton.getStrengthValue();
				}
				
				else
				{
					System.out.println("Enemy Pick Error");
				}
				System.out.println("There are " + Dungeon.size() + " monsters in the dungeon.");
				System.out.println();
			}
			
			if(answer.compareTo("No") == 0)
			{
				moreMonsters = false;
				
				boolean usedItemToDefeatAll = false;//only to be used once
				boolean skeletonItemAvailable = true;//used on unlimited skeletons only. Lost when encountered by witch
				String toggleItem;
				
				for(int i=0; i<Dungeon.size(); i++) //going through the dungeon
				{
					int monsterDamageDealt = Dungeon.get(i).getStrengthValue(); //stores damage from monster in a variable for manipulation
					
					if(playerHealth <= 0)
					{
						break;
					}
					
					if(usedItemToDefeatAll == false) //if the player hasn't used the item already
					{
						System.out.print("Use item for monster " + (i+1) + "? ");
						toggleItem = input.next();
						if(toggleItem.compareTo("Yes") == 0)
						{
							monsterDamageDealt = 0;
							usedItemToDefeatAll = true;
							System.out.println("Item used");
						}
					}
					
					if(Dungeon.get(i).getName().compareTo("Witch") == 0)//if the first/next monster is a witch
					{
						System.out.println("The next enemy is a witch. You lose the Skeleton item.");
						skeletonItemAvailable = false;
					}
					
					if((skeletonItemAvailable==true) && (Dungeon.get(i).getName().compareTo("Skeleton")==0)) //if the player hasn't used the Skeleton item and the next enemy is a Skeleton
					{
						System.out.print("The next monster is a Skeleton. Use the Skeleton item for monster " + (i+1) + "?");
						toggleItem = input.next();
						
						if(toggleItem.compareTo("Yes") == 0)
						{
							monsterDamageDealt = 0;
							System.out.println("Skeleton item used");
							//do something with the score
						}
					}
					
					playerHealth = playerHealth - monsterDamageDealt;
					System.out.println("Monster " + (i+1) + " is a " + Dungeon.get(i).getName() + ". It deals " + monsterDamageDealt + " damage leaving you with " + playerHealth + " health.");
				}
				break;
			}
		}
		
		System.out.println();//presentation
		
		if(playerHealth > 0)
		{
			System.out.println("You win! You scored " + score + " points!");
		}
		else
		{
			System.out.println("You died!");
		}
		
		input.close();
	}
}