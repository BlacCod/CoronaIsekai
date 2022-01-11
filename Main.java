package main;

/*
 * Diese Klasse ist fur technische Anweisungen, z.B. wenn wir ein input vom Benutzer lesen müssen.
 */
import java.util.Scanner;
public class Main {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Text.anfangstext();
		Text.kapitel1();
		Text.kapitel2();
		Text.kapitel3();
		

	}
}
