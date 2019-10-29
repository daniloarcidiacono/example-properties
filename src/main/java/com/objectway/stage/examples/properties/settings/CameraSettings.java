package com.objectway.stage.examples.properties.settings;

import com.objectway.stage.examples.properties.settings.front.FrontCameraSettings;
import com.objectway.stage.examples.properties.settings.rear.RearCameraSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraSettings {
    @Autowired
    private FrontCameraSettings frontCameraSettings;

    @Autowired
    private RearCameraSettings rearCameraSettings;

    public FrontCameraSettings getFrontCameraSettings() {
        return frontCameraSettings;
    }

    public RearCameraSettings getBackCameraSettings() {
        return rearCameraSettings;
    }

    @Override
    public String toString() {
        return "CameraSettings{" +
                "frontCameraSettings=" + frontCameraSettings +
                ", rearCameraSettings=" + rearCameraSettings +
                '}';
    }
}
