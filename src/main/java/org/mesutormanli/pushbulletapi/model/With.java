package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class With {
    private String email;
    private String emailNormalized;
    private String iden;
    private String imageUrl;
    private String type;
    private String name;

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

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        With with = (With) o;
        return Objects.equals(email, with.email) &&
                Objects.equals(emailNormalized, with.emailNormalized) &&
                Objects.equals(iden, with.iden) &&
                Objects.equals(imageUrl, with.imageUrl) &&
                Objects.equals(type, with.type) &&
                Objects.equals(name, with.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, emailNormalized, iden, imageUrl, type, name);
    }

    @Override
    public String toString() {
        return "With{" +
                "email='" + email + '\'' +
                ", emailNormalized='" + emailNormalized + '\'' +
                ", iden='" + iden + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
