package uebungen;
// Refactoring technique: Rename Method

import java.util.Date;

public class WhatDoYouMean {
	private static final int pruefZahl = 4;
	
// Bei den Methodennamen weiss ich beim Lesen des Codes ech tnicht, was da grade eigentlich passieren soll. 
// Denke dir doch bitte ein bisschen vielsagendere Methodennamen aus!
// Tipp: mit Rechtsklick -> Refactor -> Rename kann man ganz entspannt ohne Copy/Paste arbeiten! ;)
	
	public static void main(String[] args) {
		doThis();
		what();
		wwapd();
	}

	private static void wwapd() {
		Date today = new Date();		
		Date Sommerbeginn = new Date(today.getYear(), 6, 1);
		Date Sommerende = new Date(today.getYear(), 9, 1);
		if(today.before(Sommerende) || today.after(Sommerbeginn)) System.out.println("Es ist Sommer");
		else System.out.println("Es ist gerade kein Sommer.");
		return;
	}

	private static void what() {
		int zahl = pruefZahl;
		System.out.println("Geht die Zahl durch die Pr�fung durch?");
		if(sruifoiuaosidfho(zahl)) System.out.println("Ja korrekt");
		else System.out.println("Nein, falsch");
	}

	private static boolean sruifoiuaosidfho(int zahl) {
		double wurzel = Math.sqrt(zahl);
		double wurzelAbgerundet = Math.floor(wurzel);
		if( wurzel == wurzelAbgerundet ) return true;
		return false;
	}

	private static void doThis() {
		System.out.println("Hallo, wie geht's dir?");
	}

}
