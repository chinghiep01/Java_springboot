package com.example.demo.Configuration.table;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

import com.example.demo.Entity.table.Tax;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo.Repo.table",
        entityManagerFactoryRef = "TaxEntityManagerFactory",
        transactionManagerRef= "TaxTransactionManager")
public class TaxTableConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.tax")
    public DataSourceProperties TaxDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.tax.configuration")
    public DataSource TaxDataSource() {
        return TaxDataSourceProperties().initializeDataSourceBuilder()
                .type(BasicDataSource.class).build();
    }

    @Bean(name = "TaxEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean TaxEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(TaxDataSource())
                .packages(Tax.class)
                .build();
    }

    @Bean
    public PlatformTransactionManager TaxTransactionManager(
            final @Qualifier("TaxEntityManagerFactory") LocalContainerEntityManagerFactoryBean TaxEntityManagerFactory) {
        return new JpaTransactionManager(TaxEntityManagerFactory.getObject());
    }
}
