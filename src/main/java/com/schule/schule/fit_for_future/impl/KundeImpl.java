package com.schule.schule.fit_for_future.impl;

import com.schule.schule.bmi.BMIRechner;
import com.schule.schule.fit_for_future.interfaces.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KundeImpl implements Kunde {

    @Autowired
    BMIRechner bmiRechner;

    private int id;
    private String name;
    private int gewicht;
    private int groesse;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
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
    public int getGewicht() {
        return gewicht;
    }

    @Override
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public int getGroesse() {
        return groesse;
    }

    @Override
    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    @Override
    public double getBMI() {
        return bmiRechner.calculateBMI(gewicht, groesse);
    }


}
