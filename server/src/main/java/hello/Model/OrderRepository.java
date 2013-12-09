package hello.Model;

import org.springframework.data.repository.CrudRepository;
/**
 * Created by Aza on 09.12.13.
 */
public interface OrderRepository extends CrudRepository<Order, Long>{
    Iterable<Order> findByOrderedProduct(String orderedProduct);
}
