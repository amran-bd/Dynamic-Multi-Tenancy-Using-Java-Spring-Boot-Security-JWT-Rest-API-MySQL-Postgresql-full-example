package com.amran.dynamic.multitenant.mastertenant.service;

import com.amran.dynamic.multitenant.mastertenant.entity.MasterTenant;

/**
 * @author Md. Amran Hossain
 */
public interface MasterTenantService {

    MasterTenant findByClientId(Integer clientId);
}
