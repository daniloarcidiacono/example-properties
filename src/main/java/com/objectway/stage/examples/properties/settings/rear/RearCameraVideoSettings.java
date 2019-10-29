package com.objectway.stage.examples.properties.settings.rear;

import com.objectway.stage.examples.properties.settings.codecs.VideoCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RearCameraVideoSettings {
    @Value("${camera.rear.video.resolution}")
    private String resolution;

    @Value("${camera.rear.video.fps}")
    private float fps;

    @Value("${camera.rear.video.codec}")
    private VideoCodec codec;

    public String getResolution() {
        return resolution;
    }

    public float getFps() {
        return fps;
    }

    public VideoCodec getCodec() {
        return codec;
    }

    @Override
    public String toString() {
        return "RearCameraVideoSettings{" +
                "resolution='" + resolution + '\'' +
                ", fps=" + fps +
                ", codec=" + codec +
                '}';
    }
}
