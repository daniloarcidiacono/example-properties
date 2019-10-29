package com.objectway.stage.examples.properties.settings.media;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class MediaSettings {
    /**
     * Audio settings.
     */
    @NestedConfigurationProperty
    private AudioSettings audio;

    /**
     * Video settings.
     */
    @NestedConfigurationProperty
    private VideoSettings video;

    public AudioSettings getAudio() {
        return audio;
    }

    public void setAudio(AudioSettings audio) {
        this.audio = audio;
    }

    public VideoSettings getVideo() {
        return video;
    }

    public void setVideo(VideoSettings video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "MediaSettings{" +
                "audio=" + audio +
                ", video=" + video +
                '}';
    }
}
