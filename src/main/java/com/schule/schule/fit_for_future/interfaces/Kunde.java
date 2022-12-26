package com.schule.schule.fit_for_future.interfaces;

public interface Kunde {
    void setId(int id);
    int getId();
    void setName(String name);
    String getName();
    void setGewicht(int gewicht);
    int getGewicht();
    void setGroesse(int groesse);
    int getGroesse();
    double getBMI();

}
