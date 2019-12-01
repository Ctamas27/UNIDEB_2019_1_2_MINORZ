package sample;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.paint.Color.*;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Scanner;
import java.lang.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.WHITE;


public class Controller extends Zsolti{

    @FXML
    private Label apadfasza;
    @FXML
        private Circle circle01;
        @FXML
        private Circle circle02;
        @FXML
        private Circle circle03;
        @FXML
        private Circle circle04;
        @FXML
        private Circle circle05;
        @FXML
        private Circle circle06;
        @FXML
        private Circle circle11;
        @FXML
        private Circle circle12;
        @FXML
        private Circle circle13;
        @FXML
        private Circle circle14;
        @FXML
        private Circle circle15;
        @FXML
        private Circle circle16;
        @FXML
        private Circle circle21;
        @FXML
        private Circle circle22;
        @FXML
        private Circle circle23;
        @FXML
        private Circle circle24;
        @FXML
        private Circle circle25;
        @FXML
        private Circle circle26;
        @FXML
        private Circle circle31;
        @FXML
        private Circle circle32;
        @FXML
        private Circle circle33;
        @FXML
        private Circle circle34;
        @FXML
        private Circle circle35;
        @FXML
        private Circle circle36;
        @FXML
        private Circle circle41;
        @FXML
        private Circle circle42;
        @FXML
        private Circle circle43;
        @FXML
        private Circle circle44;
        @FXML
        private Circle circle45;
        @FXML
        private Circle circle46;
        @FXML
        private Circle circle51;
        @FXML
        private Circle circle52;
        @FXML
        private Circle circle53;
        @FXML
        private Circle circle54;
        @FXML
        private Circle circle55;
        @FXML
        private Circle circle56;
        @FXML
        private Circle circle61;
        @FXML
        private Circle circle62;
        @FXML
        private Circle circle63;
        @FXML
        private Circle circle64;
        @FXML
        private Circle circle65;
        @FXML
        private Circle circle66;
        @FXML
        private Circle nextplayer;;
        @FXML
        private javafx.scene.control.Button exit;

        private Color Player1color = Color.BLUE;
        private Color Player2color = Color.RED;

        private boolean playerstate = true;
        private Color asd = null;

        public Color playercolor ()
        {
            if(playerstate)
            {
                asd = Player1color;
                playerstate = false;
            }
            else
            {
                asd = Player2color;
                playerstate = true;
            }


            return asd;
        }


        public String[][] generateTable()
        {
            String tabla[][] = new String[6][7];

            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 7; j++)
                {
                    tabla[i][j] = "X";
                }
            }
            return tabla;
        }

        String[][] tabla = generateTable();


    public static String checker(int x, int y, String tabla[][])
    {
        if(x < 0 || y < 0 || x >= 6 || y >= 7)
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

        for(int i = 0; i < 6;i++)
        {
            for(int j = 0; j < 7;j++)
            {
                if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i,j + 1,tabla) && checker(i,j,tabla) == checker(i,j + 2,tabla) && checker(i,j,tabla) == checker(i,j + 3,tabla))
                {
                    victoryState = false;
                }
                if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i + 1,j,tabla) && checker(i,j,tabla) == checker(i + 2,j,tabla) && checker(i,j,tabla) == checker(i + 3,j,tabla))
                {
                    victoryState = false;
                }
            }
        }
        for(int i = 0; i < 6;i++)
        {
            for (int j = 0; j < 7; j++)
            {
                for(int d = -1; d<=1;d+=2)
                {
                    if(checker(i,j,tabla) != "X" && checker(i,j,tabla) == checker(i + 1 * d,j + 1,tabla) && checker(i,j,tabla) == checker(i + 2 * d,j + 2,tabla) && checker(i,j,tabla) == checker(i + 3 * d,j + 3,tabla))
                    {
                        victoryState = false;
                    }
                }
            }
        }

        return victoryState;
    }

    public void setTable(int y, int x)
    {
        if (asd == BLUE)
        {
            tabla[x][y] = "B";
        }
        else
        {
            tabla[x][y] = "R";
        }
    }

    public static void showTable(String tabla[][])
    {

        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public void EndGame () throws IOException {
        if(!checkTable(tabla))
        {
            App.setRoot("zsoltiwin");
            Zsolti zsolti = new Zsolti();
            zsolti.soutCurrentPlayerName(winner, "Nyert", "blue");

        }
    }

    @FXML
    private void backToMenu(ActionEvent actionEvent) throws IOException{
        App.setRoot("menu");
    }
    @FXML
    private void exit(ActionEvent actionEvent) throws  IOException{
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

        @FXML
        private void button1(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());

            if (circle06.getFill() == WHITE)
            {
                circle06.setFill(playercolor());
                setTable(0,5);
                EndGame();

            }
            else if (circle05.getFill() == WHITE)
            {
                circle05.setFill(playercolor());
                setTable(0,4);
                EndGame();

            }
            else if (circle04.getFill() == WHITE)
            {
                circle04.setFill(playercolor());
                setTable(0,3);
                EndGame();

            }
            else if (circle03.getFill() == WHITE)
            {
                circle03.setFill(playercolor());
                setTable(0,2);
                EndGame();

            }
            else if (circle02.getFill() == WHITE)
            {
                circle02.setFill(playercolor());
                setTable(0,1);
                EndGame();

            }
            else if (circle01.getFill() == WHITE)
            {
                circle01.setFill(playercolor());
                setTable(0,0);
                EndGame();
            }
            showTable(tabla);
        }
        public void button2(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());

            if (circle16.getFill() == WHITE)
            {
                circle16.setFill(playercolor());
                setTable(1,5);
                EndGame();
            }
            else if (circle15.getFill() == WHITE)
            {
                circle15.setFill(playercolor());
                setTable(1,4);
                EndGame();
            }
            else if (circle14.getFill() == WHITE)
            {
                circle14.setFill(playercolor());
                setTable(1,3);
                EndGame();
            }
            else if (circle13.getFill() == WHITE)
            {
                circle13.setFill(playercolor());
                setTable(1,2);
                EndGame();
            }
            else if (circle12.getFill() == WHITE)
            {
                circle12.setFill(playercolor());
                setTable(1,1);
                EndGame();
            }
            else if (circle11.getFill() == WHITE)
            {
                circle11.setFill(playercolor());
                setTable(1,0);
                EndGame();
            }
            showTable(tabla);
        }

        public void button3(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());

            if (circle26.getFill() == WHITE)
            {
                circle26.setFill(playercolor());
                setTable(2,5);
                EndGame();
            }
            else if (circle25.getFill() == WHITE)
            {
                circle25.setFill(playercolor());
                setTable(2,4);
                EndGame();
            }
            else if (circle24.getFill() == WHITE)
            {
                circle24.setFill(playercolor());
                setTable(2,3);
                EndGame();
            }
            else if (circle23.getFill() == WHITE)
            {
                circle23.setFill(playercolor());
                setTable(2,2);
                EndGame();
            }
            else if (circle22.getFill() == WHITE)
            {
                circle22.setFill(playercolor());
                setTable(2,1);
                EndGame();
            }
            else if (circle21.getFill() == WHITE)
            {
                circle21.setFill(playercolor());
                setTable(2,0);
                EndGame();
            }
            showTable(tabla);
        }

        public void button4(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());

            if (circle36.getFill() == WHITE)
            {
                circle36.setFill(playercolor());
                setTable(3,5);
                EndGame();
            }
            else if (circle35.getFill() == WHITE)
            {
                circle35.setFill(playercolor());
                setTable(3,4);
                EndGame();
            }
            else if (circle34.getFill() == WHITE)
            {
                circle34.setFill(playercolor());
                setTable(3,3);
                EndGame();
            }
            else if (circle33.getFill() == WHITE)
            {
                circle33.setFill(playercolor());
                setTable(3,2);
                EndGame();
            }
            else if (circle32.getFill() == WHITE)
            {
                circle32.setFill(playercolor());
                setTable(3,1);
                EndGame();
            }
            else if (circle31.getFill() == WHITE)
            {
                circle31.setFill(playercolor());
                setTable(3,0);
                EndGame();
            }
            showTable(tabla);
        }

        public void button5(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());
            if (circle46.getFill() == WHITE)
            {
                circle46.setFill(playercolor());
                setTable(4,5);
                EndGame();
            }
            else if (circle45.getFill() == WHITE)
            {
                circle45.setFill(playercolor());
                setTable(4,4);
                EndGame();
            }
            else if (circle44.getFill() == WHITE)
            {
                circle44.setFill(playercolor());
                setTable(4,3);
                EndGame();
            }
            else if (circle43.getFill() == WHITE)
            {
                circle43.setFill(playercolor());
                setTable(4,2);
                EndGame();
            }
            else if (circle42.getFill() == WHITE)
            {
                circle42.setFill(playercolor());
                setTable(4,1);
                EndGame();
            }
            else if (circle41.getFill() == WHITE)
            {
                circle41.setFill(playercolor());
                setTable(4,0);
                EndGame();
            }
            showTable(tabla);
        }

        public void button6(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());
            if (circle56.getFill() == WHITE)
            {
                circle56.setFill(playercolor());
                setTable(5,5);
                EndGame();
            }
            else if (circle55.getFill() == WHITE)
            {
                circle55.setFill(playercolor());
                setTable(5,4);
                EndGame();
            }
            else if (circle54.getFill() == WHITE)
            {
                circle54.setFill(playercolor());
                setTable(5,3);
                EndGame();
            }
            else if (circle53.getFill() == WHITE)
            {
                circle53.setFill(playercolor());
                setTable(5,2);
                EndGame();
            }
            else if (circle52.getFill() == WHITE)
            {
                circle52.setFill(playercolor());
                setTable(5,1);
                EndGame();
            }
            else if (circle51.getFill() == WHITE)
            {
                circle51.setFill(playercolor());
                setTable(5,0);
                EndGame();
            }
            showTable(tabla);
        }

        public void button7(ActionEvent actionEvent) throws IOException {
            playercolor();
            nextplayer.setFill(playercolor());
            if (circle66.getFill() == WHITE)
            {
                circle66.setFill(playercolor());
                setTable(6,5);
                EndGame();
            }
            else if (circle65.getFill() == WHITE)
            {
                circle65.setFill(playercolor());
                setTable(6,4);
                EndGame();
            }
            else if (circle64.getFill() == WHITE)
            {
                circle64.setFill(playercolor());
                setTable(6,3);
                EndGame();
            }
            else if (circle63.getFill() == WHITE)
            {
                circle63.setFill(playercolor());
                setTable(6,2);
                EndGame();
            }
            else if (circle62.getFill() == WHITE)
            {
                circle62.setFill(playercolor());
                setTable(6,1);
                EndGame();
            }
            else if (circle61.getFill() == WHITE)
            {
                circle61.setFill(playercolor());
                setTable(6,0);
                EndGame();
            }
            showTable(tabla);
        }
}
