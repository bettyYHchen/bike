package com.infsmall.launcher;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .url("jdbc:mysql://localhost:3306/bike_db?serverTimezone=UTC")
          .username("root")
          .password("Vl86580068")
          .build();	
    }
}
