package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class User {
    private String iden;
    private Float created;
    private Float modified;
    private String email;
    private String emailNormalized;
    private String name;
    private String imageUrl;
    private Integer maxUploadSize;
    private Integer referredCount;
    private String referrerIden;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailNormalized() {
        return emailNormalized;
    }

    public void setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMaxUploadSize() {
        return maxUploadSize;
    }

    public void setMaxUploadSize(Integer maxUploadSize) {
        this.maxUploadSize = maxUploadSize;
    }

    public Integer getReferredCount() {
        return referredCount;
    }

    public void setReferredCount(Integer referredCount) {
        this.referredCount = referredCount;
    }

    public String getReferrerIden() {
        return referrerIden;
    }

    public void setReferrerIden(String referrerIden) {
        this.referrerIden = referrerIden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(iden, user.iden) &&
                Objects.equals(created, user.created) &&
                Objects.equals(modified, user.modified) &&
                Objects.equals(email, user.email) &&
                Objects.equals(emailNormalized, user.emailNormalized) &&
                Objects.equals(name, user.name) &&
                Objects.equals(imageUrl, user.imageUrl) &&
                Objects.equals(maxUploadSize, user.maxUploadSize) &&
                Objects.equals(referredCount, user.referredCount) &&
                Objects.equals(referrerIden, user.referrerIden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, created, modified, email, emailNormalized, name, imageUrl, maxUploadSize, referredCount, referrerIden);
    }

    @Override
    public String toString() {
        return "User{" +
                "iden='" + iden + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", email='" + email + '\'' +
                ", emailNormalized='" + emailNormalized + '\'' +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", maxUploadSize=" + maxUploadSize +
                ", referredCount=" + referredCount +
                ", referrerIden='" + referrerIden + '\'' +
                '}';
    }
}
