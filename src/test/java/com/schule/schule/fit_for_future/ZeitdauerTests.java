package com.schule.schule.fit_for_future;

import com.schule.schule.fit_for_future.interfaces.Zeitdauer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ZeitdauerTests {
    @Autowired
    Zeitdauer zeitdauer;

    @Test
    public void testZeitdauer() {
        zeitdauer.setDauer(3600);
        Assert.isTrue(zeitdauer.getDauer() == 3600, "Zeitdauer ist nicht 3600");
    }

    @Test
    public void testZeitdauer2() {
        zeitdauer.setDauer(1, 0, 0);
        Assert.isTrue(zeitdauer.getDauer() == 3600, "Zeitdauer ist nicht 3600");
    }

    @Test
    public void testZeitdauer3() {
        zeitdauer.setDauer(1, 0, 0);
        Assert.isTrue(zeitdauer.toString().equals("01:00:00"), "Zeitdauer ist nicht 01:00:00");
    }

}
