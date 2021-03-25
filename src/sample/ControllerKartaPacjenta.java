package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ControllerKartaPacjenta {
    Stage primaryStage;
    @FXML
    Button buttonLogin, exit_button, minimalize_button;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> nazwisko_table, imie_table, pesel_table, data_table,godzina_table;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_button.getScene().getWindow();
        stage.close();
    }

    public void minimize(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_button.getScene().getWindow();
        stage.setIconified(true);
    }


    //metoda na przycisk wyloguj ktora otwiera scene sample.fxml
    public void wyloguj(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene loginScene = new Scene(loginParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }
    public void wizyty(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("wizyty.fxml"));
        Scene loginScene = new Scene(loginParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }
    public void kalendarz(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("kalendarz.fxml"));
        Scene loginScene = new Scene(loginParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }
    public void pacjenci(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("pacjenci.fxml"));
        Scene loginScene = new Scene(loginParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }

}
