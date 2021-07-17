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
public class EjemploSwitchCaseBreakDefault {

	static int opcion = 5;

	public static void main(String[] args) {
		switch (opcion) {
		case 1:
			log.info("Option 1.");
			break;
		case 2:
			log.info("Option 2.");
			break;
		case 3:
			log.info("Option 3.");
			break;
		case 4:
			log.info("Option 4.");
			break;
		default:
			log.info("Not an option.");
		}
	}
}
