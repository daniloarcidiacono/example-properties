package com.objectway.stage.examples.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.objectway.stage.examples.properties");
        ctx.refresh();
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

        for (PropertySource<?> propertySource : ctx.getEnvironment().getPropertySources()) {
            System.out.println(propertySource.getName());
            System.out.println("---------------------");

            for (String propertyName : ((EnumerablePropertySource) propertySource).getPropertyNames()) {
                System.out.println(
                    String.format(
                        "%s -> %s",
                        propertyName,
                        propertySource.getProperty(propertyName)
                    )
                );
            }

            System.out.println();
        }

        System.out.println(ctx.getBean(MyBean.class));
        ctx.close();
    }
}
