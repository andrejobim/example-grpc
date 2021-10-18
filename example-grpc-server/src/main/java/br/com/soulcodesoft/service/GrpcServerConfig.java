package br.com.soulcodesoft.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.logging.Logger;


@Configuration
@PropertySource({"classpath:application-server.properties"})
public class GrpcServerConfig {

    private static final Logger LOGGER = Logger.getLogger(GrpcServerConfig.class.getName());

    @Value("${grpc.server.port}")
    private int port;

    @Autowired
    private ServerPhoneBookServiceImpl serverPhoneBookService;

    @Bean
    public void init(){
        try {
            LOGGER.info("Contexto Configuração Servidor Instanciado.");
            ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port);
            ServerBuilder<?> service = serverBuilder.addService(serverPhoneBookService);
            Server build = service.build();
            GrpcServerService grpcServerService = new GrpcServerServiceImpl(port, build);
            grpcServerService.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
