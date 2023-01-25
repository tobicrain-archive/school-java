package com.schule.schule.fit_for_future.interfaces;

import com.schule.schule.fit_for_future.model.Tarif;

public interface WertKarte {
    double guthaben = 50;
    double getGuthaben();
    double aufladen(double betrag);
    double abbuchenSauna(Tarif tarif);
    double abbuchen(double betrag);
}
