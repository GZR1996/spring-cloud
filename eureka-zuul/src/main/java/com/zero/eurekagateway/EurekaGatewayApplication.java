package com.zero.eurekagateway;

import com.zero.eurekagateway.component.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableZuulProxy
@SpringBootApplication
public class EurekaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayApplication.class, args);
    }

    @Bean
    public AccessFilter filter() {
        return new AccessFilter();
    }
}
