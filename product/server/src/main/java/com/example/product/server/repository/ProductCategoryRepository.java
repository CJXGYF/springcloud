package com.example.product.server.repository;

import com.example.product.server.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * All rights Reserverd,Designed By xxxx.
 *
 * @author: 陈嘉欣
 * @date: 2018/9/13 11:21
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}