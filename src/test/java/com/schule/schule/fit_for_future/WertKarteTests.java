package com.schule.schule.fit_for_future;


import com.schule.schule.fit_for_future.impl.WertKarteImpl;
import com.schule.schule.fit_for_future.interfaces.WertKarte;
import com.schule.schule.fit_for_future.model.Tarif;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WertKarteTests {

        @Test
        public void testInitialGuthaben() {
            WertKarte wertKarte = new WertKarteImpl();
            assert wertKarte.getGuthaben() == 50.0;
        }
        @Test
        public void testSaunaAbbuchen() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.abbuchenSauna(Tarif.Normal);
            assert wertKarte.getGuthaben() == 35.0;
        }
        @Test
        public void testAufladen() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.aufladen(10.0);
            assert wertKarte.getGuthaben() == 60.0;
        }
        @Test
        public void testAbbuchen() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.abbuchen(10.0);
            assert wertKarte.getGuthaben() == 40.0;
        }
        @Test
        public void testGuthaben() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.aufladen(10.0);
            wertKarte.abbuchen(10.0);
            assert wertKarte.getGuthaben() == 50.0;
        }
        @Test
        public void testGuthaben2() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.aufladen(10.0);
            wertKarte.abbuchenSauna(Tarif.Normal);
            assert wertKarte.getGuthaben() == 45.0;
        }
        @Test
        public void testGuthaben3() {
            WertKarte wertKarte = new WertKarteImpl();
            wertKarte.aufladen(10.0);
            wertKarte.abbuchenSauna(Tarif.Normal);
            wertKarte.abbuchen(10.0);
            assert wertKarte.getGuthaben() == 35.0;
        }

        @Test
        public void testAutomaticTarif() {
            WertKarte wertKarte = new WertKarteImpl();

        }
}
