package es.iesrafaelalberti.daw.prog.oopsessions.herencia;

public abstract class Explosive {
    private float power;
    private boolean activado;
    private boolean consumido;

    public Explosive(float power, boolean activado) {
        this.power = power;
        this.activado = activado;
        this.consumido = false;
    }

    public Explosive(float power) {
        this.power = power;
        this.activado = false;
        this.consumido = false;
    }

    public static void testStatic() {
        System.out.println("Llamada estática");
    }

    public boolean explotar() {
        if (consumido) return false;
        if (activado) {
            consumido = true;
            return true;
        }
        return false;
    }

    public void pruebaExplosion() {
        if(this.explotar()) {
            System.out.println("hey \t"+this.toString());
        }
    }

    protected void setActivado(boolean activado) {
        this.activado = activado;
    }

    protected float getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Boooommm, " + power + " kilotones para los capitalistas!!!!!";
    }
}

