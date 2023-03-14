package com.schule.schule.fit_for_future.interfaces;

public interface Kunde {
    void setId(String id);
    String getId();
    void setName(String name);
    String getName();
    void setGewicht(double gewicht);
    double getGewicht();
    void setGroesse(double groesse);
    double getGroesse();
    double getBMI();

}
