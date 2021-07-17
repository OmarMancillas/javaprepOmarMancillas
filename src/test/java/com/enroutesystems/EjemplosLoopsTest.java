package com.enroutesystems;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosLoopsTest {
	@Test
	public void testLoops() {
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
