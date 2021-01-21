package es.iesrafaelalberti.daw.prog.oopsessions.herencia;

public class C4 extends Explosive implements Detonable, Spoilable {
    public C4(float power, boolean activado) {
        super(power, activado);
    }

    public C4(float power) {
        super(power);
    }

    @Override
    public void spoil() {
        this.setActivado(false);
    }

    @Override
    public void putDetonator() {
        this.setActivado(true);
    }

    @Override
    public void quitDetonator() {
        this.setActivado(false);
    }
}
