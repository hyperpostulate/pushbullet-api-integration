package org.mesutormanli.pushbulletapi.model.request.device;

import java.util.Objects;

public class CreateDeviceRequest {
    private String nickName;
    private String model;
    private String manufacturer;
    private String pushToken;
    private Integer appVersion;
    private String icon;
    private String hasSms;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHasSms() {
        return hasSms;
    }

    public void setHasSms(String hasSms) {
        this.hasSms = hasSms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateDeviceRequest that = (CreateDeviceRequest) o;
        return Objects.equals(nickName, that.nickName) &&
                Objects.equals(model, that.model) &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(pushToken, that.pushToken) &&
                Objects.equals(appVersion, that.appVersion) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(hasSms, that.hasSms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, model, manufacturer, pushToken, appVersion, icon, hasSms);
    }

    @Override
    public String toString() {
        return "CreateDeviceRequest{" +
                "nickName='" + nickName + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", pushToken='" + pushToken + '\'' +
                ", appVersion=" + appVersion +
                ", icon='" + icon + '\'' +
                ", hasSms='" + hasSms + '\'' +
                '}';
    }
}
