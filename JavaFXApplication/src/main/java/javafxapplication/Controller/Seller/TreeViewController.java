package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafxapplication.Model.Seller;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;

/**
 *
 * @author Akim
 */
public class TreeViewController implements Initializable {
    
    @FXML
    public AnchorPane anchorPane;
    
    public TableColumn shopName;
    public TableColumn name;
    public TableColumn Login;
    public TableView tableView1;

    SellerProxy sellerProxy = new SellerProxy();
    ShopProxy shopProxy = new ShopProxy();

     public void clickMe(ActionEvent event) {
       
       TreeItem<String> root = new TreeItem("Дукондордун тизмеси");
       
       List<Shop> shops = Arrays.asList(shopProxy.getShops());
       List<Seller> sellers = Arrays.asList(sellerProxy.getSellers());
       
       for(Shop shop : shops){
           TreeItem<String> node = new TreeItem(shop.getName()+" - "+shop.getContacts());
           root.getChildren().add(node);
       
           for(Seller  seller : sellers){
                TreeItem<String> nod = new TreeItem(seller.getFullName());

                if(seller.getShop().getId() == shop.getId())
                    node.getChildren().add(nod);
           }
       }

       TreeView treeView = new TreeView(root);
       
       treeView.setLayoutX(24);
       
       treeView.setLayoutY(73);
       treeView.setPrefWidth(340);
       treeView.setPrefHeight(382);
       
       anchorPane.getChildren().add(treeView);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
}
