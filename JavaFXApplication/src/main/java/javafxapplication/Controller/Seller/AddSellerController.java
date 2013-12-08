package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class AddSellerController implements Initializable {

    public ComboBox shopComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private PasswordField text4;



    SellerProxy sellerProxy = new SellerProxy();
    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String sellerName, login, password;
        Shop shop = (Shop)shopComboBox.getValue();
        long shopId = (shop!=null)? (long) shop.getId() :0;
        sellerName=text2.getText();
        login=text3.getText();
        password=text4.getText();

        AddSellerRequest request = new AddSellerRequest(shopId, sellerName,login,password);

        sellerProxy.addSeller(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
    text2.setText("");
    text3.setText("");
    text4.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);
    }
}
