package com.epicode.demoSpring.configurationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationBean {

    @Bean
    @Scope("singleton")
    public UserConfiguration user() {
        //return new UserConfiguration("Mario", "Rossi");
        return new UserConfiguration();
    }

    @Bean
    @Scope("prototype")
    public UserConfiguration userParam(String name, String lastname) {
        //return new UserConfiguration(name, lastname);
        return new UserConfiguration();
    }


}
