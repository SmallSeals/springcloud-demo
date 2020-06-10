package com.kb.demo.cloud.consul.service;

import com.kb.demo.cloud.common.entity.PayAmount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayAmountService {
    int insert(PayAmount payAmount);

    List<PayAmount> selectByPrimaryKey(@Param("id") Long id);
}
