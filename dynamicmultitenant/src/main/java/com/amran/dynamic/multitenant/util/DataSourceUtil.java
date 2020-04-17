package com.amran.dynamic.multitenant.util;

import com.amran.dynamic.multitenant.mastertenant.entity.MasterTenant;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * @author Md. Amran Hossain
 */
public final class DataSourceUtil {

    private static final Logger LOG = LoggerFactory.getLogger(DataSourceUtil.class);

    public static DataSource createAndConfigureDataSource(MasterTenant masterTenant) {
        HikariDataSource ds = new HikariDataSource();
        ds.setUsername(masterTenant.getUserName());
        ds.setPassword(masterTenant.getPassword());
        ds.setJdbcUrl(masterTenant.getUrl());
        ds.setDriverClassName(masterTenant.getDriverClass());
        // HikariCP settings - could come from the master_tenant table but
        // hardcoded here for brevity
        // Maximum waiting time for a connection from the pool
        ds.setConnectionTimeout(20000);
        // Minimum number of idle connections in the pool
        ds.setMinimumIdle(3);
        // Maximum number of actual connection in the pool
        ds.setMaximumPoolSize(500);
        // Maximum time that a connection is allowed to sit idle in the pool
        ds.setIdleTimeout(300000);
        ds.setConnectionTimeout(20000);
        // Setting up a pool name for each tenant datasource
        String tenantConnectionPoolName = masterTenant.getDbName() + "-connection-pool";
        ds.setPoolName(tenantConnectionPoolName);
        LOG.info("Configured datasource:" + masterTenant.getDbName() + ". Connection pool name:" + tenantConnectionPoolName);
        return ds;
    }
}
