package com.schule.schule.fit_for_future.impl;

import com.schule.schule.fit_for_future.interfaces.WertKarte;
import com.schule.schule.fit_for_future.model.Tarif;

public class WertKarteImpl implements WertKarte {

    private double guthaben = 50.0;
    @Override
    public double getGuthaben() {
        return guthaben;
    }

    @Override
    public double aufladen(double betrag) {
        guthaben += betrag;
        return guthaben;
    }

    @Override
    public double abbuchenSauna(Tarif tarif) {
        guthaben -= tarif.getPrice();
        return guthaben;
    }

    @Override
    public double abbuchen(double betrag) {
        guthaben -= betrag;
        return guthaben;
    }
}
