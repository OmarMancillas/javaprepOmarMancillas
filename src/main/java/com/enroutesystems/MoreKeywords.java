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
public class MoreKeywords {

	public static void main(String[] args) throws Exception {

		// Using break
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				log.info("If value less than 5, then it continues...");
				continue;
			} else {
				log.info("When value equals or more than 5, it stops (break)");
				break;
			}
		}

		// Using instanceof
		String stringInstance = "Instance of string";
		boolean isInstance = stringInstance instanceof String;
		log.info("Is stringInstance instance of String? " + isInstance);

		// Using try-catch-finally
		// Using null
		try {
			String text = null;
			log.info("Text Empty? " + (text == null));
		} catch (Exception ex) {
			throw new Exception(ex.getMessage());
		} finally {
			log.info("Always Executes 'finally statement'");
		}
	}
}
