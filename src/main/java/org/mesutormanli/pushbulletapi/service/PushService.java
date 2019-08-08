package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.Push;
import org.mesutormanli.pushbulletapi.model.request.push.CreatePushRequest;
import org.mesutormanli.pushbulletapi.model.request.push.ListPushesRequest;
import org.mesutormanli.pushbulletapi.model.request.push.UpdatePushRequest;

import java.util.List;

public interface PushService {

    List<Push> listPushes(ListPushesRequest request);

    Push createPush(CreatePushRequest request);

    Push updatePush(UpdatePushRequest request);

    void deletePush(String iden);

    void deleteAllPushes();

}
