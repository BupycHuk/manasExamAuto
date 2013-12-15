package hello.Model.Repository;

import hello.Model.ProductsInShop;
import hello.Model.ResponseDto.ProductInShopCount;
import hello.Model.Shop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductsInShopRepository extends CrudRepository<ProductsInShop, Long> {

    @Query(value = "select new hello.Model.ResponseDto.ProductInShopCount(pis.shop.id,sum(pis.count)) from ProductsInShop pis group by pis.shop")
    Iterable<ProductInShopCount> groupByShop();
}
