package com.objectway.stage.examples.properties.settings.media;

import com.objectway.stage.examples.properties.settings.codecs.AudioCodec;

public class AudioSettings {
    /**
     * Volume (min 0, max 10)
     */
    private int volume;

    /**
     * Audio codec.
     */
    private AudioCodec codec;

    /**
     * Sampling rate (default 96 KHz)
     */
    private int samplingRate = 96000;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public AudioCodec getCodec() {
        return codec;
    }

    public void setCodec(AudioCodec codec) {
        this.codec = codec;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

    @Override
    public String toString() {
        return "AudioSettings{" +
                "volume=" + volume +
                ", codec='" + codec + '\'' +
                ", samplingRate=" + samplingRate +
                '}';
    }
}
