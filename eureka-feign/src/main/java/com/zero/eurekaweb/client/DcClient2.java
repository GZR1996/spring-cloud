package com.zero.eurekaweb.client;

import com.zero.eurekaweb.component.HystrixClientFallback;
import com.zero.eurekaweb.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zero
 * @date 2019/4/15 10:55
 */

@FeignClient(name = "eureka-clinet", fallback = HystrixClientFallback.class, configuration = FeignConfig.class)
public interface DcClient2 {

    @RequestMapping(name = "dc", method = RequestMethod.GET)
    String consumer();
}
