package org.mesutormanli.pushbulletapi.model;

import java.util.List;
import java.util.Objects;

public class ChannelInfo {
    private String iden;
    private String name;
    private String description;
    private String imageUrl;
    private Integer subscriberCount;
    private String tag;
    private List<Push> recentPushes;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(Integer subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Push> getRecentPushes() {
        return recentPushes;
    }

    public void setRecentPushes(List<Push> recentPushes) {
        this.recentPushes = recentPushes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelInfo that = (ChannelInfo) o;
        return Objects.equals(iden, that.iden) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(subscriberCount, that.subscriberCount) &&
                Objects.equals(tag, that.tag) &&
                Objects.equals(recentPushes, that.recentPushes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, name, description, imageUrl, subscriberCount, tag, recentPushes);
    }

    @Override
    public String toString() {
        return "ChannelInfo{" +
                "iden='" + iden + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", subscriberCount=" + subscriberCount +
                ", tag='" + tag + '\'' +
                ", recentPushes=" + recentPushes +
                '}';
    }
}
