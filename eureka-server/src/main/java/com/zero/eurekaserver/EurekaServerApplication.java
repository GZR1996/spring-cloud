package com.zero.eurekaserver;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("1", 1);
        System.out.println(json.getIntValue("1"));
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
