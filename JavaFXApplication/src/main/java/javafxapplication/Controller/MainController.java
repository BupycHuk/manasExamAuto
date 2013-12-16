package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {

    public VBox vbox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void addSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddSellerControl.fxml");
    }
    public void addShop(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddShopControl.fxml");
    }



    public void listShop(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListShopControl.fxml");
    }

    private void openControl(String controlPath) throws IOException {
        Parent control = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(control);
    }

    public void listSeller(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListSellerControl.fxml");
    }

    public void listSoldProducts(ActionEvent actionEvent) throws IOException {
         openControl("/View/ListSoldProductControl.fxml");
    }

    public void listShopTreeView(ActionEvent event) throws IOException {
        openControl("/View/TreeView.fxml");
    }

    public void MainControl() throws IOException {
        openControl("/View/MainWindow.fxml");
    }
}
