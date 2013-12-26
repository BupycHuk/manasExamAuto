package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class MainController implements Initializable {

    public VBox vbox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private void openControl(String controlPath) throws IOException {
        Parent control = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(control);
    }

    public void listSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListUserControl.fxml");
    }

    public void listCars(ActionEvent actionEvent) throws IOException{
        openControl("/View/ListCarControl.fxml");
    }
}
