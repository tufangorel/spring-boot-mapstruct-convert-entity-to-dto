package com.company.customerinfo.repository;

import com.company.customerinfo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>,
        QuerydslPredicateExecutor<Customer> {

}

