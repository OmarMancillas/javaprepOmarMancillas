package com.enroutesystems;

import org.junit.jupiter.api.Test;

import com.enroutesystems.EjemploInterfaceImplements.Hombre;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploInterfaceImplementsTest {
	@Test
	public void test() {
		Hombre hombre = new Hombre();
		hombre.caminar();
		hombre.hablar();
		hombre.correr();
	}
}
