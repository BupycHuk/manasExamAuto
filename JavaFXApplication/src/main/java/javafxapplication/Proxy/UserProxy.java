package javafxapplication.Proxy;

import javafxapplication.Model.User;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class CarProxy extends Proxy {

    public boolean addSpare(AddSpareRequest spareAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addSpare/"), spareAddRequest, SpareofCar.class);
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
