package com.schule.schule.abstrakte_klassen.formen;

import com.schule.schule.abstrakte_klassen.GeoForm;

public class Rechteck extends GeoForm {
    private double breite;
    private double hoehe;

    public Rechteck(double breite, double hoehe) {
        super("Rechteck");
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getUmfang() {
        return 2 * (this.breite + this.hoehe);
    }

    public double getFlaeche() {
        return this.breite * this.hoehe;
    }

    public String getType() {
        return super.getTyp();
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

}