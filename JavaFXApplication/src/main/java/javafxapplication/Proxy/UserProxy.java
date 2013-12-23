package javafxapplication.Proxy;

import javafxapplication.Model.User;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class UserProxy extends Proxy {

    public User[] getSellers() {
        return restTemplate.getForObject(urlService.GetServerUrl("/sellers/"), User[].class);
    }

}
