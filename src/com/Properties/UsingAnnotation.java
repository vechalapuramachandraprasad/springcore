package com.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:db.properties")

public class UsingAnnotation {
	@Value("${db.appName}")
	private String appName;
	@Value("${db.StuName}")
	private String StuName;
	@Value("${db.StuSection}")
	private String StuSection;
	@Value("${db.Marks}")
	private int Marks;


   @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}