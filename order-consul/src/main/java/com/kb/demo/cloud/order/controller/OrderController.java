package com.kb.demo.cloud.order.controller;

import com.kb.demo.cloud.common.dto.Result;
import com.kb.demo.cloud.common.entity.PayAmount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 服务名称一点要大写  。。。 切记
     */
    private static  String PAYMENT_URL = "http://PAYMENT-CONSUL-SERVICE";


    @GetMapping("/serviceUrl")
    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("payment-consul-service");
        if (list != null && list.size() > 0 ) {
            return String.valueOf(list.get(0).getUri());
        }
        return null;
    }

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
