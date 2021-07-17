package com.enroutesystems;



import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploVolatile {
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
		
	public static void main(String[] args) {
		Thread thread1 = new Reader();
		thread1.start();
        string2 = "Rocks";
        ready = true;
	}
}
