package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.Chat;

import java.util.List;

public interface ChatService {

    List<Chat> listChats();

    Chat createChat(String email);

    Chat updateChat(Boolean muted);

    void deleteChat(String iden);

}
