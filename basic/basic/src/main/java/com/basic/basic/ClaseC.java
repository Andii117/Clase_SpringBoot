package com.basic.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClaseC {

	 @Autowired 
	    private ClaseA claseA;
	     
	    @Autowired
	    private ClaseB claseB;

	    public String informacion() {
	        return "ClaseC{" + "claseA=" + claseA.informacion() + " " + claseA.toString() 
	                + ", claseB=" + claseB.informacion() + " " + claseB.toString() + '}';
	    }
}
