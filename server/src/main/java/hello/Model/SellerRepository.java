package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Long> {
    Iterable<Seller> findByFullName (String fullName);
    Iterable<Seller> findByLogin (String login);
}

