# Java-Dungeon-Game
Java console application that implements a very simple version of Masato Uesugi's push-your-luck game 'Welcome to the Dungeon'. Made during second year in the Advanced Programming module.

Random monsters (Skeletons, Goblins, Witches and Dragons) with their own health and damage output are added to a dungeon. The player is shown how many monsters are in the dungeon and they can decide if they want to add more. When the player has decided they're ready, they go through the dungeon and their health is depleted. If the player's health reaches 0, they lose.

This was implemented by having a player class and a superclass for all the monsters to inherit from. The monster objects are put into an ArrayList and this is looped through as the player goes through the dungeon. The source code was written in the Eclipse IDE.

Two extension tasks were completed. First extension was to give the player an item that can defeat any monster of their choosing. This item can only be used once. The second extension was to give the player a different item that can defeat skeletons without them damaging the player. But, the item is lost if they encounter a witch.
