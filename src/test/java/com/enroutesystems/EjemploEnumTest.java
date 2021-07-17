package com.enroutesystems;

import org.junit.jupiter.api.Test;

import com.enroutesystems.EjemploEnum.Days;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploEnumTest {
	@Test
	public void testEnum() {
		for (Days day : EjemploEnum.Days.values()) {
			log.info("" + day);
		}
	}
	
}
