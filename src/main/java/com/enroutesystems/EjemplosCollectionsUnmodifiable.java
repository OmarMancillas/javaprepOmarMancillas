package com.enroutesystems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosCollectionsUnmodifiable {
	public static void showUmodifiables() {
		log.info("------Unmodifiable List------");
		List<String> list = new ArrayList<>();
		list.add("Michael");
		list.add("Elton");
		list.add("Paul");
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		log.info(unmodifiableList.toString());
		try {
			log.info("Trying to modify list...");
			unmodifiableList.add("John");			
		}catch(Exception ex) {
			log.info("List is unmodifiable");
			log.info(unmodifiableList.toString());			
		}
		
		log.info("------Unmodifiable Set------");
		Set<String> set = new HashSet<>();
		set.add("White");
		set.add("Blue");
		set.add("Red");
		Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
		log.info(unmodifiableSet.toString());
		try {
			log.info("Trying to modify set...");
			unmodifiableSet.add("Black");			
		}catch(Exception ex) {
			log.info("Set is unmodifiable");
			log.info(unmodifiableSet.toString());			
		}
		
		log.info("------Unmodifiable Map------");
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "Monterrey");
		map.put(2, "Guadalajara");
		map.put(3, "CDMX");
		Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(map);
		log.info(map.toString());
		try {
			unmodifiableMap.put(4, "Nuevo Laredo");
		}catch(Exception ex) {
			log.info("Map is unmodifiable");
			log.info(map.toString());
		}		
	}

	public static void main(String[] args) {
		showUmodifiables();
	}
}
