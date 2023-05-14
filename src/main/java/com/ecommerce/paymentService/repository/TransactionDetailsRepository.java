package com.ecommerce.paymentService.repository;

import com.ecommerce.paymentService.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {

    TransactionDetails findByOrderId(long orderId);

}
