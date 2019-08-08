package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class Channel {
    private String iden;
    private String tag;
    private String name;
    private String description;
    private String imageUrl;
    private String websiteUrl;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return Objects.equals(iden, channel.iden) &&
                Objects.equals(tag, channel.tag) &&
                Objects.equals(name, channel.name) &&
                Objects.equals(description, channel.description) &&
                Objects.equals(imageUrl, channel.imageUrl) &&
                Objects.equals(websiteUrl, channel.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, tag, name, description, imageUrl, websiteUrl);
    }

    @Override
    public String toString() {
        return "Channel{" +
                "iden='" + iden + '\'' +
                ", tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}
