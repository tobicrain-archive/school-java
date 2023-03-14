package com.schule.schule.rechteck;

public class Quader extends Rechteck {
    private int tiefe;

    public Quader(int breite, int hoehe, int tiefe) {
        super(breite, hoehe);
        this.tiefe = tiefe;
    }

    public int getTiefe() {
        return tiefe;
    }

    public void setTiefe(int tiefe) {
        this.tiefe = tiefe;
    }

    public int getVolumen() {
        return getFlaeche() * this.tiefe;
    }

    @Override
    public int getFlaeche() {
        return 2 * (super.getFlaeche() + getBreite() * tiefe + getHoehe() * tiefe);
    }

}
