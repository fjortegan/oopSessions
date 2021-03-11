package es.iesrafaelalberti.daw.prog.oopsessions.composicion;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    List<Planta> plantas;

    Bosque() {
        plantas = new ArrayList<>();
    }

    Bosque(Planta planta) {
        plantas = new ArrayList<>();
        plantas.add(planta);
    }

    public void addPlanta(Planta planta) {
        plantas.add(planta);
    }

    public List<Planta> getPlantas() {
        return plantas;
    }
}
