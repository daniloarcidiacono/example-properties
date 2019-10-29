package com.objectway.stage.examples.properties.settings;

import com.objectway.stage.examples.properties.settings.media.MediaSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

/**
 * The camera settings.
 */
@Configuration
@ConfigurationProperties(prefix = "camera")
public class CameraSettings {
    /**
     * Front camera settings.
     */
    @Autowired
    @Qualifier("frontCamera")
    @NestedConfigurationProperty
    private MediaSettings front;

    /**
     * Rear camera settings.
     */
    @Autowired
    @Qualifier("rearCamera")
    @NestedConfigurationProperty
    private MediaSettings rear;

    public MediaSettings getFront() {
        return front;
    }

    public void setFront(MediaSettings front) {
        this.front = front;
    }

    public MediaSettings getRear() {
        return rear;
    }

    public void setRear(MediaSettings rear) {
        this.rear = rear;
    }

    @Override
    public String toString() {
        return "CameraSettings{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
