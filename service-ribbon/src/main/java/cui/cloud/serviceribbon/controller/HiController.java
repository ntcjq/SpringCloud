package cui.cloud.serviceribbon.controller;

import cui.cloud.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cuijq
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println("调用了Ribbon的Hi Controller");
        return hiService.hiService( name );
    }

}
