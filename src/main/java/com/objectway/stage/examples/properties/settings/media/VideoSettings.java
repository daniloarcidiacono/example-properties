package com.objectway.stage.examples.properties.settings.media;

import com.objectway.stage.examples.properties.settings.codecs.VideoCodec;

public class VideoSettings {
    /**
     * Resolution (es. 1920x1080)
     */
    private String resolution;

    /**
     * Frame rate in frames per second.
     */
    private float fps;

    /**
     * Video codec.
     */
    private VideoCodec codec;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public float getFps() {
        return fps;
    }

    public void setFps(float fps) {
        this.fps = fps;
    }

    public VideoCodec getCodec() {
        return codec;
    }

    public void setCodec(VideoCodec codec) {
        this.codec = codec;
    }

    @Override
    public String toString() {
        return "VideoSettings{" +
                "resolution='" + resolution + '\'' +
                ", fps=" + fps +
                ", codec=" + codec +
                '}';
    }
}
