package es.iesrafaelalberti.daw.prog.oopsessions.composicion;

public class Coordenadas {
    private float longitud;
    private float latitud;

    public Coordenadas(float longitud, float latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }
}
