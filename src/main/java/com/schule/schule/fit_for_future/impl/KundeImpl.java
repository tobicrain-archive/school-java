package com.schule.schule.fit_for_future.impl;

import com.schule.schule.bmi.BMIRechner;
import com.schule.schule.fit_for_future.interfaces.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KundeImpl implements Kunde {

    @Autowired
    BMIRechner bmiRechner;

    private String id;
    private String name;
    private double gewicht;
    private double groesse;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }

    @Override
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public double getGroesse() {
        return groesse;
    }

    @Override
    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    @Override
    public double getBMI() {
        return bmiRechner.calculateBMI(gewicht, groesse);
    }


}
