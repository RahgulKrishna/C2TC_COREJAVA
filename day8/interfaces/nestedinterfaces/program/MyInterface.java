//Nested Interface
package com.tns.ifet.day8.interfaces.nestedinterfaces.program;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}