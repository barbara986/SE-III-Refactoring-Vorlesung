package refactored;
// Refactoring technique: Replace nested conditionals with guard clauses,   Rename method
public class SoMuchIsHappening {
	private static int zahl1 = 5;
	private static int zahl2 = 10;
	private static int zahl3 = -99;

	public static void main(String[] args) {
		sayYesOrNo(zahl1);
		sayYesOrNo(zahl2);
		sayYesOrNo(zahl3);
	}	

	private static void sayYesOrNo(int zahl) {
		System.out.println("---------------------------");
		System.out.println(zahl + "??? Sicher?  Lass mich überlegen.....");

		if(decideYesOrNo(zahl)) {
			System.out.println("------------------------");
			System.out.println("Ja!!!!");
		}
		else {
			System.out.println("------------------------");
			System.out.println("Nein!!!");
		}
	}

	// Man kommt sich hier evtl. vor wie im deutschen Beamtensystem, wenn man einen Antrag auf ein Visum stellt. 
	// Wer hat da noch einen Überblick? Mach es doch am besten allen einfacher und spare dir sämtliche Else-Zweige mit der Technik
	// "Replace nested conditionals with guard clauses". Abspicken bei RefactoringGuru ist erlaubt 
	// (https://refactoring.guru/replace-nested-conditional-with-guard-clauses).

	//PS: Die Klasse kann auch ausgeführt werden spasseshalber. Nach dem Refactorn sollte dasselbe Ergebnis zu sehen sein.

	//Tipp: am einfachsten ist es, Stück für Stück die Else-Zweige zu eliminieren, wenn möglich
	private static boolean decideYesOrNo(int zahl) {
		if(zahl < 9) {
			if(zahl * zahl < zahl + 187) {
				return true;
			}
			return false;
		}
		if ("Henne".equals(new Integer(zahl).toString())) {
			if(2 == zahl) {
				if(Math.sqrt(zahl) > Math.exp(2)) {
					return true;
				}
				if(zahl * 3  == zahl - 3) {
					return false;
				}
				return false;
			}				
		}
		return false;		
	}
}
