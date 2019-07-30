package org.mesutormanli.pushbulletapi.service;

import org.mesutormanli.pushbulletapi.model.Device;
import org.mesutormanli.pushbulletapi.model.request.device.CreateDeviceRequest;
import org.mesutormanli.pushbulletapi.model.request.device.UpdateDeviceRequest;

import java.util.List;

public interface DeviceService {

    List<Device> listDevices();

    Device createDevice(CreateDeviceRequest request);

    Device updateDevice(UpdateDeviceRequest request);

    void deleteDevice(String iden);
}
