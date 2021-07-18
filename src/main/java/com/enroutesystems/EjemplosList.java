package com.enroutesystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosList {
	public static void showLists() {
		log.info("------ArrayList------");
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("John");
		arrayList.add("Alex");
		arrayList.add("Mary");
		
		arrayList.forEach((e)->{
			log.info(e);
		});
		
		log.info("------Vector------");
		List<String> vector = new Vector<String>();
		vector.add("Blue");
		vector.add("Red");
		vector.add("Green");
		vector.forEach(e ->{
			log.info(e);
		});
		
		log.info("------LinkedList------");
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Monterrey");
		linkedList.add("Guadalajara");
		linkedList.add("CDMX");
		linkedList.forEach(e ->{
			log.info(e);
		});
		
	}
	
	public static void main(String[] args) {
		showLists();
	}
}
