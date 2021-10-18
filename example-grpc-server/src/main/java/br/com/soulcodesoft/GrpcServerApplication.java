package br.com.soulcodesoft;

import br.com.soulcodesoft.config.GrpcDatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcDatabaseConfig.class, args);
    }
}
