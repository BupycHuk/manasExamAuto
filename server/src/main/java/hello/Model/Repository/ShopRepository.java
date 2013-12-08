package hello.Model.Repository;

import hello.Model.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<Shop, Long> {

    Shop findByName(String name);
}
