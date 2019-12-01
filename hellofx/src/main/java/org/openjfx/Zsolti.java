package org.openjfx;

//import java.awt.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Zsolti {

    private String currentPlayer = "red";
    private String temp1 = "blue";
    private String temp2 = "blue";

    private String now = "select";
    private String temp3 = "move";
    private String temp4 = "move";

    private boolean feher;

    Label plabel = new Label();

    @FXML
    Label winner;

    @FXML
    public Label current;

    @FXML
    private Label i;

    @FXML
    private Label ii;

    @FXML
    private Label iii;

    @FXML
    private Label iiii;

    @FXML
    private Label iiiii;

    @FXML
    private Label iiiiii;

    @FXML
    private Label iiiiiii;

    @FXML
    private Label iiiiiiii;

    @FXML
    private Label iiiiiiiii;

    @FXML
    private Label iiiiiiiiii;

    @FXML
    private Label iiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiiiiiii;

    @FXML
    private Label iiiiiiiiiiiiiiiiiiii;

    @FXML private javafx.scene.control.Button exit;

    @FXML
    private void backToMenu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
    private void newgame() throws IOException{
        App.setRoot("zsolti");
    }

    @FXML
    private void exit() throws IOException {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }


    private String getTileColor(Label label){
        String currentColor = "blue";

        Pattern pattern = Pattern.compile(".*red.*");
        Matcher matcher = pattern.matcher(label.getStyle());
        Pattern pattern1 = Pattern.compile(".*blue.*");
        Matcher matcher1 = pattern1.matcher(label.getStyle());

        if(matcher.matches() == true)
            currentColor = "red";
        else if(matcher1.matches() == true)
            currentColor = "blue";
        else
            currentColor = "white";

        return currentColor;
    }


    public void selectTile(MouseEvent mouseEvent) throws IOException {
        Label label = new Label();
        String Id = (((Control)mouseEvent.getSource()).getId());
        label.setId(Id);
        label.setStyle(((Control) mouseEvent.getSource()).getStyle());

        if (now.equals("select") && currentPlayer.equals(getTileColor((Label) mouseEvent.getSource()))) {
            ((Control) mouseEvent.getSource()).setStyle("-fx-border-color: black; -fx-border-width: 4; -fx-border-style: solid; -fx-background-color: " + currentPlayer + ";");
            temp2 = currentPlayer;
            currentPlayer = temp1;
            temp1 = temp2;

            temp4 = now;
            now = temp3;
            temp3 = temp4;

            plabel = (Label) mouseEvent.getSource();
        }

        if(now.equals("move")){
            feher = false;
            Pattern pattern1 = Pattern.compile(".*red.*");
            Matcher matcher1 = pattern1.matcher(((Control) mouseEvent.getSource()).getStyle());
            Pattern pattern2 = Pattern.compile(".*blue.*");
            Matcher matcher2 = pattern2.matcher(((Control) mouseEvent.getSource()).getStyle());
            if(matcher1.matches() == false && matcher2.matches() == false)
                feher = true;
        }

        if (now.equals("move") && feher){
            ((Control) mouseEvent.getSource()).setStyle("-fx-border-color: black; -fx-border-width: 1; -fx-border-style: solid; -fx-background-color: " + temp1 + ";");
            temp4 = now;
            now = temp3;
            temp3 = temp4;
            plabel.setStyle("-fx-border-color: black; -fx-border-width: 1; -fx-border-style: solid; -fx-background-color: white;");
            soutCurrentPlayerName();
        }

        if(
            getTileColor(i).equals("red") && getTileColor(ii).equals("red") && getTileColor(iii).equals("red")
        ||
            getTileColor(ii).equals("red") && getTileColor(iii).equals("red") && getTileColor(iiii).equals("red")
        ||
            getTileColor(iiiii).equals("red") && getTileColor(iiiiii).equals("red") && getTileColor(iiiiiii).equals("red")
        ||
            getTileColor(iiiiii).equals("red") && getTileColor(iiiiiii).equals("red") && getTileColor(iiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiii).equals("red") && getTileColor(iiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiiiiiii).equals("red")
        ||
            getTileColor(iiiiiiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiiiiiii).equals("red") && getTileColor(iiiiiiiiiiiiiiiiiiii).equals("red")){

            App.setRoot("zsoltiwin");
            winner.setText("Red player won");
            winner.setStyle("-fx-background-color: " + temp1 + ";");

        }else if(
            getTileColor(i).equals("blue") && getTileColor(ii).equals("blue") && getTileColor(iii).equals("blue")
        ||
            getTileColor(ii).equals("blue") && getTileColor(iii).equals("blue") && getTileColor(iiii).equals("blue")
        ||
            getTileColor(iiiii).equals("blue") && getTileColor(iiiiii).equals("blue") && getTileColor(iiiiiii).equals("blue")
        ||
            getTileColor(iiiiii).equals("blue") && getTileColor(iiiiiii).equals("blue") && getTileColor(iiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiii).equals("blue") && getTileColor(iiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiiiiiii).equals("blue")
        ||
            getTileColor(iiiiiiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiiiiiii).equals("blue") && getTileColor(iiiiiiiiiiiiiiiiiiii).equals("blue")) {
            //throw IOException;
            App.setRoot("zsoltiwin");
            winner.setText("Blue player won");
            winner.setStyle("-fx-background-color: " + temp1 + ";");
        }
    }

    private void soutCurrentPlayerName(){
        current.setText("Most lép: " + currentPlayer);
        current.setStyle("-fx-background-color: " + currentPlayer + ";");
    }
}