package com.kb.demo.cloud.payment.service;

import com.kb.demo.cloud.common.entity.PayAmount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayAmountService {
    int insert(PayAmount payAmount);

    List<PayAmount> selectByPrimaryKey(@Param("id") Long id);
}
