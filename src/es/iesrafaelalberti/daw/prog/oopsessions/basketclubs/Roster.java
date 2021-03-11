package es.iesrafaelalberti.daw.prog.oopsessions.basketclubs;

import java.util.*;

public class Roster {
    Integer[] array = {12};
    private ArrayList<Integer> retiredNumbers = new ArrayList<>(Arrays.asList(array));
    private Set<Player> players;
//    private List<Player> players;

    Roster() {
        players = new HashSet<>();
//        players = new Vector<>();
    }

    Roster(Player player) throws Exception {
        players = new HashSet<>();
//        players = new Vector<>();
        this.addPlayer(player);
    }

    Roster(Set<Player> players) throws Exception {
//    Roster(List<Player> players) {
        this.players = new HashSet<>();
        for (Player player:
             players) {
            this.addPlayer(player);
        }
        this.players = players;
    }

    public void addPlayer(Player player) throws Exception {
        if (retiredNumbers.contains(player.getNumber()))
            throw new Exception("Número retirado");
        this.players.add(player);
    }

    void printRoster() {
        for (Player player:
             this.players) {
            System.out.println(player);
        }
    }

}
