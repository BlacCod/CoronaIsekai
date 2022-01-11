package main;
/*
	Diese Klasse kontrolliert die Informationen uber den Hauptfigur
*/
public class Player {

	static int reputation; // Das ist ein Ruf variabel. Es berechnet, wie berühmt unser Figur ist.

	public Player() {
		reputation = 50; // Am Anfang beträgt der Ruf 50.
	}
	
	public static int getReputation() {return reputation;} // Getter Methode für den Ruf
	public static void setReputation(int a) {reputation = a;} // Setter Methode für den Ruf
	
	public static void increaseReputation(int amount) {
		// Diese Methode hat ein Amount Argument.
		// Der Ruf nimmt um den Betrag des Amounts zu.
		System.out.println("Dein Ruf steigt um " + amount);
		setReputation(reputation + amount);
		System.out.println("Deine neue Ruf ist " + reputation);
	}

	
	public static void decreaseReputation(int amount) {
		// Gleiche Methode wie vorher, aber hier nimmt der Ruf ab.
		System.out.println("Dein Ruf sinkt um " + amount);
		setReputation(reputation - amount);
		System.out.println("Deine neue Ruf ist " + reputation);
		if (reputation <= 0) {
			System.out.println("Ihr Ruf hat Null erreicht");
			System.out.println("Die Stadtbewohner haben keinen Respekt vor dir und wünschen dir den Tod. Du wirst vom Richter zum Tode verurteilt. Game over.");
			System.exit(0); // Endet das Programm, Game Over
		}
	}
}
