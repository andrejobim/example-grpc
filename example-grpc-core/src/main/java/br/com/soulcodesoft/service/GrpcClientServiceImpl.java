package br.com.soulcodesoft.service;


import br.com.soulcodesoft.protoservice.PhoneBookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientServiceImpl implements GrpcClientService {

    private ManagedChannel channel;

    private static PhoneBookServiceGrpc.PhoneBookServiceStub bookStub;
    private static PhoneBookServiceGrpc.PhoneBookServiceBlockingStub blockStub;

    public GrpcClientServiceImpl(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        blockStub = PhoneBookServiceGrpc.newBlockingStub(channel);
        bookStub = PhoneBookServiceGrpc.newStub(channel);
    }

    public PhoneBookServiceGrpc.PhoneBookServiceStub getBookStub() {
        return this.bookStub;
    }

    public PhoneBookServiceGrpc.PhoneBookServiceBlockingStub getBlockStub() {
        return this.blockStub;
    }

}
