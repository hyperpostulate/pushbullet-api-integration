package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.Device;
import org.mesutormanli.pushbulletapi.model.request.CreateDeviceRequest;
import org.mesutormanli.pushbulletapi.model.request.UpdateDeviceRequest;

import java.util.List;

public interface DeviceService {

    List<Device> listDevices();

    Device createDevice(CreateDeviceRequest request);

    Device updateDevice(UpdateDeviceRequest request);

    void deleteDevice(String iden);
}
