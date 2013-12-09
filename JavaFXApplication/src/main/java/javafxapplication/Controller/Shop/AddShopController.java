package javafxapplication.Controller.Shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TextField;

import javafxapplication.Model.RequestDto.AddShopRequest;
import javafxapplication.Model.Shop;

import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class AddShopController implements Initializable {


    @FXML
    private TextField shoptext;
    @FXML
    private TextField contactstext;



    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String shopName, contacts;
        shopName= shoptext.getText();
        contacts= contactstext.getText();


        AddShopRequest request = new AddShopRequest( shopName,contacts);

        shopProxy.addShop(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
    shoptext.setText("");
    contactstext.setText("");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
