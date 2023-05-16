package com.schule.schule.abstrakte_klassen.formen;

public class Quader extends Rechteck {
    private double tiefe;

    public Quader(int breite, int hoehe, int tiefe) {
        super(breite, hoehe);
        this.tiefe = tiefe;
    }

    public Quader(double breite, double hoehe, double tiefe) {
        super(breite, hoehe);
        this.tiefe = tiefe;
    }

    public double getTiefe() {
        return tiefe;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
    }

    public double getVolumen() {
        return getFlaeche() * this.tiefe;
    }

    @Override
    public double getFlaeche() {
        return 2 * (super.getFlaeche() + getBreite() * tiefe + getHoehe() * tiefe);
    }

}