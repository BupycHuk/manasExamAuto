package hello.Model.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
import hello.Model.Cars;
import org.springframework.data.repository.CrudRepository;
public interface CarRepository extends CrudRepository<Cars, Long>{
    Iterable<Cars> findByName(String Name);
}
