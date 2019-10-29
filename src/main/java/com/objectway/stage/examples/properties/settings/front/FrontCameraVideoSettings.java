package com.objectway.stage.examples.properties.settings.front;

import com.objectway.stage.examples.properties.settings.codecs.VideoCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FrontCameraVideoSettings {
    @Value("${camera.front.video.resolution}")
    private String resolution;

    @Value("${camera.front.video.fps}")
    private float fps;

    @Value("${camera.front.video.codec}")
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
        return "FrontCameraVideoSettings{" +
                "resolution='" + resolution + '\'' +
                ", fps=" + fps +
                ", codec=" + codec +
                '}';
    }
}
