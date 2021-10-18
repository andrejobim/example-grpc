package br.com.soulcodesoft.service;


import io.grpc.Server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrpcServerServiceImpl implements GrpcServerService {

    private static final Logger LOGGER = Logger.getLogger(GrpcServerServiceImpl.class.getName());

    private  Server server;
    private  final int port;

    public GrpcServerServiceImpl(int port, Server server) {
        this.port = port;
        this.server = server;
    }

    public void start() throws InterruptedException {
        try {
            this.server.start();
            LOGGER.info("gRPC Online, Escutando Porta: " + this.port);
//            GrpcServerServiceImpl.this.blockUntilShutdown();
//            Thread thread = new Thread(() -> {
//                try {
//                    GrpcServerServiceImpl.this.stop();
//                } catch (InterruptedException e) {
//                    e.printStackTrace(System.err);
//                }
//            });
//            Runtime.getRuntime().addShutdownHook(thread);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Ocoreeu um erro ao finalizar o serviço", e);
        }
    }

    private void stop() throws InterruptedException {
        if (this.server != null) {
            this.server.shutdown().awaitTermination();
        }
    }
    private void blockUntilShutdown() throws InterruptedException {
        if (this.server != null) {
            this.server.awaitTermination();
        }
    }
}
