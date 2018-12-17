package cui.cloud.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: cuijq
 *
 * 熔断器的fallback
 */
@Component
public class HiServiceHystric implements HiService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+",sorry,error! --Reign";
    }
}
