package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/all")
    public @ResponseBody
    Iterable<User> listSellers() {

        return  getRepository().findAll();
    }

    public UserRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(UserRepository.class);
    }
}

