package com.schule.schule.abstrakte_klassen;

import com.schule.schule.abstrakte_klassen.formen.Rechteck;

import java.util.Scanner;

public class RechteckCreator extends GeoFormCreator {

	public RechteckCreator(String typ) {
		super(typ);
	}

	@Override
	public GeoForm create() {
		double breite, hoehe;
		Scanner ein = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Breite ein:");
		breite = ein.nextDouble();
		System.out.println("Bitte geben Sie die Hoehe ein:");
		hoehe = ein.nextDouble();
		return new Rechteck(breite, hoehe);
	}

}