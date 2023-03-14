package com.schule.schule.fit_for_future.interfaces;

public interface FitnessCenter {
    Kunde neuerKunde(String id, String name, double gewicht, double groesse);
    Kunde neuerKunde(String id, String name);
    Kunde neuerKunde(String csvString);
    Kunde loescheKunde(String id);
    void print();
    void printKundenBMI();
    double berechneBMITMittelwert();
}
