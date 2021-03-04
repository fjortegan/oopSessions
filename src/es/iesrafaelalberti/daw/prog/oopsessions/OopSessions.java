package es.iesrafaelalberti.daw.prog.oopsessions;

import es.iesrafaelalberti.daw.prog.oopsessions.dataStructures.TestArrays;
import es.iesrafaelalberti.daw.prog.oopsessions.herencia.Explosive;
import es.iesrafaelalberti.daw.prog.oopsessions.herencia.HandGrenade;
import es.iesrafaelalberti.daw.prog.oopsessions.herencia.Spoilable;
import es.iesrafaelalberti.daw.prog.oopsessions.herencia.TNT;

public class OopSessions {
    public static void main(String[] args) {
        //testHerencia();
        testArrays();
    }

    public static void testHerencia() {
        //Explosive pp = new Explosive(22f);
        Explosive myTNT = new TNT(34f, true);
        //((Spoilable) myTNT).spoil();
        myTNT.pruebaExplosion();
        Explosive myHandGrenade = new HandGrenade(3.5f);
        myHandGrenade.pruebaExplosion();
    }

    public static void testArrays() {
        TestArrays myTestArray = new TestArrays(true);
    }
}
