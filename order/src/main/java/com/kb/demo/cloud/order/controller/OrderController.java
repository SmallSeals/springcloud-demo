package com.kb.demo.cloud.order.controller;

import com.kb.demo.cloud.common.dto.ResponseResult;
import com.kb.demo.cloud.common.dto.Result;
import com.kb.demo.cloud.common.entity.PayAmount;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class OrderController {

    private final RestTemplate restTemplate;

    private static  String PAYMENT_URL = "http://localhost:8001";

    @PostMapping("/order/payCreate")
    public Result orderPayCreate(PayAmount payAmount){
        Result result = restTemplate.postForObject(PAYMENT_URL+"/pay/create", payAmount, Result.class);
        log.info("order 服务调用payment  服务返回的结果为：{}",result);
        return result;
    }

    @GetMapping("/order/payQuery/{payId}")
    public Result queryPay(@PathVariable(value = "payId") Long payId){
        Result result = restTemplate.getForObject(PAYMENT_URL+"/pay/query/"+payId,Result.class);
        log.info("order 服务调用 payment 服务查询接口返回值：{}",result);
        return  result;
    }
}
