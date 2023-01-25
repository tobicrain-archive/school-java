package com.schule.schule.fit_for_future.model;

import java.time.LocalTime;

public enum Tarif {
    HappyHour, Normal;
    public double getPrice() {
        return switch (this) {
            case HappyHour -> 12.0;
            case Normal -> 15.0;
        };
    }

    public static Tarif getTarif() {
        return LocalTime.now().isBefore(LocalTime.of(12, 0)) ? Normal : HappyHour;
    }
}