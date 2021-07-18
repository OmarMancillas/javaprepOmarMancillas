package com.enroutesystems;

import org.junit.jupiter.api.Test;

public class EjemplosCollectionsSynchronizedTest {
	@Test
	public void test() {
		Thread thread1 = new ThreadColors();
		thread1.start();
		Thread thread2 = new ThreadColors();
		thread2.start();
	}

	public static class ThreadColors extends Thread {
		public void run() {
			EjemplosCollections.showCollections();
		}
	}
}
