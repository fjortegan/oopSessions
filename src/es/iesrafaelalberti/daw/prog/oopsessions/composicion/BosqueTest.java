package es.iesrafaelalberti.daw.prog.oopsessions.composicion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BosqueTest {
    @Test
    void testConstructorBosque() {
        Bosque miBosque = new Bosque();
        assert miBosque.getPlantas().size() == 0;
        miBosque.addPlanta(new Arbol());
        miBosque.addPlanta(new Arbusto());
        assert miBosque.getPlantas().size() == 2;
        Bosque miBosque2 = new Bosque(new Matorral());
        assert miBosque2.getPlantas().size() == 1;
    }

}