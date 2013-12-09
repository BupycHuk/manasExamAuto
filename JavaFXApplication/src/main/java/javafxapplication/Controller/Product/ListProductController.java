package javafxapplication.Controller.Product;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Order;
import javafxapplication.Model.Product;
import javafxapplication.Proxy.OrderProxy;
import javafxapplication.Proxy.ProductProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Aza on 08.12.13.
 */
public class ListProductController implements Initializable {

    public TableColumn shopName;
    public TableColumn nameProduct;
    public TableColumn price;
    public TableView tableView1;

    ProductProxy productProxy = new ProductProxy();
    OrderProxy orderProxy = new OrderProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shopName.setCellValueFactory(new PropertyValueFactory<Product, String>("shopname"));
        nameProduct.setCellValueFactory(new PropertyValueFactory<Product, String>("nameProduct"));
        price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
    }

    public void update(ActionEvent actionEvent) {
        List<Product> products = Arrays.asList(productProxy.getProducts());

        tableView1.getItems().setAll(products);
    }

    public void deleteProduct(ActionEvent actionEvent) {


        Product product =  (Product) tableView1.getSelectionModel().getSelectedItem();
        long id = product.getId();
        productProxy.productDelete(id);

    }
    public void orderProduct(ActionEvent actionEvent) {

        Order order =  (Order) tableView1.getSelectionModel().getSelectedItem();
        String orderedProduct = order.getOrderedProduct();
        orderProxy.productOrder(orderedProduct);
    }
}
