package main;

/* @author: Huy Vu, Pedro, Gustavo 
 * @date: 11.01.2022
 * Informatik Projekt T442 STK
 */
import java.util.Scanner;

// Diese Klasse ist fur technische Anweisungen, z.B. wenn wir ein input vom Benutzer lesen mï¿½ssen.
public class Main {

	public static Scanner scanner;
	
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

