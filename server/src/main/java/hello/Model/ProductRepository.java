package hello.Model;

import org.springframework.data.repository.CrudRepository;
/**
 * Created by Aza on 08.12.13.
 */
public interface ProductRepository extends CrudRepository<Product, Long>{

    Product findByNameProduct(String nameProduct);

}
