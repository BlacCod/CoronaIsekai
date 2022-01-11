package main;
/*
 * Diese Klasse kontrolliert den Text und die unterliegende Logik
 */

public class Text {

	/*
	 * Den Text (als Parameter) drucken und dann warten, bis zu den User eine Taste drückt
	 */
	public static void print(String s) {
		System.out.print(s);
		Main.scanner.nextLine();	
	}
	public static void anfangstext() {
	print("Unser Hauptfigur ist ein Wissenschaftler, der mit der Entwicklung der Impfung arbeitet.");
	System.out.print("\n\nDrucken Sie Enter, um fortzufahren\n");
	print("\nErste Oktober 2020 ist er mit der Arbeit fertig und er ist in dem Weg zu Hause. Leider wird er gestorben. Wenn er die Augen aufmacht, ist er in Jahr 1600. \nEr lebt in einer alten Apotheke. ");
	print("Er weiss nicht, warum er wiedergeboren ist, aber mit Zeit gewöhnt er sich zu seinem neuen Leben. Er arbeitet jeden Tag in der Apotheke, und vorbereitet Medizin für das Volk.");
	print("\nEin Jahr später beginnt etwas komisch zu passieren. Viele Leute bekommen die gleiche Symptome. Husten, Schnupfen und Fieber. Er versucht, normale Erkältungsmedikamenten zu verschreiben, aber die Krankheit bleibt.");
	print("\nDann merkt er, dass diese Krankheit wahrscheinlich SARS-CoV-2 ist. In diesem Moment entscheidet er sich, noch einmal den Impfstoff zu entwickeln.");
	print("\nDu hast überall gehört, dass es eine magische Essenz gibt, die Plasma genannt wird und die diese Krankheit heilen kann. Es ist jedoch zu stark, und die meisten Menschen starben kurz nach der Anwendung. \nAls Wissenschaftler wusstest du genau, was falsch ist, und du hast beschlossen, aus dieser Substanz einen Impfstoff herzustellen");
	}

	/*
	 * Dieser Methode enthält alle Texten und Logikkontrolle des 1. Kapitels
	 */
	public static void kapitel1() {
		/*
		Für die Bestimmung des Rufs gibt es Optionen mit Zahlen zur Auswahl. Jede Option hat eine unterschiedliche Rufswert, die meisten erhöhen den Ruf und einige senken es.
		*/
	print("Du entscheidest dich, den Impfstoff erneut zu entwickeln. Der erste Schritt zur Entwicklung des Impfstoffs ist der am wenigsten komplizierte, denn zunächst brauchen wir alle Materialien, die wir brauchen, um arbeiten zu können. \nAber wo können wir Metall und Glas finden? Neulich hast du von einem Markt für die seltsamsten Verkäufe gehört. Die erste Station wird also der Markt sein.\n" 
	+ "1) Du fragst eine Frau im Vorbeigehen, wo der Markt ist.\n"
    + "2) Du suchst selbst auf dem Markt.\n"
    + "3) Sie suchen nach einer Karte, um herauszufinden, wo sich der Markt befindet.\n");
		/*
		Wir verwenden das do-while-Schleife, um die verschiedene Möglichkeiten zu wahlen. Es ermöglicht, eine Aktion in einer Schleife zu wiederholen, wenn die Bedingung erfüllt ist.
		*/
		String antwort;
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("2")) {
			Player.increaseReputation(0);
		}
		else if (antwort.equals("3")) {
			Player.decreaseReputation(1);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false && antwort.equals("3") == false); //noch einmal wiederholen, wenn das User ein nicht gültige Antwort gibt
	
	print("Endlich kommst du auf dem Markt an, es ist ein überfüllter Ort und du kannst vor lauter Lärm kaum etwas hören. Die Läden sehen zwar nicht sehr schön aus, aber man muss hineingehen.");
	print("Dann triffst du einen sehr seltsamen Typen, der dir sagt, dass er das hat, was du brauchst. Du folgst ihm und er legt das Metall und das Glas, das du für die Arbeit brauchst, auf den Tisch. Das Glas ist sehr teuer, also gibt er dir 3 Spiel-Karten.");
	print("Wenn du die richtige Wahl triffst, kostet das Glas nichts, aber wenn du die falsche Wahl triffst, musst du doppelt so viel für das Glas bezahlen.\n"
	+ "1) Rote Karte\n"
	+ "2) Gelbe Karte\n"
	+ "3) Blaue Karte\n");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("2")) {
			Player.increaseReputation(10);
		}
		else if (antwort.equals("3")) {
			Player.increaseReputation(0);
		}
		else if (antwort.equals("1")) {
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
	
	print("Du musst ... Goldmünzen bezahlen. Schließlich hast du, die Materialien für die Entwicklung des Impfstoffs zu kaufen, die zwar etwas teuer sind, aber notwendig.");
	print("Sie sehen ein Kind, das auf Sie zukommt und sagt: Gehst du einkaufen, Wissenschaftler? An dem Stand dort drüben ist unsere Glas arbeiter. Willst du dem Kind ein Geschenk machen?"
	+ "1) Eine Schokolade\n"
	+ "2) Eine Goldmünze\n"
	+ "3) Nichts\n ");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("2")) {
			Player.increaseReputation(10);
		}
		else if (antwort.equals("3")) {
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
	print("Die Arbeit mit Glas ist nicht einfach, vor allem, wenn man es zur Entwicklung eines Impfstoffs verwenden will. Du triffst den Glasmacher.");
	print("Dieser Mann legt den Preis für seine Arbeit nicht fest, er überlässt es dir, den Preis zu bestimmen, und er wird sehen, ob es gerecht ist oder nicht." 
	+ "1) 2 Silbermünzen: Der Glasarbeiter fühlt sich beleidigt. Wie kannst du ihm so wenig für seine Arbeit zahlen? Zuerst weigert er sich, den Auftrag anzunehmen, aber schließlich einigen Sie sich auf 10 Silbermünzen.\n"
	+ "2) 10 Silbermünzen: Das ist ein gutes Angebot, der Glasarbeiter bietet Ihnen fröhlich seine Hilfe an! Dank dieser Tatsache sprechen die anderen Verkäufer gut von dir.\n"
	+ "3) 1 Goldmünze. Der Glasarbeiter ist schockiert und fragt sich, warum jemand bereit ist, so viel für eine Glasarbeit zu bezahlen. Er nimmt das Geld dankbar an, aber er denkt dass du ein bisschen naiv bist.\n");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("3")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("2")) {
			Player.increaseReputation(10);
		}
		else if (antwort.equals("1")) {
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
	print("Nach einem langen Einkaufstag bist du endlich wieder in der Apotheke, aber es ist keine Zeit zum Ausruhen. Du hast Metallnadeln, Glasspritzen und ein Arbeit zu machen. Nachdem du die ganze Nacht an der Spritze gearbeitet hast, hast du es geschafft. Der nächste Schritt ist etwas komplizierter: die Blutentnahme und die Isolierung des Virus.");
	
	}

	public static void kapitel2() {
		// Methode für Kapitel 2
		print("Du musst nun das Blut infizierter Menschen sammeln, um das Virus zu untersuchen. Leider hast du nicht viele Bekannte in dieser neuen Welt. Du beschließt, Werbungen auf Zettel zu schreiben und sie in der Stadt zu verteilen.");
		print("Bevor du anfängst, überall in der Stadt Werbung zu schalten, musst du etwas schreiben, das die Leute dazu bringt, ihr infiziertes Blut zu spenden. Du hast also 3 Möglichkeiten."
		+ "1) Für die Entwicklung eines Impfstoffs werden mit dem Coronavirus infizierte Freiwillige benötigt, die sich bei Interesse bitte in der Apotheke des Zentrums melden"
		+ "2) Wollen Sie Teil der Geschichte sein und eine Pandemie beenden? Für die Entwicklung eines Impfstoffs gegen das Coronavirus werden Blutspender benötigt. Kommen Sie in die Apotheke im Stadtmitte, wenn Sie infiziert sind."
		+ "3) Ich brauche dein Blut, um den Covid zu beenden. Wenn du willst, du kannst zu meiner Apotheke kommen.");
		String antwort = ""; // Antwort initializieren ohne Wert
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("2")){
			Player.increaseReputation(10);
		}
		else if (antwort.equals("3")) {
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
		print("Aufgrund deiner bisherigen Erfahrungen als Wissenschaftler weißt du, dass du für die Untersuchung des Virus eine Kühlbox zur Lagerung der Blutproben brauchst. Da Sie sich bereits in der Stadtmitte befinden, halten Sie im Einkaufszentrum an, um Eis zu kaufen, und du musst auch einige Materialien kaufen, um die Lagerbox für das Blut zu bauen. Es werden dir drei Möglichkeiten angeboten: ");
		print("1) Holz und Gummi.\n"
			+ "2) Metal und Papier.\n"
			+ "3) Leder und Glas.\n");
		// Hier oben ist es egal, welche Moglichkeit entschieden ist.
		print("Du gehst mit deinen neu erworbenen Materialien zurück in die Apotheke und bist super müde. Du schläfst sofort ein. Als du am nächsten Tag aufwachst, hast du es geschafft, eine Kiste zu bauen, die groß genug für die Blutproben ist!");
		print("Endlich ist der Tag gekommen. Menschen aus der ganzen Stadt kommen in deine Apotheke, um sich ihr Blut abnehmen zu lassen. Die meisten von ihnen haben eine verzweifelte Ausstrahlung. Sie müssen wirklich wollen, dass du das Heilmittel findest.");
		print("Es scheint, dass du mit deinen Werbeplakaten gute Arbeit gemacht hast. Aber eine Frau kommt zu Ihnen und sagt: Wenn ich Ihnen mein Blut gebe, werden Sie dann ein Heilmittel finden? Oder sind Sie einfach nur ein Lügner?");
		print("1) “Ich bin ein viel fortschrittlicherer Wissenschaftler für die Zeit, in der wir leben. Ich empfehle Ihnen, meine Anweisungen zu befolgen, wenn Sie uns alle schnell vor diesem Virus schützen wollen”.\n"
				+ "2) “Ehh... Vielleicht, weil ich die einzige Person bin, die in dieser Apotheke arbeitet, und weil ich noch nie gescheitert bin? Du solltst ein bisschen dankbar sein…” \n"
				+ "3) (Du wirst wütend und schreien) Du weißt nicht, was es mich gekostet hat, alle Materialien und Werkzeuge zu besorgen, und du hältst mich für einen Lügner?!  Ich brauche Ihr Blut nicht, um den Impfstoff zu finden. Raus!\n");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			Player.increaseReputation(10);
		}
		else if (antwort.equals("2")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("3")) {
			Player.decreaseReputation(5);
		}
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
		print("Nach einem langen Arbeitstag hast du alle notwendigen Beweise gesammelt und gesichert, um das Verfahren fortzusetzen. Gute Arbeit! Jetzt ist es an der Zeit, sich auszuruhen und sich auf den morgigen Tag vorzubereiten. "
			+ "Der Impfstoff gegen das Coronavirus rückt immer näher! (minigame im Traum)");
		print("Sie wachen ausgeruht auf. Das erste, was Sie am Morgen tun, ist, die Blutproben zu überprüfen. Sie scheinen in Ordnung zu sein. Du bereitest dir ein Frühstück zu und beginnst nach dem Essen mit den Blutproben zu experimentieren. Du legst einige der Proben in deinen Apotheken-Apparat, um sie zu zentrifugieren.");
		print("Nach einiger Zeit im Apparat können Sie nun deutlich verschiedene Abschnitte des Blutes im Inneren des Glases sehen. Sie erkennen einen dieser Abschnitte, nämlich das Plasma.");
		print("Das Plasma ist ein heller, bernsteinfarbener, flüssiger Bestandteil des Blutes, der von den Blutzellen befreit ist, aber Proteine und andere Bestandteile des Vollbluts in sich birgt. Diese Proteine wollen Sie für die Entwicklung des Impfstoffs verwenden.");
	}
	
	public static void kapitel3() {
		String[] kap3_teil1 = {"Alles scheint sich in eine gute Richtung zu entwickeln. Sie müssen das Plasma verdünnen, um den Impfstoff erfolgreich zu entwickeln.",
				"Sie haben versucht, es mit dem Wasser eines nahe gelegenen Flusses zu verdünnen, aber das hat nicht funktioniert. Das Plasma hat sich einfach verdampft.",
				"Nach einigen Experimenten stellten Sie fest, dass das von Ihnen verwendete Wasser aufgrund des hohen Anteils an Verunreinigungen und Bakterien nicht geeignet war.",
				"Sie brauchen reines, destilliertes Wasser. Aber wie können Sie es finden? Die Lösung ist sehr klar: Finde Eis auf dem Berg. Diese Art von Wasser gilt als besonders rein", 
				"Sie packen deinen Rucksack mit vielen Apparaten und gehst in die Berge. Ihr Ziel ist klar: Eis finden"};
		String antwort = "";
		for (int i = 0; i < kap3_teil1.length; i++) {
			print(kap3_teil1[i]);
		}
		print("Mitten in Ihrer Suche begegnen Sie einem Grizzlybären. Wie schrecklich! Was werden Sie tun?");
		System.out.println("1. Leise weglaufen\n"
				+ "2. Den Bären anschreien\n");
		
		do {
			antwort = Main.scanner.nextLine();
			if (antwort.equals("1")) {
				print("Sie haben Angst und entscheiden sich, wegzulaufen, aber Sie müssen sehr vorsichtig sein, um keine Geräusche zu machen. Nach einer Stunde sind Sie erfolgreich geflohen. Es war schwierig, aber zumindest sind Sie nicht gestorben. Dein Ruf steigt um 5 Punkte");
				Player.increaseReputation(5);
			}
			else if (antwort.equals("2")) {
				print("Du hast beschlossen, den Bären anzuschreien, um ihn zu verscheuchen. Aber der Bär ist jetzt wütend, weil du ihn gestört hast. Er hat sich entschieden, Sie anzugreifen.");
				print("Du hast gemerkt, dass du es falsch gemacht hast, und beschlossen, so schnell wie möglich wegzulaufen. Der Bär hat dich gejagt.");
				print("Nach vielen Stunden bist du geflohen, aber jetzt bist du verpflichtet, einen längeren Weg zu nehmen. Dein Ruf sinkt um 10 Punkte.");
				Player.decreaseReputation(10);
			}
			else {
				System.out.println("Noch einmal");
			}
		} while (antwort.equals("1") == false && antwort.equals("2") == false);
		print("Nach vielen Stunden ununterbrochener Fahrt habt ihr es bis zum Berggipfel geschafft. Dort gab es einen riesigen Eisblock.");
		print("Ihr habt ihn zerschnitten und geschmolzen und das Wasser nach Hause gebracht.");
		print("Du hast das Plasma aus dem Gerät geholt. Sie haben zwei Möglichkeiten: Mischen Sie die Flüssigkeit in einem Metallbecher oder einem Glasbecher.");
		System.out.println("1. Metallbecher\n" 
				+ "2. Glasbecher");
		do {
			antwort = Main.scanner.nextLine();
			if (antwort.equals("1")) {
				print("Zunächst schien die Reaktion in Ordnung zu sein, aber dann geriet sie außer Kontrolle. Der Becher explodierte und verströmte einen stinkenden Geruch. Die Leute dort mögen den Geruch überhaupt nicht.");
				Player.decreaseReputation(10);
			}
			else if (antwort.equals("2")) {
				Player.increaseReputation(5);
			}
			else System.out.println("Noch einmal");
			} while (antwort.equals("1") == false && antwort.equals("2") == false);
		print("Du hast beschlossen, es noch einmal mit dem Glasbecher zu versuchen. Es hat funktioniert, und du hast jetzt eine transparente Flüssigkeit, den Impfstoff");
		print("Aber man muss es erst testen. Du gibst den Impfstoff in eine Glasspritze.");
		print("Sie füllen eine Ihrer Spritzen mit dem Impfstoff und setzen sie in eine Ihrer Labormäuse ein. In der nächsten Woche werden Sie hoffentlich eine Verbesserung des Immunsystems der Maus feststellen");
		print("Nach einigen Tagen nimmst du etwas von dem Virus, das Sie zuvor isoliert haben, und steckt es in die Maus ein");
		print("Du führst dein Leben ein paar Tage lang weiter, ohne irgendeine Art von Wissenschaft zu betreiben. Was für ein ruhiges mittelalterliches Leben!");
		print("Nach viel Langeweile analysierst du deine Maus. Sie scheint gesund zu sein. Es wurden keine Nebenwirkungen festgestellt. Du nimmst ihm etwas Blut ab, und es gibt keine Anzeichen für eine Krankheit!");
	}
		
	public static void kapitel4() {
		String antwort = "";
		print("Nach erfolgreichen Tierversuchen beschließen Sie, Versuche am Menschen durchzuführen");
		print("Sie müssen sich nun überlegen, wie Sie die Menschen für die Prüfung Ihres Impfstoffs gewinnen können. Nach langem Überlegen entscheiden Sie sich für das Verteilen von Flugblättern.");
		print("Darin schreiben Sie Ihre Adresse und das Datum, an dem Sie die Impfstoffdosen verabreichen werden. In welchem Viertel der Stadt verteilen Sie die Flugblätter?");
		print("1) Die Stadtmitte. Manche freuen sich über Ihre Impfstoff Ideen. Einigen anderen ist es egal.\n"
		+	"2) Das Adelsviertel, dort leben die Adligen.\n"
		+	"3) Das Viertel der Kirche.\n");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("3")) {
			System.out.println("Alle religiösen Menschen denken jetzt, dass Sie das Werk eines Dämons tun.");
			Player.decreaseReputation(10);
		}
		else if (antwort.equals("2")) {
			System.out.println("Die Adligen sind sauer, dass du so viel Papiermüll in ihrem sauberen und glänzenden Viertel verteilt hast.");
			Player.increaseReputation(10);
		}
		else if (antwort.equals("1")) {
			System.out.println("Manche freuen sich über Ihre Impfstoff Ideen. Einigen anderen ist es egal.");
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
		
		print("Nachdem die Flugblätter erfolgreich verteilt wurden, nähert sich der Tag der Impfung. Sie haben noch ein paar Tage Zeit, um sich darauf vorzubereiten. Was möchten Sie tun?");
		print("1) Stellen Sie einen Assistenten ein, um das Impfverfahren zu beschleunigen. Alles läuft problemlos, die Öffentlichkeit ist froh, dass sie an Ihrer Impfkampagne teilgenommen hat. Sie erhalten 15 Rufpunkte."
		+"2) Mieten Sie einen Musiker, der die Leute während der Impfung unterhält. Sie mieten einen Musiker. Aber er ist schlecht! Die Leute werden wütend, weil die Schlange für die Impfung so lang ist und die Musik des Barden so schlecht ist. Du verlierst 15 Rufpunkte."
		+"3) Kaufen Sie einen Teddybär, falls einer der Freiwilligen ein Kind ist. Du kaufst einen süßen Teddybär. Leider kommen keine Kinder, was logisch ist. Welche Eltern würden ihr kleines Kind freiwillig für die Impfung eines Fremden zur Verfügung stellen? Die Leute werden wütend, weil die Schlange so lang ist und du so langsam beim Impfen bist. Ihr Ruf geht um 15 Punkte zurück..");
		do {
			antwort = Main.scanner.nextLine();
			if (antwort.equals("1")) {
				System.out.println("Dein Ruf ändert sich nicht");
				System.out.println("Dein Ruf ist: " + Player.getReputation());
			}
			else if (antwort.equals("2")) {
				Player.decreaseReputation(15);
			}
			else if (antwort.equals("3")) {
				Player.increaseReputation(15);
			}
			else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);
		print("Sie haben die Leute gebeten, in 3 Wochen wiederzukommen, um die Folgen der Impfung zu analysieren. Jetzt müssen Sie warten. Wie verbringen Sie Ihre Zeit, während Sie warten?");
		print("1) Du lebst dein Leben weiter, ohne irgendeine Art von Wissenschaft zu praktizieren. Was für ein ruhiges, mittelalterliches Leben!"
		+ "2) Du gehst jede Nacht auf Partys. Jeder in der Stadt weiß jetzt, dass du alkoholabhängig bist. Hey, wenigstens hast du ein paar Freunde gefunden."
		+ "3)  Sie entscheiden sich, als freiwilliger Helfer in der nahe gelegenen Kirche mitzuarbeiten. Sie helfen älteren Menschen beim Tragen von Lebensmitteln, Sie putzen die Kirche usw. Am Ende der drei Wochen sind Sie extrem müde. War es das wirklich wert?");
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			Player.increaseReputation(5);
		}
		else if (antwort.equals("3")) {
			Player.increaseReputation(10);
		}
		else if (antwort.equals("2")) {
			Player.decreaseReputation(5);
		}
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") == false && antwort.equals("2") == false&& antwort.equals("3") == false);

		
		print("Es sind jetzt drei Wochen vorbei, und die Leute kommen zurück. Nach sorgfältiger Analyse aller Patienten kann man mit Sicherheit sagen, dass sie alle gesund sind!");
		print("Die Gerüchte verbreiten sich im ganzen Königreich: y/n hat das Heilmittel für Corona gefunden!");
		print("Nachdem der König von den Gerüchten gehört hat, verlässt er das Schloss, um Ihre Apotheke zu besuchen. Er macht Ihnen ein Angebot:");
		print("'Wären Sie bereit, Ihren Impfstoff in der Hauptstadt massenhaft zu produzieren? Ich kann Ihnen die notwendigen Arbeitskräfte und Materialien zur Verfügung stellen. Was sagen Sie dazu?'");
		print("1) Nein. Wegen deines starken Hasses auf Monarchien lehnst du es ab, dem König zu helfen und schickst ihn aus deiner Apotheke. (Du wirst von den Rittern des Königs gekidnappt und gefoltert. Schließlich verrätst du ihnen die Schritte zur Herstellung des Impfstoffs. Danach töten sie dich."
	+		  "2) Ja, das wäre fantastisch! (Sie ziehen in die Hauptstadt und beginnen mit der Produktion des Impfstoffs. Nach vier Monaten der Impfkampagne ist das Königreich endlich frei von Corona!Du erhältst einen Adelstitel und darfst als Fürst in einer nahe gelegenen Stadt leben. Was für ein großartiges Leben!)");
		
		//Am Ende des Spiels, man entscheidet zwischen 2 Möglichlkeiten. Zuletzt werden die Rufpunkten gezahlt und das Ergebnis angezeigt.
		do {
		antwort = Main.scanner.nextLine();
		if (antwort.equals("1")) {
			System.out.println("Game over. Du wirst von den Rittern des Königs gekidnappt und gefoltert. Schließlich verrätst du ihnen die Schritte zur Herstellung des Impfstoffs. Danach töten sie dich.");
			System.out.println("Dein gesamtes Ruf war: " + Player.reputation);
		}
		else if (antwort.equals("2")) {
			System.out.println("Sie ziehen in die Hauptstadt und beginnen mit der Produktion des Impfstoffs. Nach vier Monaten der Impfkampagne ist das Königreich endlich frei von Corona!Du erhältst einen Adelstitel und darfst als Fürst in einer nahe gelegenen Stadt leben. Was für ein großartiges Leben!");
			System.out.println("Dein gesamtes Ruf war: "+ Player.reputation);
		}
	
		else System.out.println("Noch einmal");
		} while (antwort.equals("1") && antwort.equals("2") == false);
	
	}	
}
