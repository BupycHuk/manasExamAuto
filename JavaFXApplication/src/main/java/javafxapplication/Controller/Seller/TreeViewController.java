package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafxapplication.Model.ProductsInShop;
import javafxapplication.Model.ResponseDto.ProductInShopCount;
import javafxapplication.Model.Seller;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ProductsInShopProxy;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;

/**
 *
 * @author Akim
 */
public class TreeViewController implements Initializable {

    public TreeView sellersTreeView;
   
    SellerProxy sellerProxy = new SellerProxy();
    ShopProxy shopProxy = new ShopProxy();
    ProductsInShopProxy productsInShopProxy = new ProductsInShopProxy();

     public void refresh(ActionEvent event) {
       
       TreeItem<String> root = new TreeItem("Сатуучулардын тизмеси");
       
       List<Shop> shops = Arrays.asList(shopProxy.getShops());
       List<Seller> sellers = Arrays.asList(sellerProxy.getSellers());
       List<ProductInShopCount> productsInShops = Arrays.asList(productsInShopProxy.getProductsInShopCountByShop());
       
       for(Shop shop : shops){
           long productCount = 0;
           for (ProductInShopCount productsInShop : productsInShops)
           {
               if (productsInShop.getShopId()==shop.getId())
               {
                   productCount = productsInShop.getCount();
                   break;
               }
           }
           TreeItem<String> node = new TreeItem(shop.getName() + " - "+shop.getContacts() + " - " + productCount+" буйум");
           root.getChildren().add(node);
       
           for(Seller  seller : sellers){
                TreeItem<String> nod = new TreeItem(seller.getFullName());

                if(seller.getShop().getId() == shop.getId())
                    node.getChildren().add(nod);
           }
       }
         sellersTreeView.setRoot(root);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
}
