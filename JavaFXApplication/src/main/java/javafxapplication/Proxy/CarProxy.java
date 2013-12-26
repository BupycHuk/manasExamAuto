package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddCarRequest;
import javafxapplication.Model.Car;

public class CarProxy extends  Proxy{

    public boolean addCar(AddCarRequest carRepositroy)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addcar"), carRepositroy, Car.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Car[] getCars() {
        return restTemplate.getForObject(urlService.GetServerUrl("/cars"), Car[].class);
    }
}
