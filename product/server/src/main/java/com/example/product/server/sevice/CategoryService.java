package com.example.product.server.sevice;

import com.example.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 14:32
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
