package com.kb.demo.cloud.payment.service.impl;

import com.kb.demo.cloud.common.entity.PayAmount;
import com.kb.demo.cloud.payment.dao.PayAmountMapper;
import com.kb.demo.cloud.payment.service.PayAmountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PayAmountServiceImpl  implements PayAmountService {

    private final PayAmountMapper payAmountMapper;

    public int insert(PayAmount payAmount) {
        return payAmountMapper.insert(payAmount);
    }

    public List<PayAmount> selectByPrimaryKey(Long id) {
        return payAmountMapper.selectByPrimaryKey(id);
    }
}
