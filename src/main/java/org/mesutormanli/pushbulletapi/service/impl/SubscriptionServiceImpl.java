package org.mesutormanli.pushbulletapi.service.impl;

import org.mesutormanli.pushbulletapi.model.ChannelInfo;
import org.mesutormanli.pushbulletapi.model.Subscription;
import org.mesutormanli.pushbulletapi.model.request.subscription.GetChannelInfoRequest;
import org.mesutormanli.pushbulletapi.model.request.subscription.UpdateSubsciptionRequest;
import org.mesutormanli.pushbulletapi.service.SubscriptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public List<Subscription> listSubscriptions() {
        //TODO: implemenation
        return null;
    }

    @Override
    public Subscription createSubscription(String channelTag) {
        //TODO: implemenation
        return null;
    }

    @Override
    public Subscription updateSubscription(UpdateSubsciptionRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public void deleteSubscription(String iden) {
        //TODO: implemenation
    }

    @Override
    public ChannelInfo getChannelInfo(GetChannelInfoRequest request) {
        //TODO: implemenation
        return null;
    }
}
