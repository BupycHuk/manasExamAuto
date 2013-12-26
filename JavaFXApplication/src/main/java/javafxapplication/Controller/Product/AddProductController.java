package javafxapplication.Controller.Product;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxapplication.Model.RequestDto.AddProductRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ProductProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * Created by Aza on 08.12.13.
 */
public class AddProductController implements Initializable{

    public ComboBox shopComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;


    ProductProxy productProxy= new ProductProxy();
    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String nameProduct, price;
        Shop shop = (Shop)shopComboBox.getValue();
        long shopId = (shop!=null)? (long) shop.getId() :0;
        nameProduct=text2.getText();
        price=text3.getText();

        AddProductRequest request = new AddProductRequest(shopId, nameProduct,price);

        productProxy.addProduct(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);
    }

}
