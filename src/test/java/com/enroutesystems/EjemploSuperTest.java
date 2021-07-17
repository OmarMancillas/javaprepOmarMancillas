package com.enroutesystems;

import org.junit.jupiter.api.Test;

import com.enroutesystems.EjemploSuper.Estudiante;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploSuperTest {
	
	@Test
	public void test() {
		Estudiante estudiante = new Estudiante();
		log.info(estudiante.showInfo());
	}
}
