package com.amran.dynamic.multitenant.dto;

import java.io.Serializable;

/**
 * @author Md. Amran Hossain
 */
public class UserLoginDTO implements Serializable {

    private String userName;
    private String password;
    private Integer tenantOrClientId;

    public UserLoginDTO() {
    }

    public UserLoginDTO(String userName, String password, Integer tenantOrClientId) {
        this.userName = userName;
        this.password = password;
        this.tenantOrClientId = tenantOrClientId;
    }

    public String getUserName() {
        return userName;
    }

    public UserLoginDTO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLoginDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getTenantOrClientId() {
        return tenantOrClientId;
    }

    public UserLoginDTO setTenantOrClientId(Integer tenantOrClientId) {
        this.tenantOrClientId = tenantOrClientId;
        return this;
    }
}
