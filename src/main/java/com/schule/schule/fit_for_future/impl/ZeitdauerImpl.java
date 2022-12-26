package com.schule.schule.fit_for_future.impl;

import com.schule.schule.fit_for_future.interfaces.Zeitdauer;
import org.springframework.stereotype.Service;

@Service
public class ZeitdauerImpl implements Zeitdauer {
    private long dauer;

    public ZeitdauerImpl(long dauer) {
        this.dauer = dauer;
    }

    public ZeitdauerImpl(int hour, int min, int sec) {
        this.dauer = (hour * 3600L) + (min * 60L) + sec;
    }

    public ZeitdauerImpl() {
        this.dauer = 0;
    }

    @Override
    public void setDauer(long dauer) {
        this.dauer = dauer;
    }

    @Override
    public void setDauer(int hour, int min, int sec) {
        this.dauer = (hour * 3600L) + (min * 60L) + sec;
    }

    @Override
    public long getDauer() {
        return dauer;
    }

    @Override
    public String toString() {
        long hours = dauer / 3600;
        long minutes = (dauer % 3600) / 60;
        long seconds = (dauer % 3600) % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
