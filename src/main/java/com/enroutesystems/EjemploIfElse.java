/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enroutesystems;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author omarm
 */
@Slf4j
public class EjemploIfElse {

	public static void main(String[] args) {
		Random r = new Random();
		int low = 0;
		int high = 10;
		int random = r.nextInt(high - low) + low;

		if (random < 5) {
			log.info("Random ({}) number less than 5", random);
		} else {
			log.info("Random number({}) equals or more than 5", random);
		}

	}
}
