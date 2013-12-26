package hello.Model.Repository;

import hello.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Iterable<Product> findByFullName(String name);
    //Iterable<Seller> findByLogin (String login);
}

