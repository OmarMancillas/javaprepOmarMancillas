package com.enroutesystems;

import java.util.Random;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploIfElseTest {
	@Test
	public void testIfElse() {
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
