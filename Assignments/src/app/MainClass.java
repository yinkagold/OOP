package app;
import java.util.Vector;

import club.Game;
public class MainClass {

	public static void main(String[] args) {
		Game game[] = new Game[5];
		game[0] = new Game();
		game[1] = new Game("Olympics","Rafeal","Djokovic");
		
		System.out.println("Object counter: " + Game.objectCount());
		
		
		game[2] = new Game("15, Febuary,2014","19:00");
		
		
		System.out.println("Object counter: " + Game.objectCount());
		
		
		
		game[3] = new Game("Rafeal wins!");
		game[4] = new Game("French open","Chris","Nadal");
		System.out.println("Object counter: " + Game.objectCount());
		
		for(int i=0;i<game.length;i++){
		//	System.out.println(game[i].display());
			System.out.println();
			
			
			
			System.out.println(game[i].search("Rafeal", "Djokovic", "14,Febuary,2016","19:00"));
		}
				
	}

}
