package com.test.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feing", url = "${external.service}:8081")
public interface FeingClient {

    @GetMapping("/api/gretting")
    String gretting();
}
