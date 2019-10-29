package com.objectway.stage.examples.properties.settings.rear;

import com.objectway.stage.examples.properties.settings.codecs.AudioCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RearCameraAudioSettings {
    @Value("${camera.rear.audio.volume}")
    private int volume;

    @Value("${camera.rear.audio.codec:WAV}")
    private AudioCodec codec;

    @Value("${camera.rear.audio.sampleRate:44100}")
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
        return "RearCameraAudioSettings{" +
                "volume=" + volume +
                ", codec='" + codec + '\'' +
                ", samplingRate=" + samplingRate +
                '}';
    }
}
