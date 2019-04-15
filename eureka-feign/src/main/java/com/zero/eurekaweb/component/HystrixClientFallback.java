package com.zero.eurekaweb.component;

import com.zero.eurekaweb.client.DcClient2;
import org.springframework.stereotype.Component;

/**
 * @author zero
 * @date 2019/4/15 10:57
 */

@Component
public class HystrixClientFallback implements DcClient2 {
    @Override
    public String consumer() {
        return "fallback info";
    }
}
