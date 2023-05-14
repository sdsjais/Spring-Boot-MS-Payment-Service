package com.ecommerce.paymentService.service;

import com.ecommerce.paymentService.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
