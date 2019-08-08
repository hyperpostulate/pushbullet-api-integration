package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class Device {
    private String iden;
    private Boolean active;
    private Float created;
    private Float modified;
    private String icon;
    private String nickName;
    private Boolean nicknameGenerated;
    private String manufacturer;
    private String model;
    private Integer appVersion;
    private String fingerprint;
    private String keyFingerprint;
    private String pushToken;
    private String hasSms;

    @Deprecated
    private String type;

    @Deprecated
    private String kind;

    @Deprecated
    private Boolean pushable;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getNicknameGenerated() {
        return nicknameGenerated;
    }

    public void setNicknameGenerated(Boolean nicknameGenerated) {
        this.nicknameGenerated = nicknameGenerated;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getHasSms() {
        return hasSms;
    }

    public void setHasSms(String hasSms) {
        this.hasSms = hasSms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Boolean getPushable() {
        return pushable;
    }

    public void setPushable(Boolean pushable) {
        this.pushable = pushable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(iden, device.iden) &&
                Objects.equals(active, device.active) &&
                Objects.equals(created, device.created) &&
                Objects.equals(modified, device.modified) &&
                Objects.equals(icon, device.icon) &&
                Objects.equals(nickName, device.nickName) &&
                Objects.equals(nicknameGenerated, device.nicknameGenerated) &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(model, device.model) &&
                Objects.equals(appVersion, device.appVersion) &&
                Objects.equals(fingerprint, device.fingerprint) &&
                Objects.equals(keyFingerprint, device.keyFingerprint) &&
                Objects.equals(pushToken, device.pushToken) &&
                Objects.equals(hasSms, device.hasSms) &&
                Objects.equals(type, device.type) &&
                Objects.equals(kind, device.kind) &&
                Objects.equals(pushable, device.pushable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, active, created, modified, icon, nickName, nicknameGenerated, manufacturer, model, appVersion, fingerprint, keyFingerprint, pushToken, hasSms, type, kind, pushable);
    }

    @Override
    public String toString() {
        return "Device{" +
                "iden='" + iden + '\'' +
                ", active=" + active +
                ", created=" + created +
                ", modified=" + modified +
                ", icon='" + icon + '\'' +
                ", nickName='" + nickName + '\'' +
                ", nicknameGenerated=" + nicknameGenerated +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", appVersion=" + appVersion +
                ", fingerprint='" + fingerprint + '\'' +
                ", keyFingerprint='" + keyFingerprint + '\'' +
                ", pushToken='" + pushToken + '\'' +
                ", hasSms='" + hasSms + '\'' +
                ", type='" + type + '\'' +
                ", kind='" + kind + '\'' +
                ", pushable=" + pushable +
                '}';
    }
}
