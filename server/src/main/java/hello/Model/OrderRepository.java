package hello.Model;

import org.springframework.data.repository.CrudRepository;
/**
 * Created by Aza on 09.12.13.
 */
public interface OrderRepository extends CrudRepository<OrderedProducts, Long>{
    Iterable<OrderedProducts> findByOrderedProduct(String orderedProduct);
}
