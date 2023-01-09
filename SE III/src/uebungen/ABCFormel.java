package uebungen;
// Refactoring technique: Extract Method

public class ABCFormel {
	public static void main(String[] args) {
		System.out.println("Die Lösung der Gleichung ist: " + berechneABCFormel(2, -4, -6));
	}
	
	// Diese Methode ist unüberichtlich und kompliziert. Es wäre sicher eine guteIdee, für jeden der drei Fälle, 
	// was unter der Wurzel stehen kann, eine eigene Methode zu machen. Eclipse hilft dir dabei. Einfach die 
	// gewünschten Zeilen markieren. Dann Rechtsklick -> Refactoring -> ... Methodennamen kannst du dir selbst überlegen :)
	
	//Methode am besten vor und nach dem Refactoren ausführen um zu prüfen, ob sich das Ergebnis verändert hat!
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
	        return "Leere Lösungsmenge";
	    }
	}
}
