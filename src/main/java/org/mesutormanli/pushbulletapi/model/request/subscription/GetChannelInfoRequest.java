package org.mesutormanli.pushbulletapi.model.request.subscription;

import java.util.Objects;

public class GetChannelInfoRequest {
    private String tag;
    private Boolean noRecentPushes;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getNoRecentPushes() {
        return noRecentPushes;
    }

    public void setNoRecentPushes(Boolean noRecentPushes) {
        this.noRecentPushes = noRecentPushes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChannelInfoRequest that = (GetChannelInfoRequest) o;
        return Objects.equals(tag, that.tag) &&
                Objects.equals(noRecentPushes, that.noRecentPushes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, noRecentPushes);
    }

    @Override
    public String toString() {
        return "GetChannelInfoRequest{" +
                "tag='" + tag + '\'' +
                ", noRecentPushes=" + noRecentPushes +
                '}';
    }
}
