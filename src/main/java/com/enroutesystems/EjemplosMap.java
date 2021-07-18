package com.enroutesystems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosMap {

	public static void showMaps() {
		Map<Integer, String> colors = new HashMap<Integer, String>();
		colors.put(2, "red");
		colors.put(4, "blue");
		colors.put(1, "white");
		colors.put(5, "yellow");
		colors.put(3, "black");
		colors.put(6, "black");// Allows repeated values but not keys
		log.info("------HashMap------");
		log.info("It is order according to the keys: " + colors);

		// Replacing an element from the HashMap using .put or .replace
		colors.put(3, "green");// It replaces the element with key 3, if key does not exists then it is added
								// to the HashMap
		log.info("Replacing value of element with key=3, from black to green: " + colors);

		colors.replace(5, "pink");// It replaces the element with key 5, if key does not exists, then it return
									// null
		log.info("Replacing value of element with key=5, from yellow to pink: " + colors);

		Map<Integer, String> colors1 = new LinkedHashMap<Integer, String>();
		colors1.put(2, "red");
		colors1.put(4, "blue");
		colors1.put(1, "white");
		colors1.put(5, "yellow");
		colors1.put(3, "black");
		colors1.put(6, "black");// Allows repeated values but not keys

		log.info("------LinkedHashMap------");
		log.info("It maintains the same order as they were inserted: " + colors1);

		// Replacing an element from the LinkedHashMap using .put or .replace
		colors1.put(3, "green");// It replaces the element with key 3, if key does not exists then it is added
								// to the HashMap
		log.info("Replacing value of element with key=3, from black to green: " + colors1);

		colors1.replace(5, "pink");// It replaces the element with key 5, if key does not exists, then it return
									// null
		log.info("Replacing value of element with key=5, from yellow to pink: " + colors1);

		Map<Integer, String> colors2 = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				}
				return 0;
			}
		});

		colors2.put(2, "red");
		colors2.put(4, "blue");
		colors2.put(1, "white");
		colors2.put(5, "yellow");
		colors2.put(3, "black");
		colors2.put(6, "black");// Allows repeated values but not keys

		log.info("------TreeMap------");
		log.info("The order of the elements can be either by their natural order or by a custom order: " + colors2);

		// Replacing an element from the LinkedHashMap using .put or .replace
		colors2.put(3, "green");// It replaces the element with key 3, if key does not exists then it is added
								// to the HashMap
		log.info("Replacing value of element with key=3, from black to green: " + colors2);

		colors2.replace(5, "pink");// It replaces the element with key 5, if key does not exists, then it return
									// null
		log.info("Replacing value of element with key=5, from yellow to pink: " + colors2);

	}

	// MAPS STORE ELEMENTS CONTAINING A KEY AND VALUE...

	public static void main(String[] args) {
		showMaps();
	}

}
