package com.demo.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Vertigor
 * @date 2021/8/1 0:32
 */
public interface PaymentService extends IService<Payment> {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
