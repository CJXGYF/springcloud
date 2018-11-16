package com.example.order.repository;

import com.example.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 20:11
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
