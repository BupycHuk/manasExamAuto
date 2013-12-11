package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface SoldProductsRepository extends CrudRepository<SoldProducts, Long> {
    //Iterable<SoldProducts> findByProductName(String name);
}

