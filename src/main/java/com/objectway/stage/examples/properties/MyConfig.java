package com.objectway.stage.examples.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// Equivalent to:
//   final ConfigurableEnvironment environment = ctx.getEnvironment();
//   final MutablePropertySources propertySources = environment.getPropertySources();
//   propertySources.addLast(new ResourcePropertySource("appProps", "application.properties"));
@PropertySource("application.properties")
public class MyConfig {
    /**
     * Starting from Spring Framework 4.3:
     *
     *  "Explicit registration of PropertySourcesPlaceholderConfigurer via a static @Bean
     *   method is typically only required if you need to customize configuration such as the
     *   placeholder syntax, etc. Spring will register a default embedded value resolver which
     *   resolves placeholders against property sources registered in the Environment."
     *
     * @see <a href="https://stackoverflow.com/a/52008842"></a>
     * @see <a href="https://github.com/spring-projects/spring-framework/issues/21745"></a>
     * @see <a href="https://github.com/spring-projects/spring-framework/commit/f55a6051dfe0ea51fc82196cb6ca3c9a4e1570ff"></a>
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(false);
        return propertySourcesPlaceholderConfigurer;
    }
}
