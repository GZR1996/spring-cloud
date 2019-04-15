package com.zero.eurekagateway.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zero
 * @date 2019/4/15 14:53
 */

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dc", method = RequestMethod.GET)
    public String dc() {
        String services = "Services: " + discoveryClient.toString();
        System.out.println(services);
        return services;
    }
}
