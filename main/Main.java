package main;

/** Basisklasse: Diese Klasse ausführen, um den Spiel zu spielen
 * Diese Klasse ist für technische Anweisungen: die Methoden für den ganzen Programm (die Geschichte) aufzurufen 
 * und auch die wichtige Einstellungen machen
 * @author: Huy Vu, Pedro, Gustavo 
 * @date: 11.01.2022
 * Informatik Projekt T442 STK
 */
import java.util.Scanner;

public class Main {

	public static Scanner scanner; //Scanner für andere Klasse einstellen, andere Klasse benutzen das mit Main.scanner
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// Jetzt fangen wir an, die Geschichte durchzugehen.
		Text.anfangstext();
		Text.kapitel1();
		Text.kapitel2();
		Text.kapitel3();
		Text.kapitel4();
		scanner.close();	
	}
}
