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
public class EjemploEnum {

	public static enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		for (Days day : Days.values()) {
			log.info("" + day);
		}
	}

}
