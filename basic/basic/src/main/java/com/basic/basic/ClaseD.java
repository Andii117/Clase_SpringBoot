package com.basic.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ClaseD {

	private ClaseC claseC;

    public ClaseD(@Autowired ClaseC claseC) {
        this.claseC = claseC;
    }
    
    public String informacion() {
        return "ClaseD{" + "claseC=" + claseC.informacion() + '}';
    }
}
