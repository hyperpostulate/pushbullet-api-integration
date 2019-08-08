package org.mesutormanli.pushbulletapi.service.impl;

import org.mesutormanli.pushbulletapi.model.Push;
import org.mesutormanli.pushbulletapi.model.request.push.CreatePushRequest;
import org.mesutormanli.pushbulletapi.model.request.push.ListPushesRequest;
import org.mesutormanli.pushbulletapi.model.request.push.UpdatePushRequest;
import org.mesutormanli.pushbulletapi.service.PushService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PushServiceImpl implements PushService {
    @Override
    public List<Push> listPushes(ListPushesRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public Push createPush(CreatePushRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public Push updatePush(UpdatePushRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public void deletePush(String iden) {
        //TODO: implemenation
    }

    @Override
    public void deleteAllPushes() {
        //TODO: implemenation
    }
}
