package hello.Model.Repository;

import hello.Model.Car;
import hello.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
