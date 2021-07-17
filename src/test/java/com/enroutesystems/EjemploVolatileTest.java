package com.enroutesystems;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploVolatileTest {
	
	private static String string1 = "Java"; //Only available to members of the same class
    protected static String string2 = ""; //Only available to classe of the same package, or to subclasses...
    private static boolean ready;
    
	protected static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            log.info(string1 + " " + string2);
        }
    }
	
	@Test
	public void test() {
		Thread thread1 = new Reader();
		thread1.start();
        string2 = "Rocks";
        ready = true;
	}
}
