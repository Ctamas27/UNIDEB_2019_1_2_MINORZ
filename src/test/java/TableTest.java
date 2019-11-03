import org.junit.Test;
import static org.junit.Assert.*;

public class TableTest {

    @Test
    public void p() {

        String tabla[][] = new String[4][5];
        Table.checker(2,4,tabla);
    }

    @Test
    public void checkTable() {
        String tabla[][] = {{"B","X","X","X",},
                            {"X","B","X","X",},
                            {"X","X","B","X",},
                            {"X","X","X","X",},
                            {"X","X","X","X",}};

        assertEquals(false, Table.checkTable(tabla));

        String tabla2[][] = {{"R","X","R","R",},
                             {"X","X","X","X",},
                             {"X","R","X","X",},
                             {"X","R","X","X",},
                             {"X","R","X","X",}};

        assertEquals(false, Table.checkTable(tabla2));


        String tabla3[][] = {{"R","X","R","R",},
                             {"X","X","X","X",},
                             {"X","B","X","B",},
                             {"X","B","X","X",},
                             {"X","X","X","B",}};

        assertEquals(true, Table.checkTable(tabla3));

        String tabla4[][] = {{"X","X","X","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",}};

        assertEquals(true, Table.checkTable(tabla4));


    }

    @Test
    public void setTable() {
        String tabla[][] = {{"B","X","X","X",},
                            {"X","X","X","X",},
                            {"X","X","X","X",},
                            {"X","X","X","X",},
                            {"X","X","X","X",}};

        String returnTabla[][] = {{"X","B","X","X",},
                                  {"X","X","X","X",},
                                  {"X","X","X","X",},
                                  {"X","X","X","X",},
                                  {"X","X","X","X",}};

        //String player = PlayerState.State();

        int locX = 0;
        int locY = 0;
        String direction = "right";
        String player = "B";

        assertArrayEquals(returnTabla,Table.setTable(tabla,locX,locY,direction,player));

        String tabla2[][] = {{"X","X","R","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",},
                             {"X","X","X","X",}};

        String returnTabla2[][] = {{"X","R","X","X",},
                                   {"X","X","X","X",},
                                   {"X","X","X","X",},
                                   {"X","X","X","X",},
                                   {"X","X","X","X",}};

        //String player = PlayerState.State();

        int locX2 = 0;
        int locY2 = 2;
        String direction2 = "left";
        String player2 = "R";

        assertArrayEquals(returnTabla2,Table.setTable(tabla2,locX2,locY2,direction2,player2));



    }
}