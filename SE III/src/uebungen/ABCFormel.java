package uebungen;
// Refactoring technique: Extract Method

public class ABCFormel {
	public static void main(String[] args) {
		System.out.println("Die L�sung der Gleichung ist: " + berechneABCFormel(2, -4, -6));
	}
	
	// Diese Methode ist un�berichtlich und kompliziert. Es w�re sicher eine guteIdee, f�r jeden der drei F�lle, 
	// was unter der Wurzel stehen kann, eine eigene Methode zu machen. Eclipse hilft dir dabei. Einfach die 
	// gew�nschten Zeilen markieren. Dann Rechtsklick -> Refactoring -> ... Methodennamen kannst du dir selbst �berlegen :)
	
	//Methode am besten vor und nach dem Refactoren ausf�hren um zu pr�fen, ob sich das Ergebnis ver�ndert hat!
	public static String berechneABCFormel(double a, double b, double c) {
	    double unterDerWurzel = (b * b) - (4 * a * c);
	    
	    if (unterDerWurzel > 0) {
	        double x1, x2;
	        x1 = (-b - Math.sqrt(unterDerWurzel)) / (2 * a);
	        x2 = (-b + Math.sqrt(unterDerWurzel)) / (2 * a);
	        return "x1 = " + x1 + ", x2 = " + x2;
	    }
	    else if (unterDerWurzel == 0) {
	        double x;
	        x = (-b) / (2 * a);
	        return "x = " + x;
	    }
	    else {
	        return "Leere L�sungsmenge";
	    }
	}
}
