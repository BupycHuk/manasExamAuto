package javafxapplication.Proxy;

import javafxapplication.Tools.RestTemplateFactory;
import javafxapplication.Tools.UrlService;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:19
 * To change this template use File | Settings | File Templates.
 */
public class Proxy {

    protected RestTemplate restTemplate = RestTemplateFactory.Build();
    protected UrlService urlService = new UrlService();
}
