package br.com.soulcodesoft.service;

import br.com.soulcodesoft.protoservice.PhoneBookServiceGrpc;

public interface GrpcClientService {

    PhoneBookServiceGrpc.PhoneBookServiceStub getBookStub();

    PhoneBookServiceGrpc.PhoneBookServiceBlockingStub getBlockStub();

}
