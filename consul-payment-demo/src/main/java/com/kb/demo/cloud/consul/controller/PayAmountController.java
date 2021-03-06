package com.kb.demo.cloud.consul.controller;

import com.kb.demo.cloud.common.dto.ResponseResult;
import com.kb.demo.cloud.common.dto.Result;
import com.kb.demo.cloud.common.entity.PayAmount;
import com.kb.demo.cloud.consul.service.PayAmountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class PayAmountController {

    @Autowired
    PayAmountService payAmountService;

    @PostMapping("/pay/create")
    public Result createPayAmount(PayAmount payAmount) {
        int insert = payAmountService.insert(payAmount);
        return ResponseResult.success(insert);
    }

    @GetMapping("/pay/query/{id}")
    public Result payQuery(@PathVariable(value = "id") Long id) {
        List<PayAmount> payAmounts = payAmountService.selectByPrimaryKey(id);
        return ResponseResult.success(payAmounts);
    }
}
