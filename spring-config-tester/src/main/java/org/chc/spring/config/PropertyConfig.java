package org.chc.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:jm.properties")
public class PropertyConfig {
    @Autowired
    Environment env; 
    @Bean
    public PropertyConsumer consumer(){
        PropertyConsumer consume = new PropertyConsumer();
        consume.setHost(env.getProperty("ga.integer32.host"));
        consume.setPort(env.getProperty("ga.integer32.port"));
        return consume;
    }   
    
    
}
