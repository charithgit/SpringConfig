package org.chc.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(PropertyConfig.class);
        ctx.refresh();

        PropertyConsumer consumer = ctx.getBean(PropertyConsumer.class);

        System.out.println(consumer.getHost());
        System.out.println(consumer.getPort());

    }
}
