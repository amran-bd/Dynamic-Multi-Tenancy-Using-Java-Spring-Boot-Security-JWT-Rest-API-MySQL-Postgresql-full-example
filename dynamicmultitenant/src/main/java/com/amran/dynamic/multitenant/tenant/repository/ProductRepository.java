package com.amran.dynamic.multitenant.tenant.repository;

import com.amran.dynamic.multitenant.tenant.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Md. Amran Hossain
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
