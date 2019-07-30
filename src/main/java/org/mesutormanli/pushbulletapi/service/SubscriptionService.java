package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.ChannelInfo;
import org.mesutormanli.pushbulletapi.model.Subscription;
import org.mesutormanli.pushbulletapi.model.request.subscription.GetChannelInfoRequest;
import org.mesutormanli.pushbulletapi.model.request.subscription.UpdateSubsciptionRequest;

import java.util.List;

public interface SubscriptionService {

    List<Subscription> listSubscriptions();

    Subscription createSubscription(String channelTag);

    Subscription updateSubscription(UpdateSubsciptionRequest request);

    void deleteSubscription(String iden);

    ChannelInfo getChannelInfo(GetChannelInfoRequest request);

}
