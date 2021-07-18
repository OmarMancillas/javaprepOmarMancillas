package com.enroutesystems;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosCollectionsEmpty {
	public static void showCollectionsEmpty() {
		List<String> emptyList = Collections.emptyList();//List not modifiable
		try {
			emptyList.add("John");
		}catch(Exception ex) {
			log.info("Cannot modify empty list");
			log.info(emptyList.toString());
		}
		
		Set<String> emptySet = Collections.emptySet();//List not modifiable
		try {
			emptySet.add("Red");
		}catch(Exception ex) {
			log.info("Cannot modify empty set");
			log.info(emptySet.toString());
		}
		
		Map<Integer, String> emptyMap = Collections.emptyMap();//List not modifiable
		try {
			emptyMap.put(1, "Monterrey");
		}catch(Exception ex) {
			log.info("Cannot modify empty map");
			log.info(emptyMap.toString());
		}
	}
	
	public static void main(String[] args) {
		showCollectionsEmpty();
	}
}
