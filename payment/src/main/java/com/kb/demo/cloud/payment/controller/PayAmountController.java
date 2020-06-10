package com.kb.demo.cloud.payment.controller;

import com.kb.demo.cloud.common.dto.ResponseResult;
import com.kb.demo.cloud.common.dto.Result;
import com.kb.demo.cloud.common.entity.PayAmount;
import com.kb.demo.cloud.payment.service.PayAmountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PayAmountController {

    private final PayAmountService payAmountService;

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
