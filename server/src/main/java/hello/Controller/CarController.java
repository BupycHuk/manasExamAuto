package hello.Controller;


import hello.Config;
import hello.Model.Car;
import hello.Model.Repository.CarRepository;
import hello.Model.RequestDto.AddCarRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class CarController {
    @RequestMapping(value = "/cars")
    public @ResponseBody
    Iterable<Car> listCars(){
        return getCarRepository().findAll();
    }

    @RequestMapping(value = "/addcar",method = RequestMethod.POST)
    public @ResponseBody
    Car addCar(@RequestBody AddCarRequest addCarRequest){

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = new Car(addCarRequest.getCarName());
        getCarRepository().save(car);
        return car;
    }

    public CarRepository getCarRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(CarRepository.class);
    }
}
