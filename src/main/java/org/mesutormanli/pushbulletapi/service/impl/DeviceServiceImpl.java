package org.mesutormanli.pushbulletapi.service.impl;

import org.mesutormanli.pushbulletapi.model.Device;
import org.mesutormanli.pushbulletapi.model.request.device.CreateDeviceRequest;
import org.mesutormanli.pushbulletapi.model.request.device.UpdateDeviceRequest;
import org.mesutormanli.pushbulletapi.service.DeviceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Override
    public List<Device> listDevices() {
        //TODO: implemenation
        return null;
    }

    @Override
    public Device createDevice(CreateDeviceRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public Device updateDevice(UpdateDeviceRequest request) {
        //TODO: implemenation
        return null;
    }

    @Override
    public void deleteDevice(String iden) {
        //TODO: implemenation
    }
}
