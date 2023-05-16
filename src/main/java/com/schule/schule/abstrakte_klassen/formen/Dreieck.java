package com.schule.schule.abstrakte_klassen.formen;

import com.schule.schule.abstrakte_klassen.GeoForm;

public class Dreieck extends GeoForm {
    public double a;
    public double b;
    public double c;

    public Dreieck(double a, double b, double c) {
        super("Dreieck");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getUmfang() {
        return a + b + c;
    }

    public double getFlaeche() {
        double s = getUmfang() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String getType() {
        return super.getTyp();
    }
}