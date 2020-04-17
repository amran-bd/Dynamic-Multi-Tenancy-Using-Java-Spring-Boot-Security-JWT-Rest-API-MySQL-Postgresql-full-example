package com.amran.dynamic.multitenant.tenant.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Md. Amran Hossain
 */
@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @Size(max = 50)
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Size(max = 10)
    @Column(name = "quantity",nullable = false)
    private String quantity;
    @Size(max = 3)
    @Column(name = "size",nullable = false,unique = true)
    private String size;

    public Product() {
    }

    public Product(@Size(max = 50) String productName, @Size(max = 10) String quantity, @Size(max = 3) String size) {
        this.productName = productName;
        this.quantity = quantity;
        this.size = size;
    }

    public Integer getProductId() {
        return productId;
    }

    public Product setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public Product setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Product setSize(String size) {
        this.size = size;
        return this;
    }
}
