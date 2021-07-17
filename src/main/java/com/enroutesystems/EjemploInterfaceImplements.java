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
public class EjemploInterfaceImplements {

	interface Persona {

		public void caminar();

		public void hablar();

		public void correr();
	}

	public static class Hombre implements Persona {

		@Override
		public void caminar() {
			log.info("Implementing caminar() from {}", Persona.class.getName());
		}

		@Override
		public void hablar() {
			log.info("Implementing hablar() form {}", Persona.class.getName());
		}

		@Override
		public void correr() {
			log.info("Implementing correr() from {}", Persona.class.getName());
		}

	}

	public static void main(String[] args) {
		Hombre hombre = new Hombre();
		hombre.caminar();
		hombre.hablar();
		hombre.correr();

	}

}
