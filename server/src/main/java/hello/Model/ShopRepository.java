package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<Shop, Long> {

    Iterable<Seller> findByName(String name);//TODO: Эмнеге Seller? Бул жерде Shop болуш керек и вообще бул метод эмне учун колдонулат?
}
