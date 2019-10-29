package com.objectway.stage.examples.properties.settings.rear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RearCameraSettings {
    @Autowired
    private RearCameraAudioSettings audioSettings;

    @Autowired
    private RearCameraVideoSettings videoSettings;

    @Override
    public String toString() {
        return "RearCameraSettings{" +
                "audioSettings=" + audioSettings +
                ", videoSettings=" + videoSettings +
                '}';
    }
}
