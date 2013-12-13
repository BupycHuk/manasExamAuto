package javafxapplication.Tools;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:07
 * To change this template use File | Settings | File Templates.
 */
public class RestTemplateFactory {

    public static RestTemplate Build()
    {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

//Add the Jackson Message converter
        messageConverters.add(new MappingJacksonHttpMessageConverter());

//Add the message converters to the restTemplate
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
}
