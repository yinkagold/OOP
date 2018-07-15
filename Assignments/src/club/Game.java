package club;

public class Game {
	private String description;
	private String date;
	private String time;
	private String player1;
	private String player2;
	private String result;
	
	private static int objectCount=0;

	public Game() {
		date = "Febuary 17,2016";
		time = "18:00";
		player1 = "Sanchez";
		player2 = "Toure";
		result = "player1 wins";
		++objectCount;

		}
	public Game(String description,String player1,String player2 ){
		this.description = description;
		this.player1 = player1;
		this.player2 = player2;
		date = "Unknown";
		result = "draw";
		++objectCount;
	}
	public Game(String date,String time){
		this.date = date;
		this.time = time;
		result = "Undeclared";
		description = "Unknowm title";
		++objectCount;
	}
	public Game(String result){
		this.result = result;
		++objectCount;
	}
	/*public Game(Game game){
		this.date= game.date;
		this.description = game.description;
		this.player1 = game.player1;
		this.player2 = game.player2;
		++objectCount;
	}*/
	public static int objectCount(){
			return objectCount;
		}
	public String search(String player1, String player2,String date, String time){
		if(this.player1==player1 || this.player2 == player2 || this.date== date || this.time== time){
			
			return display();
		}
		else 
			return null;
	}
	public String display(){
		return  "\nPlayer1: " + player1 + "\nPlayer2: " +player2 + "\nDate: " + date+" \nResult: "+result + "\nDescription: "+description+ "\nTime:"+ time;
	}
	
}

