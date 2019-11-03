import java.util.Scanner;
import java.lang.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


/*
    A projekt demo verziojaban a fejlesztes egy gepen tortent, az egyszeruseg miatt (nagyobb cegeknel is tortenik ilyen) osszeultunk offline, es ugy irtuk meg a kodot
 */

class Figure {
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    public static int getLocationx() {
        String color = PlayerState.getPlayer();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter y pos of choosen" + color + " circle: (1-5)");
        String  s = in.nextLine();
        int num = Integer.parseInt(s);
        num--;
        if(num < 0 || num >= 5){
            System.out.println("Non existent step");
            getLocationx();
            logger.warn("Invalid step Y");
        }
        return num;
    }
    public static int getLocationy() {
        String color = PlayerState.getPlayer();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter x pos of choosen "+ color +" circle: (1-4)");
        String  s = in2.nextLine();
        int num2 = Integer.parseInt(s);
        num2--;
        if(num2 < 0 || num2 >= 6){
            System.out.println("Non existent step");
            getLocationy();
            logger.warn("Invalid step X");
        }
        return num2;
    }
    public static String getDirection(){
        String color = PlayerState.getPlayer();
        Scanner in3 = new Scanner(System.in);
        System.out.println("Enter direction of choosen "+ color +" circle: (up, down, left, right)");
        String  s = in3.nextLine();
        logger.info("Direction given");

        return s;
    }
    public static String getPlayerName(String playerNum){
        Scanner in4 = new Scanner(System.in);
        System.out.println(" Player " + playerNum + " Enter your name: ");
        String s = in4.nextLine();
        logger.info("Scanning player name");

        return s;
    }
}

class Table {
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    public static String checker(int x, int y, String tabla[][])
    {
        if(x < 0 || y < 0 || x >= 5 || y >= 4)
        {
            return "X";
        }
        else
        {
            String string = tabla[x][y];
            return string;
        }

    }
    public static boolean checkTable(String tabla[][]){
        boolean victoryState = true;

            for(int i = 0; i < 5;i++)
            {
                for(int j = 0; j < 4;j++)
                {
                           if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i,j + 1,tabla) && checker(i,j,tabla) == checker(i,j + 2,tabla))
                           {
                                victoryState = false;
                               logger.info("Found winning situation in horizontal line");
                           }
                           if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i + 1,j,tabla) && checker(i,j,tabla) == checker(i + 2,j,tabla))
                           {
                                victoryState = false;
                               logger.info("Found winning situation in vertical line");
                           }
                }
            }
        for(int i = 0; i < 5;i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for(int d = -1; d<=1;d+=2)
                {
                    if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i + 1 * d,j + 1,tabla) && checker(i,j,tabla) == checker(i + 2 * d,j + 2,tabla))
                    {
                        victoryState = false;
                        logger.info("Found winning situation in cross line");
                    }
                }
            }
        }
        return victoryState;
    }
    public static void showTable(String tabla[][])
    {
        logger.info("Display table to the console");
        System.out.print("  ");

        for(int l = 0; l < 4; l++)
        {
            System.out.print(l + 1 + " ");
        }
        System.out.print("\n");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(i + 1 + " ");
            for(int j = 0; j < 4; j++)
            {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static String[][] setTable(String tabla[][], int locX, int locY, String direction, String player) {

        logger.info("Setting table by the new parameters");

        boolean runTil = true;

        do {
            if(tabla[locX][locY] == player) {
                if (direction.contains("up")) {
                    if (locX - 1 < 0 || tabla[locX - 1][locY] == "B" || tabla[locX - 1][locY] == "R") {
                        System.out.println("Up Step is invalid");
                        direction = Figure.getDirection();
                        runTil = true;
                        logger.warn("Invalid Up step");
                    } else {
                        tabla[locX][locY] = "X";
                        tabla[locX - 1][locY] = player;
                        logger.info("Table modified");
                        runTil = false;
                    }
                }
                if (direction.contains("down")) {
                    if (locX + 1 > 4 || tabla[locX + 1][locY] == "B" || tabla[locX + 1][locY] == "R") {
                        System.out.println("Down Step is invalid");
                        direction = Figure.getDirection();
                        runTil = true;
                        logger.warn("Invalid Down step");
                    } else {
                        tabla[locX][locY] = "X";
                        tabla[locX + 1][locY] = player;
                        logger.info("Table modified");
                        runTil = false;
                    }
                }
                if (direction.contains("left")) {
                    if (locY - 1 < 0 || tabla[locX][locY - 1] == "B" || tabla[locX][locY - 1] == "R") {
                        System.out.println("Left Step is invalid");
                        direction = Figure.getDirection();
                        runTil = true;
                        logger.warn("Invalid Left step");
                    } else {
                        tabla[locX][locY] = "X";
                        tabla[locX][locY - 1] = player;
                        logger.info("Table modified");
                        runTil = false;
                    }
                }
                if (direction.contains("right")) {
                    if (locY + 1 > 4 || tabla[locX][locY + 1] == "B" || tabla[locX][locY + 1] == "R") {
                        System.out.println("Right Step is invalid");
                        direction = Figure.getDirection();
                        runTil = true;
                        logger.warn("Invalid Right step");
                    } else {
                        tabla[locX][locY] = "X";
                        tabla[locX][locY + 1] = player;
                        logger.info("Table modified");
                        runTil = false;
                    }
                }
            }
            else
            {
                System.out.println("That's not your figure");
                logger.info("Invalid figure call");
                locY = Figure.getLocationy();
                locX = Figure.getLocationx();
            }
        }while(runTil);

        return tabla;
    }
}

class Players{
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    private static String name1;
    private static String name2;


    public static String player1(String playerNum){
        name1 = Figure.getPlayerName(playerNum);
        return name1;
    }

    public static String player2(String playerNum){
        name2 = Figure.getPlayerName(playerNum);
        return name2;
    }
    public static String getName1(){
        return name1;
    }
    public static String getName2(){
        return name2;
    }

}

class PlayerState{
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    private static boolean playerState = true;
    private static String player = null;

    public static String State() {

        if (playerState) {
            player = "B";
            playerState = false;
            logger.info("Player state is B");
        } else {
            player = "R";
            playerState = true;
            logger.info("Player state is R");
        }
        return player;
    }
    public static String getPlayer(){
        return player;
    }
}

class Json {
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    public static void JsonWriter(String name1, String name2, int gamesWonByPlayer1, int gamesWonByPlayer2)
    {
        logger.info("Writing Json file");

        JSONObject playerDetails1 = new JSONObject();
        playerDetails1.put("name", name1);
        playerDetails1.put("Won games", gamesWonByPlayer1);

        JSONObject player1 = new JSONObject();
        player1.put("player1", playerDetails1);

        JSONObject playerDetails2 = new JSONObject();
        playerDetails2.put("name", name2);
        playerDetails2.put("Won games", gamesWonByPlayer2);

        JSONObject player2 = new JSONObject();
        player2.put("player2", playerDetails2);

        JSONArray Players = new JSONArray();
        Players.add(player1);
        Players.add(player2);



        try {
            FileWriter file = new FileWriter("names.json");
            file.write(Players.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String JsonReader() {
        logger.info("Reading Json file");

        JSONParser jsonParser = new JSONParser();
        String wow = null;
        JSONArray PlayersList = null;

        try {
            FileReader reader = new FileReader("names.json");

            Object obj = jsonParser.parse(reader);

            PlayersList = (JSONArray) obj;

            wow = PlayersList.toJSONString();

            Circle player1 = new Circle();




            // wow = PlayersList.toJSONString();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        return wow;
    }

}

class endGame {
    private static Logger logger = LoggerFactory.getLogger(Circle.class);
    public static void whoWon(String player, String name1, String name2, int gamesWonByPlayer1, int gamesWonByPlayer2){
        if(player == "B")
        {
            String n = Players.getName1();
            gamesWonByPlayer1++;
            Json.JsonWriter(name1, name2, gamesWonByPlayer1, gamesWonByPlayer2);
            System.out.println(n + " won the game");
            logger.info(n + " won the game");
        }
        else
        {
            String l = Players.getName2();
            gamesWonByPlayer2++;
            Json.JsonWriter(name1, name2, gamesWonByPlayer1, gamesWonByPlayer2);
            System.out.println(l + " won the game");
            logger.info(l + " won the game");
        }
    }
}

public class Circle {

        public static String[][] generateTable(){
            logger.info("Filling table string with X's");

            String tabla[][] = new String[5][4];

            for(int i = 0; i < 5; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    tabla[i][j] = "X";
                }
            }

            for(int i = 0; i < 2; i++)
            {
                tabla[0][i * 2] =  "B";
                tabla[0][i * 2 + 1] =  "R";
                tabla[4][i * 2] =  "R";
                tabla[4][i * 2 + 1] =  "B";
            }
            return tabla;
        }

        private static Logger logger = LoggerFactory.getLogger(Circle.class);

        public static void main(String[] args) {

            int gamesWonByPlayer1 = 0;
            int gamesWonByPlayer2 = 0;


            boolean gameTill = true;

            while(gameTill) {

            String tabla[][] = generateTable();
            String player = null;

            String name1 = Players.player1("1");
            System.out.println("You are player one: (Blue) " + name1);

            String name2 = Players.player2("2");
            System.out.println("You are player two: (Red) " + name2);

            Json.JsonWriter(name1, name2, gamesWonByPlayer1, gamesWonByPlayer2);

            String valami = Json.JsonReader();

            System.out.println(valami);




                do {

                    player = PlayerState.State();


                    if (PlayerState.getPlayer() == "B") {
                        System.out.println("Your turn " + name1);
                        logger.info("Jatekos 1 kore");
                    }
                    if (PlayerState.getPlayer() == "R") {
                        System.out.println("Your turn " + name2);
                        logger.info("Jatekos 2 kore");
                    }

                    Table.showTable(tabla);

                    int locY = Figure.getLocationy();
                    int locX = Figure.getLocationx();
                    String direction = Figure.getDirection();

                /*System.out.println(locY+1);
                System.out.println(locX+1);
                System.out.println(direction);*/

                    tabla = Table.setTable(tabla, locX, locY, direction, player);
                } while (Table.checkTable(tabla));

                endGame.whoWon(player, name1, name2, gamesWonByPlayer1, gamesWonByPlayer2);

                Scanner in3 = new Scanner(System.in);
                System.out.println("Do you want to replay? (y/n)");
                String s = in3.nextLine();

                if (s == "y") {
                    logger.info("Game is restarting");
                    gameTill = true;
                }
            }
        }
}