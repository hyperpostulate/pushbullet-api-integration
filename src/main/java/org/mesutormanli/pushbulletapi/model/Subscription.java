package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class Subscription {
    private String iden;
    private Boolean active;
    private Float created;
    private Float modified;
    private Boolean muted;
    private Channel channel;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Float getCreated() {
        return created;
    }

    public void setCreated(Float created) {
        this.created = created;
    }

    public Float getModified() {
        return modified;
    }

    public void setModified(Float modified) {
        this.modified = modified;
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Objects.equals(iden, that.iden) &&
                Objects.equals(active, that.active) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(muted, that.muted) &&
                Objects.equals(channel, that.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, active, created, modified, muted, channel);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "iden='" + iden + '\'' +
                ", active=" + active +
                ", created=" + created +
                ", modified=" + modified +
                ", muted=" + muted +
                ", channel=" + channel +
                '}';
    }
}
