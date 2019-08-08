package org.mesutormanli.pushbulletapi.model.response;

import java.util.Objects;

public class UploadRequestResponse {
    private String fileName;
    private String fileType;
    private String fileUrl;
    private String uploadUrl;

    @Deprecated
    private Object data;

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

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadRequestResponse that = (UploadRequestResponse) o;
        return Objects.equals(fileName, that.fileName) &&
                Objects.equals(fileType, that.fileType) &&
                Objects.equals(fileUrl, that.fileUrl) &&
                Objects.equals(uploadUrl, that.uploadUrl) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileType, fileUrl, uploadUrl, data);
    }

    @Override
    public String toString() {
        return "UploadRequestResponse{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", uploadUrl='" + uploadUrl + '\'' +
                ", data=" + data +
                '}';
    }
}
