package com.devduck.duckmovie.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

/*
TodoDAO 에서 필요한 작업을 수행할때 HikariData-Source를 이용하게 되므로 이에 대한 처리를 쉽게 사용할 수 있도록 enum 으로 구성
 */
public enum ConnectionUtil {
    INSTANCE;

    private HikariDataSource ds;

    ConnectionUtil(){
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/webdb");
        config.setUsername("root");
        config.setPassword("10041004");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        ds = new HikariDataSource(config);
    }

    public Connection getConnection() throws Exception{
        return ds.getConnection();
    }
}
