package com.kb.demo.cloud.consul.service.impl;

import com.kb.demo.cloud.common.entity.PayAmount;
import com.kb.demo.cloud.consul.dao.PayAmountMapper;
import com.kb.demo.cloud.consul.service.PayAmountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PayAmountServiceImpl  implements PayAmountService {

    @Autowired
    private  PayAmountMapper payAmountMapper;

    public int insert(PayAmount payAmount) {
        return payAmountMapper.insert(payAmount);
    }

    public List<PayAmount> selectByPrimaryKey(Long id) {
        return payAmountMapper.selectByPrimaryKey(id);
    }
}
