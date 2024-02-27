package com.basic.basic;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FabricaObjetos {

	@Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ClaseA objetoClaseA(){
        return new ClaseA();
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ClaseB objetoClaseB(){
        return new ClaseB();
    }    
}
