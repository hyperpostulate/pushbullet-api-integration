package org.mesutormanli.pushbulletapi.service.impl;

import org.mesutormanli.pushbulletapi.model.Chat;
import org.mesutormanli.pushbulletapi.service.ChatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public List<Chat> listChats() {
        //TODO: implemenation
        return null;
    }

    @Override
    public Chat createChat(String email) {
        //TODO: implemenation
        return null;
    }

    @Override
    public Chat updateChat(Boolean muted) {
        //TODO: implemenation
        return null;
    }

    @Override
    public void deleteChat(String iden) {
        //TODO: implemenation
    }
}
