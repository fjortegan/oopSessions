package es.iesrafaelalberti.daw.prog.oopsessions.herencia;

public class TNT extends Explosive implements Spoilable {
    public TNT(float power, boolean activado) {
        super(power, activado);
    }

    public TNT(float power) {
        super(power);
    }

    @Override
    public void spoil() {
        this.setActivado(false);
    }
}
