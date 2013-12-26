package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Product;
import javafxapplication.Proxy.ProductProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class ListProductController implements Initializable {

    public TableColumn productTuru;
    public TableColumn productName;
    public TableColumn baasy;
    public TableView tableView1;

    ProductProxy productProxy = new ProductProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productTuru.setCellValueFactory(new PropertyValueFactory<Product, String>("productTuru"));
        productName.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
        baasy.setCellValueFactory(new PropertyValueFactory<Product, String>("baasy"));
    }

    public void filtr(ActionEvent actionEvent) {
        List<Product> products = Arrays.asList(productProxy.getProducts());

        tableView1.getItems().setAll(products);
    }
}
