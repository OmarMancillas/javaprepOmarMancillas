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
public class EjemplosLoops {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			log.info(i + ".- Inside For Loop");
		}

		int y = 0;
		while (y < 5) {
			log.info(y + ".- Inside While Loop");
			y++;
		}

		int z = 0;
		do {
			log.info(z + ".- Inside Do-While Loop");
			z++;
		} while (z < 5);
	}

}
