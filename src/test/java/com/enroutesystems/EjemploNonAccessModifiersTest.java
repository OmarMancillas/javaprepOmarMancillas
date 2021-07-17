package com.enroutesystems;

import org.junit.jupiter.api.Test;

import com.enroutesystems.EjemploNonAccessModifiers.Thread1;
import com.enroutesystems.EjemploNonAccessModifiers.Thread2;


public class EjemploNonAccessModifiersTest {
	@Test
	public void test() {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();

		thread1.start();
		thread2.start();
	}
}
