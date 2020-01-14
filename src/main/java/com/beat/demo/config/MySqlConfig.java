package com.beat.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class MySqlConfig {

    @Bean(name ="mySqlDataSource")
    @Primary
    public DataSource mySqlDataSource(Environment environment){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty("com.mysql.jdbc.Driver"));
        dataSourceBuilder.url(environment.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getProperty("spring.datasource.username"));
        dataSourceBuilder.password(environment.getProperty("spring.datasource.password"));
        return dataSourceBuilder.build();
    }

    @Bean(name = "oracleDataSource")
    public DataSource oracleDataSource(Environment environment){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty(""));
        dataSourceBuilder.url(environment.getProperty(""));
        dataSourceBuilder.username(environment.getProperty(""));
        dataSourceBuilder.password(environment.getProperty(""));
        return dataSourceBuilder.build();
    }
}
