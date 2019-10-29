package com.objectway.stage.examples.properties.config;

import com.objectway.stage.examples.properties.settings.media.MediaSettings;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    @ConfigurationProperties(prefix = "camera.front")
    public MediaSettings frontCamera() {
        return new MediaSettings();
    }

    @Bean
    @ConfigurationProperties(prefix = "camera.rear")
    public MediaSettings rearCamera() {
        return new MediaSettings();
    }
}
