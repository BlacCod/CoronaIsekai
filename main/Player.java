package main;
/** 
 * Diese Klasse kontrolliert die Informationen über den Hauptfigur und alle Methoden, die Ruf verändern oder zugreifen können
 * @author: Huy Vu
 */
public class Player {

	static int reputation = 50; // Das ist unsere Ruf. Es berechnet, wie berühmt unser Figur ist.

	
	public static int getReputation() {return reputation;} // Getter Methode für den Ruf
	public static void setReputation(int a) {reputation = a;} // Setter Methode für den Ruf
	
	/*
	 * Diese Methode wird ein int als Parameter übergegeben, und es nimmt den Ruf um diesen Betrag zu
	 * Syntax: Player.increaseReputation(amount)
	 */
	public static void increaseReputation(int amount) {
		System.out.println("Dein Ruf steigt um " + amount);
		setReputation(reputation + amount);
		System.out.println("Dein neue Ruf ist " + reputation);
	}

	/*
	 * Diese Methode wird ein int als Parameter übergegeben, und es nimmt den Ruf um diesen Betrag ab
	 * Syntax: Player.decreaseReputation(amount)
	 */
	public static void decreaseReputation(int amount) {
		System.out.println("Dein Ruf sinkt um " + amount);
		setReputation(reputation - amount);
		System.out.println("Dein neue Ruf ist " + reputation);
		if (reputation <= 0) {
			System.out.println("Dein Ruf hat Null erreicht");
			System.out.println("Die Stadtbewohner haben keinen Respekt vor dir und wünschen dir den Tod. Du wirst vom Richter zum Tode verurteilt. Game over.");
			System.exit(0); // Endet das Programm, Game Over
		}
	}
}
