package com.kb.demo.cloud.payment.dao;

import com.kb.demo.cloud.common.entity.PayAmount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PayAmountMapper {

    int insert(PayAmount payAmount);

    List<PayAmount> selectByPrimaryKey(@Param("id") Long id);
}
