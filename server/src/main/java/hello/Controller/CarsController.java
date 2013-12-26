package hello.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddCarRequest;
import hello.Model.Repository.CarRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@Component
public class CarsController {

    @RequestMapping(value = "/cars")
    public @ResponseBody
    Iterable<Cars> listCars() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addCar",method = RequestMethod.POST)
    public @ResponseBody
    Cars addCar(@RequestBody AddCarRequest addCarRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Cars car = new Cars(addCarRequest.getName());
        getRepository().save(car);
        return car;
    }

    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteCar(@PathVariable("name") String name) {
        Iterable<Cars> car = getRepository().findByName(name);
        getRepository().delete(car);
        return true;
    }

    public CarRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(CarRepository.class);
    }


}
