package com.amran.dynamic.multitenant.mastertenant.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Md. Amran Hossain
 */
@Configuration
@ConfigurationProperties("multitenancy.mtapp.master.datasource")
public class MasterDatabaseConfigProperties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private long connectionTimeout;
    private int maxPoolSize;
    private long idleTimeout;
    private int minIdle;
    private String poolName;

    //Initialization of HikariCP.
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MasterDatabaseConfigProperties [url=");
        builder.append(url);
        builder.append(", username=");
        builder.append(username);
        builder.append(", password=");
        builder.append(password);
        builder.append(", driverClassName=");
        builder.append(driverClassName);
        builder.append(", connectionTimeout=");
        builder.append(connectionTimeout);
        builder.append(", maxPoolSize=");
        builder.append(maxPoolSize);
        builder.append(", idleTimeout=");
        builder.append(idleTimeout);
        builder.append(", minIdle=");
        builder.append(minIdle);
        builder.append(", poolName=");
        builder.append(poolName);
        builder.append("]");
        return builder.toString();
    }

    public String getUrl() {
        return url;
    }

    public MasterDatabaseConfigProperties setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MasterDatabaseConfigProperties setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MasterDatabaseConfigProperties setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public MasterDatabaseConfigProperties setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

    public long getConnectionTimeout() {
        return connectionTimeout;
    }

    public MasterDatabaseConfigProperties setConnectionTimeout(long connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public MasterDatabaseConfigProperties setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        return this;
    }

    public long getIdleTimeout() {
        return idleTimeout;
    }

    public MasterDatabaseConfigProperties setIdleTimeout(long idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public MasterDatabaseConfigProperties setMinIdle(int minIdle) {
        this.minIdle = minIdle;
        return this;
    }

    public String getPoolName() {
        return poolName;
    }

    public MasterDatabaseConfigProperties setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
}
