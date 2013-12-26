package javafxapplication.Proxy;

import javafxapplication.Model.Cars;
import javafxapplication.Model.RequestDto.AddCarRequest;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 17:58
 * To change this template use File | Settings | File Templates.
 */
public class CarProxy {
    public boolean addCar(AddCarRequest carAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addCar/"), carAddRequest, Car.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    public Cars[] getCars() {
        return restTemplate.getForObject(urlService.GetServerUrl("/cars/"), Cars[].class);
    }
}
