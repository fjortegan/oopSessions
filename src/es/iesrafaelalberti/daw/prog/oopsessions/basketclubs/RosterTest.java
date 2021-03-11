package es.iesrafaelalberti.daw.prog.oopsessions.basketclubs;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RosterTest {
    @Test
    void testRoster() {
        Player me = new Player(3, "Javier", "PG");
        Player me2 = new Player(13, "Joserra", "PG");
        try {
            Set<Player> myPlayerSet = new HashSet<>();
            myPlayerSet.add(me);
            myPlayerSet.add(me2);
            Roster myRoster = new Roster(myPlayerSet);
//            me.setNumber(6);
            //myRoster.addPlayer(me);
//            myRoster.addPlayer(me2);
            myRoster.printRoster();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}