package com.schule.schule.fit_for_future.impl;

import com.schule.schule.fit_for_future.interfaces.FitnessCenter;
import com.schule.schule.fit_for_future.interfaces.Kunde;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class FitnessCenterImpl implements FitnessCenter {

    private String name;
    private List<Kunde> kunden;

    @Override
    public Kunde neuerKunde(String id, String name, double gewicht, double groesse) {
        Kunde kunde = new KundeImpl();
        kunde.setId(id);
        kunde.setName(name);
        kunde.setGewicht(gewicht);
        kunde.setGroesse(groesse);

        kunden.add(kunde);

        return kunde;

    }

    @Override
    public Kunde neuerKunde(String id, String name) {
        Kunde kunde = new KundeImpl();
        kunde.setId(id);
        kunde.setName(name);

        kunden.add(kunde);

        return kunde;
    }

    @Override
    public Kunde neuerKunde(String csvString) {
        String[] kunde = csvString.split(",");
        Kunde kunde1 = new KundeImpl();
        kunde1.setId(kunde[0]);
        kunde1.setName(kunde[1]);
        kunde1.setGewicht(Double.parseDouble(kunde[2]));
        kunde1.setGroesse(Double.parseDouble(kunde[3]));

        kunden.add(kunde1);

        return kunde1;
    }

    Kunde deleteKundeById(String id) {
        int index = -1;
        for (int i = 0; i < kunden.size(); i++) {
            if (Objects.equals(kunden.get(i).getId(), id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return null;
        }
        List<Kunde> newArray = (List<Kunde>) Array.newInstance(Kunde.class, kunden.size() - 1);
        Kunde deletedObject = kunden.get(index);
        for (int i = 0, j = 0; i < kunden.size(); i++) {
            if (i == index) {
                continue;
            }
            newArray.set(j++, kunden.get(i));
        }
        this.kunden = newArray;
        return deletedObject;
    }

    @Override
    public Kunde loescheKunde(String id) {
        return deleteKundeById(id);
    }

    @Override
    public void print() {
        for (Kunde kunde : kunden) {
            System.out.println(kunde);
        }
    }

    @Override
    public void printKundenBMI() {
        for (Kunde kunde : kunden) {
            System.out.println(kunde.getBMI());
        }
    }

    @Override
    public double berechneBMITMittelwert() {
        double sum = 0;
        for (Kunde kunde : kunden) {
            sum += kunde.getBMI();
        }
        return sum / kunden.size();
    }
}
