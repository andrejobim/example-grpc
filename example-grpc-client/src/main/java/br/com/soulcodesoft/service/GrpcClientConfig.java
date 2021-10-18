package br.com.soulcodesoft.service;

import br.com.soulcodesoft.protoservice.PhoneBookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:application-server.properties"})
public class GrpcClientConfig {

    @Value("${grpc.server.port}")
    private int port;

    @Value("${grpc.server.host}")
    private String host;

    @Bean
    public GrpcClientService connectFactoryGrpc(){
        return new GrpcClientServiceImpl(host, port);
    }


}
