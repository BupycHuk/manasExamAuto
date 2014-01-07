package javafxapplication.Proxy;

import javafxapplication.Model.Car;

/**
 * Created with IntelliJ IDEA.
 * User: SAMAGAN
 * Date: 1/7/14
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CarProxy extends Proxy {

    public boolean addCar(AddCarRequest addCarRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addCar/"), addCarRequest, Car.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Car[] getCars() {
        return restTemplate.getForObject(urlService.GetServerUrl("/cars/"), Car[].class);
    }

}
