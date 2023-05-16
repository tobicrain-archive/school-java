package com.schule.schule.abstrakte_klassen.formen;

import com.schule.schule.abstrakte_klassen.GeoForm;

public class Kreis extends GeoForm {
    public double radius;

    public Kreis(double radius) {
        super("Kreis");
        this.radius = radius;
    }

    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    public double getFlaeche() {
        return Math.PI * radius * radius;
    }

    public String getType() {
        return super.getTyp();
    }

    public double getRadius() {
        return radius;
    }


}