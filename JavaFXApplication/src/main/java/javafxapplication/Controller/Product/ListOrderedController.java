package javafxapplication.Controller.Product;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.OrderedProducts;
import javafxapplication.Proxy.OrderProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
/**
 * Created by Aza on 09.12.13.
 */
public class ListOrderedController implements Initializable {

//    public TableColumn sellername;
    public TableColumn orderedProduct;
    public TableColumn price;
    public TableView tableView1;

    OrderProxy orderProxy = new OrderProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        orderedProduct.setCellValueFactory(new PropertyValueFactory<OrderedProducts, String>("orderedProduct"));
        price.setCellValueFactory(new PropertyValueFactory<OrderedProducts, String>("price"));
    }

    public void update(ActionEvent actionEvent) {
        List<OrderedProducts> orders = Arrays.asList(orderProxy.getOrders());

        tableView1.getItems().setAll(orders);
    }
}
