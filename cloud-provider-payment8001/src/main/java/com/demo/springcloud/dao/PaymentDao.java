package com.demo.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Vertigor
 * @date 2021/8/1 0:03
 */
@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
