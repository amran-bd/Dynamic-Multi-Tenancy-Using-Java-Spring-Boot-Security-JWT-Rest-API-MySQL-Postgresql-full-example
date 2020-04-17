package com.amran.dynamic.multitenant.tenant.service;

import com.amran.dynamic.multitenant.tenant.entity.Product;

import java.util.List;

/**
 * @author Md. Amran Hossain
 */
public interface ProductService {

    List<Product> getAllProduct();
}
