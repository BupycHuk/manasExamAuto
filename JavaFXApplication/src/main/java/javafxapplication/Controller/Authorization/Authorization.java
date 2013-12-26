package javafxapplication.Controller.Authorization;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Authorization implements Initializable {
    public VBox vbox;

    public TextField password;
    public TextField login;
    public Label errorl;
    SellerProxy var;
    SellerProxy sellerProxy = new SellerProxy();
    Seller[] sellers = sellerProxy.getSellers();
    Integer count=0, i;


    public void kiruu(ActionEvent actionEvent) throws IOException {
        for (i=0;i<sellers.length;i++) {
            if (login.getText().equals(sellers[i].getLogin()) && password.getText().equals(sellers[i].getPassword())) {
                Parent root = FXMLLoader.load(getClass().getResource("/View/MainWindow.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                Node source = (Node) actionEvent.getSource();
                stage = (Stage) source.getScene().getWindow();
                stage.close();
                count=1;
            }
        }
        errorl.setText("Сиздин логин же паролунуз ката");
        login.setText("");
        password.setText("");

    }

    private void openControl(String controlPath) throws IOException {
        Parent control = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(control);
    }

    public void onEnter(ActionEvent actionEvent) throws IOException{
        kiruu(actionEvent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
