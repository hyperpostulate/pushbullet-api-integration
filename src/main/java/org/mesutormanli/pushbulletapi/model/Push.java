package org.mesutormanli.pushbulletapi.model;

import java.util.List;
import java.util.Objects;

public class Push {
    private String iden;
    private Boolean active;
    private Float created;
    private Float modified;
    private String type;
    private Boolean dismissed;
    private String guid;
    private String direction;
    private String senderIden;
    private String senderEmail;
    private String senderEmailNormalized;
    private String senderName;
    private String receiverIden;
    private String receiverEmail;
    private String receiverEmailNormalized;
    private String targetDeviceIden;
    private String sourceDeviceIden;
    private String clientIden;
    private String channelIden;
    private List<String> awakeAppGuids;
    private String title;
    private String body;
    private String url;
    private String fileName;
    private String fileType;
    private String fileUrl;
    private String imageUrl;
    private Integer imageWidth;
    private Integer imageHeight;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getDismissed() {
        return dismissed;
    }

    public void setDismissed(Boolean dismissed) {
        this.dismissed = dismissed;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSenderIden() {
        return senderIden;
    }

    public void setSenderIden(String senderIden) {
        this.senderIden = senderIden;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderEmailNormalized() {
        return senderEmailNormalized;
    }

    public void setSenderEmailNormalized(String senderEmailNormalized) {
        this.senderEmailNormalized = senderEmailNormalized;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverIden() {
        return receiverIden;
    }

    public void setReceiverIden(String receiverIden) {
        this.receiverIden = receiverIden;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverEmailNormalized() {
        return receiverEmailNormalized;
    }

    public void setReceiverEmailNormalized(String receiverEmailNormalized) {
        this.receiverEmailNormalized = receiverEmailNormalized;
    }

    public String getTargetDeviceIden() {
        return targetDeviceIden;
    }

    public void setTargetDeviceIden(String targetDeviceIden) {
        this.targetDeviceIden = targetDeviceIden;
    }

    public String getSourceDeviceIden() {
        return sourceDeviceIden;
    }

    public void setSourceDeviceIden(String sourceDeviceIden) {
        this.sourceDeviceIden = sourceDeviceIden;
    }

    public String getClientIden() {
        return clientIden;
    }

    public void setClientIden(String clientIden) {
        this.clientIden = clientIden;
    }

    public String getChannelIden() {
        return channelIden;
    }

    public void setChannelIden(String channelIden) {
        this.channelIden = channelIden;
    }

    public List<String> getAwakeAppGuids() {
        return awakeAppGuids;
    }

    public void setAwakeAppGuids(List<String> awakeAppGuids) {
        this.awakeAppGuids = awakeAppGuids;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Push push = (Push) o;
        return Objects.equals(iden, push.iden) &&
                Objects.equals(active, push.active) &&
                Objects.equals(created, push.created) &&
                Objects.equals(modified, push.modified) &&
                Objects.equals(type, push.type) &&
                Objects.equals(dismissed, push.dismissed) &&
                Objects.equals(guid, push.guid) &&
                Objects.equals(direction, push.direction) &&
                Objects.equals(senderIden, push.senderIden) &&
                Objects.equals(senderEmail, push.senderEmail) &&
                Objects.equals(senderEmailNormalized, push.senderEmailNormalized) &&
                Objects.equals(senderName, push.senderName) &&
                Objects.equals(receiverIden, push.receiverIden) &&
                Objects.equals(receiverEmail, push.receiverEmail) &&
                Objects.equals(receiverEmailNormalized, push.receiverEmailNormalized) &&
                Objects.equals(targetDeviceIden, push.targetDeviceIden) &&
                Objects.equals(sourceDeviceIden, push.sourceDeviceIden) &&
                Objects.equals(clientIden, push.clientIden) &&
                Objects.equals(channelIden, push.channelIden) &&
                Objects.equals(awakeAppGuids, push.awakeAppGuids) &&
                Objects.equals(title, push.title) &&
                Objects.equals(body, push.body) &&
                Objects.equals(url, push.url) &&
                Objects.equals(fileName, push.fileName) &&
                Objects.equals(fileType, push.fileType) &&
                Objects.equals(fileUrl, push.fileUrl) &&
                Objects.equals(imageUrl, push.imageUrl) &&
                Objects.equals(imageWidth, push.imageWidth) &&
                Objects.equals(imageHeight, push.imageHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, active, created, modified, type, dismissed, guid, direction, senderIden, senderEmail, senderEmailNormalized, senderName, receiverIden, receiverEmail, receiverEmailNormalized, targetDeviceIden, sourceDeviceIden, clientIden, channelIden, awakeAppGuids, title, body, url, fileName, fileType, fileUrl, imageUrl, imageWidth, imageHeight);
    }

    @Override
    public String toString() {
        return "Push{" +
                "iden='" + iden + '\'' +
                ", active=" + active +
                ", created=" + created +
                ", modified=" + modified +
                ", type='" + type + '\'' +
                ", dismissed=" + dismissed +
                ", guid='" + guid + '\'' +
                ", direction='" + direction + '\'' +
                ", senderIden='" + senderIden + '\'' +
                ", senderEmail='" + senderEmail + '\'' +
                ", senderEmailNormalized='" + senderEmailNormalized + '\'' +
                ", senderName='" + senderName + '\'' +
                ", receiverIden='" + receiverIden + '\'' +
                ", receiverEmail='" + receiverEmail + '\'' +
                ", receiverEmailNormalized='" + receiverEmailNormalized + '\'' +
                ", targetDeviceIden='" + targetDeviceIden + '\'' +
                ", sourceDeviceIden='" + sourceDeviceIden + '\'' +
                ", clientIden='" + clientIden + '\'' +
                ", channelIden='" + channelIden + '\'' +
                ", awakeAppGuids=" + awakeAppGuids +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", url='" + url + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageWidth=" + imageWidth +
                ", imageHeight=" + imageHeight +
                '}';
    }
}
