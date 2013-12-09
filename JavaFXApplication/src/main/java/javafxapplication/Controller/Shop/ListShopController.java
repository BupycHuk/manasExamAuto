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

    public TableColumn name;
    public TableColumn contacts;

    public TableView tableView1;

    ShopProxy shopProxy = new ShopProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<Shop, String>("name"));
        contacts.setCellValueFactory(new PropertyValueFactory<Shop, String>("contacts"));

    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Shop> shop = Arrays.asList(shopProxy.getShops());

        tableView1.getItems().setAll(shop);
    }

    public void deleteShop(ActionEvent actionEvent)
    {
        Shop shop =  (Shop) tableView1.getSelectionModel().getSelectedItem();
        long id = shop.getId();
        shopProxy.shopDelete(id);


    }
}