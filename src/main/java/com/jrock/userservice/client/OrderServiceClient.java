package com.jrock.userservice.client;

import com.jrock.userservice.vo.ResponseOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Feign Client Decoder Bean (예외처리 빈)
 * FeignClient 는 interface로 만든다.
 * name = {호출하려고 하는 마이크로 서비스 이름}
 */
@FeignClient(name = "order-service")
public interface OrderServiceClient {

    /**
     *  요청할 Endpoint pull
     */
    @GetMapping("/order-service/{userId}/ordersd")
    List<ResponseOrder> getOrders(@PathVariable String userId);
}
