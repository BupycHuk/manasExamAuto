package javafxapplication.Controller.SoldProduct;

import hello.Model.Shop;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.SoldProducts;
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
    public javafx.scene.control.ComboBox ComboBox;
    public TableView tableView1;
    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();
    ShopProxy shopProxy = new ShopProxy();

    public void initialize(URL url, ResourceBundle resourceBundle) {
        javafxapplication.Model.Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);

        count.setCellValueFactory(new PropertyValueFactory<SoldProducts, Integer>("count"));
        price.setCellValueFactory(new PropertyValueFactory<SoldProducts, Double>("price"));
        Name.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("productName"));
        seller.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("fullName"));

    }

    public void textToluktoo(ActionEvent actionEvent) {
        Shop shopName = (Shop) shopComboBox.getValue();
        String name = String.format("%s",shopName.getName());

        List<SoldProducts> soldProductses = Arrays.asList(soldProductsProxy.getSoldProducts(name));
        tableView1.getItems().setAll(soldProductses);

    }
}
