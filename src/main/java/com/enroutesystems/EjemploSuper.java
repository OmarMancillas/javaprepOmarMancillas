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
public class EjemploSuper {

	// Using return statement
	static class Persona {
		void showInfoPersona() {
			log.info("Class Persona");
		}
	}

	static class Estudiante extends Persona {
		String clase = "Class Estudiante";

		public String showInfo() {
			super.showInfoPersona();
			return (this.clase);
		}
	}

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		log.info(estudiante.showInfo());
	}

}
