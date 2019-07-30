package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.response.UploadRequestResponse;

public interface UploadService {

    UploadRequestResponse uploadRequest(String fileName, String fileType);
}
