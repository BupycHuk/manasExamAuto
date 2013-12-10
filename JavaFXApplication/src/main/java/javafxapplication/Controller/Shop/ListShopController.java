package javafxapplication.Controller.Shop;



import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafxapplication.Model.Shop;

import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class ListShopController implements Initializable {

    public TableColumn<Shop, Long> id;
    public TableColumn<Shop, String> name;
    public TableColumn<Shop, String> contacts;

    public TableView<Shop> tableView1;

    ShopProxy shopProxy = new ShopProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<Shop, Long>("id" ));
        name.setCellValueFactory(new PropertyValueFactory<Shop, String>("name"));
        contacts.setCellValueFactory(new PropertyValueFactory<Shop, String>("contacts"));

    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Shop> shop = Arrays.asList(shopProxy.getShops());

        tableView1.getItems().setAll(shop);
    }

    public void shopDelete(ActionEvent actionEvent)
    {


         Shop shop = tableView1.getSelectionModel().getSelectedItem();
         long i=shop.getId();
         shopProxy.deleteShops(i);



    }
}
