/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enroutesystems;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author omarm
 */
@Slf4j
public class EjemploDataTypes {

	private static byte byteValue = 127;
	private static short shortValue = 32767;
	private static int integerValue = 2147483647;
	private static long longValue = 9223372036854775807L;
	private static float floatValue = 10.515654744F;
	private static double doubleValue = 10.515654744;
	private static boolean trueBooleanValue = true;
	private static boolean falseBooleanValue = false;
	private static char charValue = 'E';

	public static void showValues() {
		log.info("This is a byte value: {}. MAX_VALUE: {}, MIN_VALUE: {}", byteValue, Byte.MAX_VALUE, Byte.MIN_VALUE);
		log.info("This is a short value: {}. MAX_VALUE: {}, MIN_VALUE: {}", shortValue, Short.MAX_VALUE,
				Short.MIN_VALUE);
		log.info("This is an int value: {}. MAX_VALUE: {}, MIN_VALUE: {}", integerValue, Integer.MAX_VALUE,
				Integer.MIN_VALUE);
		log.info("This is a long value: {}. MAX_VALUE: {}, MIN_VALUE: {}", longValue, Long.MAX_VALUE, Long.MIN_VALUE);
		log.info("This is a float value: {}. MAX_VALUE: {}, MIN_VALUE: {}", floatValue, Float.MAX_VALUE,
				Float.MIN_VALUE);
		log.info("This is a double value: {}. MAX_VALUE: {}, MIN_VALUE: {}", doubleValue, Double.MAX_VALUE,
				Double.MIN_VALUE);
		log.info("This is a true boolean value: {}.", trueBooleanValue);
		log.info("This is a true boolean value: {}.", falseBooleanValue);
		log.info("This is a char value: {}.   ", charValue);
	}

	public static void main(String[] args) {
		showValues();
	}
}
