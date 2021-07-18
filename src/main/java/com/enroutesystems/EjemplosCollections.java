package com.enroutesystems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosCollections {

	public static synchronized void showCollections() {
		List<String> colors = Collections.synchronizedList(Arrays.asList("white", "red", "blue", "green", "yellow"));//Using asList method
		
		Map<Integer, String> colors1 = new HashMap<Integer,String>();
		colors1.put(1, "white");
		colors1.put(2, "red");
		colors1.put(3, "blue");
		colors1.put(4, "green");
		colors1.put(6, "yellow");
		Map<Integer, String> synchronizedColor1Map = Collections.synchronizedMap(colors1);
		
		Set<String> colors2 = new HashSet<String>();
		colors2.add("white");
		colors2.add("red");
		colors2.add("blue");
		colors2.add("green");
		colors2.add("yellow");
		Set<String> synchronizedColors2 = Collections.synchronizedSet(colors2);

		synchronized (colors) {
			log.info("------COLORS------");
			colors.forEach(color -> {
				log.info(color);
			});
		}
		
		synchronized(synchronizedColor1Map){
			log.info("------synchronizedColor1Map------");
			synchronizedColor1Map.forEach((key,color)->{
				log.info("{}:{}",key,color);
			});
		}
		
		synchronized(synchronizedColors2){
			log.info("------synchronizedColors2------");
			synchronizedColors2.forEach(color->{
				log.info(color);
			});
		}
		
		
	}
	
	public static class ThreadColors extends Thread {
		public void run() {
			showCollections();
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new ThreadColors();
		thread1.start();
		Thread thread2 = new ThreadColors();
		thread2.start();
//		showCollections();
	}

}
