package com.ecommerce.paymentService.service;

import com.ecommerce.paymentService.model.PaymentRequest;
import com.ecommerce.paymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
