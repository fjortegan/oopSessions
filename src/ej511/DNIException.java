package ej511;

public class DNIException extends Exception {
    public DNIException(String message) {
        super("DNI incorrecto: " + message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
