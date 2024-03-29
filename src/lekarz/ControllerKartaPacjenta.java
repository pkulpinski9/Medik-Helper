package lekarz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;

import javafx.stage.Stage;

public class ControllerKartaPacjenta {
    Stage primaryStage;
    @FXML
    Button buttonLogin, exit_button, minimalize_button;


    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_button.getScene().getWindow();
        stage.close();
    }

    public void minimize(ActionEvent actionEvent) {
        Stage stage = (Stage) minimalize_button.getScene().getWindow();
        stage.setIconified(true);
    }


    //metoda na przycisk wyloguj ktora otwiera scene sample.fxml
    public void wyloguj(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("../sample/sample.fxml"));
        Scene loginScene = new Scene(loginParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }

    public void wizyty(ActionEvent actionEvent) throws IOException {
        Parent wizytyParent = FXMLLoader.load(getClass().getResource("wizyty.fxml"));
        Scene wizytyScene = new Scene(wizytyParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(wizytyScene);
        window.show();
    }

    public void kalendarz(ActionEvent actionEvent) throws IOException {
        Parent kalendarzParent = FXMLLoader.load(getClass().getResource("kalendarz.fxml"));
        Scene kalendarzScene = new Scene(kalendarzParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(kalendarzScene);
        window.show();
    }

    public void pacjenci(ActionEvent actionEvent) throws IOException {
        Parent pacjenciParent = FXMLLoader.load(getClass().getResource("pacjenci.fxml"));
        Scene pacjenciScene = new Scene(pacjenciParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(pacjenciScene);
        window.show();
    }
    public void skierowanie(ActionEvent actionEvent) throws IOException {
        Parent skierowanieParent = FXMLLoader.load(getClass().getResource("skierowanie.fxml"));
        Scene skierowanieScene = new Scene(skierowanieParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(skierowanieScene);
        window.show();
    }

    public void choroby(ActionEvent actionEvent) throws IOException {
        Parent chorobyParent = FXMLLoader.load(getClass().getResource("choroby.fxml"));
        Scene chorobyScene = new Scene(chorobyParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(chorobyScene);
        window.show();
    }
    public void kartaPacjentaRejestracja(ActionEvent actionEvent) throws IOException {
        Parent kartaPacjentaRejestracjaParent = FXMLLoader.load(getClass().getResource("../rejestracja/kartaPacjentaRejestracja.fxml"));
        Scene kartaPacjentaRejestracjaScene = new Scene(kartaPacjentaRejestracjaParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(kartaPacjentaRejestracjaScene);
        window.show();
    }
}
