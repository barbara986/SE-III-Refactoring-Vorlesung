package uebungen;
// Refactoring technique: Extract Variable

public class Produkt {

	public static void main(String[] args) {
		System.out.println(produziereEndprodukt("Stahllager"));
	}
	
	private static String produziereEndprodukt(String rohstoffLager) {
		//hmm dieser Methodenaufruf ist sehr verschachtelt (Code Smell: Message Chains). Kannst du ihn aufbrechen?
		//Führe die Methode vorher und nachher aus, um zu schauen, ob deine Änderung Fehlerfrei ist!
	    return produziereHalberzeugnis(bereiteRohstoffAuf(erhalteRohstoff(rohstoffLager))) + " Endprodukt fertig.";
	}
	
	private static String produziereHalberzeugnis(String rohstoffAufbereitet) {
		return rohstoffAufbereitet + " Halberzeugnis daraus erstellt.";
	}

	private static String bereiteRohstoffAuf(String rohstoffErhalten) {
		return rohstoffErhalten + " Rohstoff aufbereitet.";
	}

	private static String erhalteRohstoff(String rohstoffLager) {
		return "Rohstoff aus Lager " + rohstoffLager + " geholt.";
	}	

}
