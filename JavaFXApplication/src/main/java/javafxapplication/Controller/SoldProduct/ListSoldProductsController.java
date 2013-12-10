package javafxapplication.Controller.SoldProduct;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.CountSoldProduct;
import javafxapplication.Model.Shop;
import javafxapplication.Model.SoldProducts;
import javafxapplication.Proxy.CountSoldProductProxy;
import javafxapplication.Proxy.ShopProxy;
import javafxapplication.Proxy.SoldProductsProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListSoldProductsController implements Initializable {
    public TableColumn Name;
    public TableColumn count;
    public TableColumn price;
    public TableColumn seller;
    public ComboBox shopComboBox;
    public TableView tableView1;
    public Label label2;
    public Label counts;
    public Label sum;
    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();
    ShopProxy shopProxy = new ShopProxy();
    CountSoldProductProxy countSoldProductProxy = new CountSoldProductProxy();
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);

        count.setCellValueFactory(new PropertyValueFactory<SoldProducts, Integer>("count"));
        price.setCellValueFactory(new PropertyValueFactory<SoldProducts, Double>("price"));
        Name.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("productName"));
        seller.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("fullName"));

    }

    public void textToluktoo(ActionEvent actionEvent) {
        Shop shop = (Shop) shopComboBox.getValue();
        String Name = shop.getName();
        List<SoldProducts> soldProductses = Arrays.asList(soldProductsProxy.getSoldProducts(Name));
        tableView1.getItems().setAll(soldProductses);

        CountSoldProduct countSoldProducts = countSoldProductProxy.getCountSoldProducts(Name);
        counts.setText(String.format("%s",countSoldProducts.getCountProduct()));
        sum.setText(String.format("%s",countSoldProducts.getSumProduct()));

    }
}
