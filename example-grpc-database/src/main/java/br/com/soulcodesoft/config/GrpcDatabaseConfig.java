package br.com.soulcodesoft.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.logging.Level;
import java.util.logging.Logger;

@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = {
        "br.com.soulcodesoft.service",
        "br.com.soulcodesoft.dao"
})
@EnableJpaRepositories(basePackages = {
        "br.com.soulcodesoft.dao"
})
@EntityScan(basePackages = {
        "br.com.soulcodesoft.entity"
})
@Configuration
@PropertySource({"classpath:application-db.properties"})
public class GrpcDatabaseConfig {

}
