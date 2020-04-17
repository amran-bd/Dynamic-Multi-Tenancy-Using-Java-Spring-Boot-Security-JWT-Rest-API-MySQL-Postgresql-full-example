package com.amran.dynamic.multitenant.tenant.service;

import com.amran.dynamic.multitenant.tenant.entity.Product;
import com.amran.dynamic.multitenant.tenant.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Md. Amran Hossain
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
