package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<Shop, Long> {

    Shop findByName(String name);
}
