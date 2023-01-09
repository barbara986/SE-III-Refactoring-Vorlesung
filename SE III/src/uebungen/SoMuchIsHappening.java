package uebungen;
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
	
	//PS: Die KLasse kann auch ausgeführt werden spasseshalber. Nach dem Refactorn sollte dasselbe Ergebnis zu sehen sein.
	private static boolean decideYesOrNo(int zahl) {
		if(zahl < 9) {
			System.out.println("Wer mag schon Zahlen kleiner als neun?!");
			if(zahl * zahl < zahl + 187) {
				System.out.println("Komische Zahl");
				return true;
			}
			else {
				System.out.println("Man braucht echt nicht immer ein else, nur weil es ein if gibt!");
				return false;
			}
		}
		else {
			if ("Henne".equals(new Integer(zahl).toString())) {
				if(2 == zahl) {
					System.out.println("Was geht hier ab");
					if(Math.sqrt(zahl) > Math.exp(2)) {
						return true;
					}
					else {
						if(zahl * 3  == zahl - 3) {
							System.out.println("Digging in the dirt");
							return false;
						}
						return false;
					}
				}
				else {
					System.out.println("Ich habe den Durchblick verloren");
					return false;
				}
			}
			
		}
		return false;
		
	}
}
