package com.enroutesystems;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploSwitchCaseBreakDefaultTest {
	int opcion = 2;
	@Test
	public void test() {
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
