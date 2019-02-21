package cui.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cuijq
 */
@RestController
public class SayHiController {


    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "cjq") String name) {
        System.out.println("调用了HiService的Hi Controller");
        return "hi " + name + " ,i am from port:" + port;
    }
}
