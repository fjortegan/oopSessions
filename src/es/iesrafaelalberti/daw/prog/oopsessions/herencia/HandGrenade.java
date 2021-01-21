package es.iesrafaelalberti.daw.prog.oopsessions.herencia;

public class HandGrenade extends Explosive {
    private boolean lanzada = false;

    public HandGrenade(float potencia) {
        super(potencia);
    }

    public void retiraAnilla() {
        this.setActivado(true);
    }

    public void lanzar() {
        lanzada = true;
    }

    @Override
    public void pruebaExplosion() {
        //this.retiraAnilla();
        this.lanzar();
        super.pruebaExplosion();
    }

    @Override
    public String toString() {
        return this.lanzada? super.toString() :
                             "Boooommm, tas quedao sin brazo, so tonto!!!!";
    }

}
