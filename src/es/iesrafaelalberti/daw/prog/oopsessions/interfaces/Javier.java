package es.iesrafaelalberti.daw.prog.oopsessions.interfaces;

public class Javier implements Profesor, Estudiante {
    @Override
    public String darClase() {
        return "vais a suspender todos/as";
    }

    @Override
    public String prepararClase() {
        return "ups, no he tenido tiempo";
    }

    @Override
    public void recibirClase(Profesor profesor) {
        String pensamiento = "tchin, tchin, tchin";
        System.out.println(pensamiento);
    }
}
