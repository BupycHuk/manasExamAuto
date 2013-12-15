package javafxapplication.Controller.Shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxapplication.Model.RequestDto.AddShopRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 09.12.13
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class AddShopController implements Initializable{

    @FXML
    private TextField text2;//TODO озгормонун аты shopNameTextField
    @FXML
    private TextField text3;//TODO озгормонун аты contactsTextField
    @FXML

    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String shopname, shopcontacts;
        shopname=text2.getText();
        shopcontacts=text3.getText();

        AddShopRequest request = new AddShopRequest(shopname, shopcontacts);

        shopProxy.addShop(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Shop[] shops = shopProxy.getShops();
    }
}

