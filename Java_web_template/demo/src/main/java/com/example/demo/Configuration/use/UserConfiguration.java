package com.example.demo.Configuration.use;

import com.example.demo.Entity.use.User;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EntityScan()
@EnableJpaRepositories(basePackages = "com.example.demo.Repo.use",
        entityManagerFactoryRef = "UserEntityManagerFactory",
        transactionManagerRef= "UserTransactionManager"
)
public class UserConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.user")
    public DataSourceProperties UserDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.user.configuration")
    public DataSource UserDataSource() {
        return UserDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "UserEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean UserEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(UserDataSource())
                .packages(User.class)
                .build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager UserTransactionManager(
            final @Qualifier("UserEntityManagerFactory") LocalContainerEntityManagerFactoryBean UserEntityManagerFactory) {
        return new JpaTransactionManager(UserEntityManagerFactory.getObject());
    }

}