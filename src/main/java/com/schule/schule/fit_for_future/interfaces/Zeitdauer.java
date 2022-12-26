package com.schule.schule.fit_for_future.interfaces;

public interface Zeitdauer {
    void setDauer(long dauer);
    void setDauer(int hour, int min, int sec);
    long getDauer();
}
