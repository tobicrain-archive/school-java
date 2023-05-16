package com.schule.schule.abstrakte_klassen;

import com.schule.schule.abstrakte_klassen.formen.Dreieck;

import java.util.Scanner;

public class DreieckCreator extends GeoFormCreator {

	public DreieckCreator(String typ) {
		super(typ);
	}

	@Override
	public GeoForm create() {
		double a, b, c;
		Scanner ein = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Seitenlängen ein:");
		System.out.print("a: ");
		a = ein.nextDouble();
		System.out.print("b: ");
		b = ein.nextDouble();
		System.out.print("c: ");
		c = ein.nextDouble();
		return new Dreieck(a, b, c);
	}

}