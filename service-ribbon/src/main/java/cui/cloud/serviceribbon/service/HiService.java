package cui.cloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cuijq
 */
@Service
public class HiService {


    /**
     * 这个在启动类中注入的
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，
     * 熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        //这边service-hi和SERVICE-HI都可以
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }


    public String hiError(String name) {
        return "hi,"+name+",sorry,error! --Ribbon";
    }
}
