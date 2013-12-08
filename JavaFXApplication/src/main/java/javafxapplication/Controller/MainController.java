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

    public void addProduct(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddProductsControl.fxml");
    }
    public void listProducts(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListProductsControl.fxml");
    }

    private void openControl(String controlPath) throws IOException {
        Parent control = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(control);
    }

    public void listSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListSellerControl.fxml");
    }
}
