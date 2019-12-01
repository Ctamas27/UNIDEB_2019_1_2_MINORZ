package sample;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Menu {

    @FXML private javafx.scene.control.Button exit;

    @FXML
    private void loadZsoltiGame() throws IOException {
        App.setRoot("zsolti");
    }


    @FXML
    private void loadPetiGame() {

    }

    @FXML
    private void loadTomiGame() throws IOException {
        App.setRoot("tomi");
    }

    @FXML
    private void exit() throws IOException {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }


}
