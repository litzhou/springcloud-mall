package com.dxy.api.gateway.fallback;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhougaojun
 * @since 2018/09/21
 **/
@Slf4j
public abstract class AbstrackFallbackProvider implements FallbackProvider {


    protected ClientHttpResponse defaultFallbackResponse(String route, Throwable cause, String message) {

        log.error("throwable.message = {}", cause.getMessage());
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 500;
            }

            @Override
            public String getStatusText() throws IOException {
                return cause.getMessage();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                Map<String, Object> map = new HashMap<>(3);
                map.put("success", false);
                map.put("message", message);
                map.put("code", 500);
                return new ByteArrayInputStream(new Gson().toJson(map).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return httpHeaders;
            }
        };
    }
}

 