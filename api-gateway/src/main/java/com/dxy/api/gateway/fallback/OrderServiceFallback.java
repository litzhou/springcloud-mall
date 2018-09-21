package com.dxy.api.gateway.fallback;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * @author zhougaojun
 * @since 2018/09/21
 **/
@Component
public class OrderServiceFallback extends AbstrackFallbackProvider {
    @Override
    public String getRoute() {
        return "service-order";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return super.defaultFallbackResponse(route, cause, "订单服务挂了");
    }
}

 