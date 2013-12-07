package javafxapplication.Controller.SoldProduct;

import hello.Controller.Product;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.SoldProducts;
import javafxapplication.Proxy.ProductProxy;
import javafxapplication.Proxy.SoldProductsProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListSoldProductsController implements Initializable {
    public TableView tableView1;
    public TableColumn Name;
    public TableColumn count;
    public TableColumn price;
    public TableColumn seller;
    public javafx.scene.control.ComboBox ComboBox;
    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();
    ProductProxy productProxy = new ProductProxy();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        count.setCellValueFactory(new PropertyValueFactory<SoldProducts, Integer>("count"));
        price.setCellValueFactory(new PropertyValueFactory<SoldProducts, Double>("price"));
        Name.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("productName"));
        seller.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("seller"));
    }

    public void textToluktoo(ActionEvent actionEvent) {
        Product[] products = productProxy.getProduct();
        ComboBox.getItems().setAll(products);
        List<SoldProducts> soldProductses = Arrays.asList(soldProductsProxy.getSoldProducts());
        tableView1.getItems().setAll(soldProductses);

    }
}
