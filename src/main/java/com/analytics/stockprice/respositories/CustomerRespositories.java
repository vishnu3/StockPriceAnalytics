package com.analytics.stockprice.respositories;

import com.analytics.stockprice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespositories extends JpaRepository<Customer,Long> {
}
