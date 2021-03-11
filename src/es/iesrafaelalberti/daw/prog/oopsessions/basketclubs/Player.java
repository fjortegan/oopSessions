package es.iesrafaelalberti.daw.prog.oopsessions.basketclubs;

import lombok.Data;

import java.util.Objects;
import java.util.Random;

public class Player {
    private int number;
    private String name;
    private String position;

    public Player(int number, String name, String position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

//    @Override
//    public String toString() {
//        return number + " " + name + " (" + position + ")";
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number;
    }

    @Override
    public int hashCode() {
        Random myRandom = new Random();
        return Objects.hash(number);
    }
}
