package com.enroutesystems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploConstGotoStrictfp {
/*
 * 		-const keyword is supposedly used to declare a constant value, but in Java there is the keyword final for that
 * 		-goto is not supported in Java, but the closest function would be the labels, 
 * 			after using the keyword continue or break, we can specify the name of a label to indicate where we want to go after that continue/break
 * 		-strictfp
 */
	public strictfp class StrictfpClas{
		public float floatValue;
		
	}
}
