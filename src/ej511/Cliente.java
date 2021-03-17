package ej511;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String movil;
    private final static String[] LETRASDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                                               "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public Cliente(String nombre, String apellidos, String DNI, String movil) throws DNIException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.setDNI(DNI);
        this.movil = movil;
    }

    private void compruebaDNI(String DNI) throws DNIException {
        try {
            // Último caracter (python): DNI[-1]
            String letra = DNI.substring(DNI.length() - 1);
            String numeroString = DNI.substring(0, DNI.length() - 1);
            int numero = Integer.parseInt(numeroString);
            int indiceLetra = numero % 23;
            if(!letra.toUpperCase().equals(Cliente.LETRASDNI[indiceLetra]))
                throw new Exception("Letra incorrecta");
        } catch (Exception e) {
            throw new DNIException(e.getMessage());
        }
    }

    private boolean compruebaDNIBool(String DNI) {
        try {
            // Último caracter (python): DNI[-1]
            String letra = DNI.substring(DNI.length() - 1);
            String numeroString = DNI.substring(0, DNI.length() - 1);
            int numero = Integer.parseInt(numeroString);
            int indiceLetra = numero % 23;
            if(!letra.toUpperCase().equals(Cliente.LETRASDNI[indiceLetra]))
                throw new Exception("Letra incorrecta");
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean compruebaDNIAlesWay() {
        boolean flag = false;
        char letra;
        char[] dni_chars = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        String ram_str = "";
        int fin_dni_int;
        int resto;
        if(DNI.length() != 9 | !Character.isLetter(DNI.charAt(8))) {
            return false;
        }
        for(int i = 0; i<DNI.length()-1; i++){
            if (!Character.isDigit(DNI.charAt(i))) return false;
            ram_str += DNI.charAt(i);
        }
        fin_dni_int = Integer.parseInt(ram_str);
        resto = fin_dni_int % 23;
        letra = DNI.charAt(8);
        letra = (Character.toUpperCase(letra));
        return dni_chars[resto] == letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) throws DNIException {
        compruebaDNI(DNI);
        this.DNI = DNI;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return DNI.equals(cliente.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
}
