package com.objectway.stage.examples.properties.settings.front;

import com.objectway.stage.examples.properties.settings.codecs.AudioCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FrontCameraAudioSettings {
    @Value("${camera.front.audio.volume}")
    private int volume;

    @Value("${camera.front.audio.codec:WAV}")
    private AudioCodec codec;

    @Value("${camera.front.audio.sampleRate:44100}")
    private int samplingRate;

    public int getVolume() {
        return volume;
    }

    public AudioCodec getCodec() {
        return codec;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    @Override
    public String toString() {
        return "FrontCameraAudioSettings{" +
                "volume=" + volume +
                ", codec='" + codec + '\'' +
                ", samplingRate=" + samplingRate +
                '}';
    }
}
