package ej511;

import java.util.Objects;

public class Cuenta {
    private Cliente cliente;
    private String IBAN;
    private float saldo;

    public Cuenta(Cliente cliente, String IBAN, float saldo) throws Exception {
        if(cliente == null) throw new Exception("Cliente no válido");
        this.cliente = cliente;
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cliente=" + cliente +
                ", IBAN='" + IBAN + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return IBAN.equals(cuenta.IBAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IBAN);
    }
}
