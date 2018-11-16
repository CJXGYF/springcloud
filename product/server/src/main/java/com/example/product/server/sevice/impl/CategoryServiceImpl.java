package com.example.product.server.sevice.impl;

import com.example.product.server.dataobject.ProductCategory;
import com.example.product.server.repository.ProductCategoryRepository;
import com.example.product.server.sevice.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 14:35
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
