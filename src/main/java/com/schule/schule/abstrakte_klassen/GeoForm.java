package com.schule.schule.abstrakte_klassen;

public class GeoForm {
    private double flaeche;
    private double umfang;
    private String typ;

    public GeoForm(String typ) {
        this.typ = typ;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double getUmfang() {
        return umfang;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}