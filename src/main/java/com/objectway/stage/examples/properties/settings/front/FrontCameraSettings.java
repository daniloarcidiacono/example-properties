package com.objectway.stage.examples.properties.settings.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrontCameraSettings {
    @Autowired
    private FrontCameraAudioSettings audioSettings;

    @Autowired
    private FrontCameraVideoSettings videoSettings;

    @Override
    public String toString() {
        return "FrontCameraSettings{" +
                "audioSettings=" + audioSettings +
                ", videoSettings=" + videoSettings +
                '}';
    }
}
