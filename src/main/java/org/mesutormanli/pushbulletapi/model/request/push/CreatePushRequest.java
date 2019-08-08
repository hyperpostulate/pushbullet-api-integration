package org.mesutormanli.pushbulletapi.model.request.push;

import java.util.Objects;

public class CreatePushRequest {
    private String device_iden;
    private String email;
    private String channel_tag;
    private String client_iden;
    private String type;
    private String title;
    private String body;
    private String url;
    private String fileName;
    private String fileType;
    private String fileUrl;

    public String getDevice_iden() {
        return device_iden;
    }

    public void setDevice_iden(String device_iden) {
        this.device_iden = device_iden;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChannel_tag() {
        return channel_tag;
    }

    public void setChannel_tag(String channel_tag) {
        this.channel_tag = channel_tag;
    }

    public String getClient_iden() {
        return client_iden;
    }

    public void setClient_iden(String client_iden) {
        this.client_iden = client_iden;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePushRequest that = (CreatePushRequest) o;
        return Objects.equals(device_iden, that.device_iden) &&
                Objects.equals(email, that.email) &&
                Objects.equals(channel_tag, that.channel_tag) &&
                Objects.equals(client_iden, that.client_iden) &&
                Objects.equals(type, that.type) &&
                Objects.equals(title, that.title) &&
                Objects.equals(body, that.body) &&
                Objects.equals(url, that.url) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(fileType, that.fileType) &&
                Objects.equals(fileUrl, that.fileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device_iden, email, channel_tag, client_iden, type, title, body, url, fileName, fileType, fileUrl);
    }

    @Override
    public String toString() {
        return "CreatePushRequest{" +
                "device_iden='" + device_iden + '\'' +
                ", email='" + email + '\'' +
                ", channel_tag='" + channel_tag + '\'' +
                ", client_iden='" + client_iden + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", url='" + url + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                '}';
    }
}
