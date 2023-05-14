package com.ecommerce.paymentService.service;

import com.ecommerce.paymentService.entity.TransactionDetails;
import com.ecommerce.paymentService.model.PaymentRequest;
import com.ecommerce.paymentService.repository.TransactionDetailsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private TransactionDetailsRepository transactionDetailsRepository;

    @Override
    public long doPayment(PaymentRequest paymentRequest) {
        log.info("Recording Payment Detils::{}",paymentRequest);
        TransactionDetails transactionDetails = TransactionDetails.builder()
                .paymentDate(Instant.now())
                .paymentMode(paymentRequest.getPaymentMode().name())
                .paymentStatus("SUCCESS")
                .orderId(paymentRequest.getOrderId())
                .referenceNumber(paymentRequest.getReferenceNumber())
                .amount(paymentRequest.getAmount())
                .build();
        transactionDetailsRepository.save(transactionDetails);
        log.info("Transaction completed with id::{}",transactionDetails.getId());
        return transactionDetails.getId();
    }
}
