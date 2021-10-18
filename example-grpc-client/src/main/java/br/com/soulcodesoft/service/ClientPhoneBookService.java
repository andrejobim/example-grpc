package br.com.soulcodesoft.service;

import br.com.soulcodesoft.protoentity.ContactMessage;

public interface ClientPhoneBookService {

    void shouldCallRecordContactBidirecionalStream();

    void souldCallRecordContactClientStream(ContactMessage contactMessage);

    void shouldCallRecordContactServerStream(ContactMessage contactMessage);

}
