package es.iesrafaelalberti.daw.prog.oopsessions.basketclubs;

import java.util.HashSet;
import java.util.Set;

public class Roster {
    private Set<Player> players;

    Roster() {
        players = new HashSet<>();
    }

    Roster(Player player) {
        players = new HashSet<>();
        players.add(player);
    }

}
