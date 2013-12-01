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
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddSellerControl.fxml");
    }

    private void openControl(String controlPath) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(root);
    }

    public void listSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListSellerControl.fxml");
    }
}
