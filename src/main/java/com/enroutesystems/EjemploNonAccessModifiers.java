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
public class EjemploNonAccessModifiers {
//    Using keyword final
	private final String finalString = "This is a final value, cannot be changed.";

//    Using Keyword synchronized
	public static synchronized void logMethod(String text) {
		for (int i = 0; i < 5; i++) {
			log.info(text);
		}
	}

	public static class Thread1 extends Thread {
		public void run() {
			logMethod("Accessing from Thread1");
		}
	}

	public static class Thread2 extends Thread {
		public void run() {
			logMethod("Accessing from Thread2");
		}
	}

	public static void main(String[] args) {

		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();

		thread1.start();
		thread2.start();
	}
}
