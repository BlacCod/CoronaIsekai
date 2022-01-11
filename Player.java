package main;
/*
	Diese Klasse kontrolliert die Informationen uber den Hauptfigur
*/
public class Player {

	static int reputation;
	public Player() {
		reputation = 50;
	}
	
	public static int getReputation() {return reputation;}
	public static void setReputation(int a) {reputation = a;}
	
	public static void increaseReputation(int amount) {
		setReputation(reputation + amount);
		System.out.println("Deine neue Ruf ist " + reputation);
	}
	//TODO: write check and endgame for reputation when it drops below 0
	public static void decreaseReputation(int amount) {
		setReputation(reputation - amount);
		System.out.println("Deine neue Ruf ist " + reputation);
	}
}
