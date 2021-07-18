package com.enroutesystems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosSet {

	public static void showSets() {
		// HashSet
		HashSet<String> colors = new HashSet<>();
		colors.add("white");
		colors.add("red");
		colors.add("black");
		colors.add("blue");
		colors.add("yellow");
		colors.add("white"); // HashSet does not add repeated elements...
		colors.add(null);// It accepts null values

		log.info("------HashSet------");
		log.info(colors.toString());
		log.info("Is empty? " + colors.isEmpty());// Checks if HashSet is empty
		log.info("Contains black? " + colors.contains("black"));// Checks if HashSet contains specified element
		log.info("Removed element yellow? " + colors.remove("yellow"));// Removes specified element

		colors.forEach((color) -> {
			log.info(color);
		});// [red, white, blue, black, yellow] Internally, the elements are ordered based
			// on their hash code

		// TreeSet
		TreeSet<String> colors2 = new TreeSet<>();
		colors2.add("white");
		colors2.add("red");
		colors2.add("black");
		colors2.add("blue");
		colors2.add("yellow");
		colors2.add("white");// Reapeted elements do not get added
//				colors2.add(null); TreeSet does not allow null values 

		log.info("------TreeSet------");
		log.info("It maintains a natural order of the elements: " + colors2.toString());
		log.info("Removed first element: " + colors2.pollFirst());
		log.info("Removed last element: " + colors2.pollLast());
		colors2.forEach((color) -> {
			log.info(color);
		});// [black, blue, red, white, yellow] The elements are ordered based on their
			// natural order, in this case by alphabetical order

		// LinkedHashSet
		LinkedHashSet<String> colors3 = new LinkedHashSet<>();
		colors3.add("white");
		colors3.add("red");
		colors3.add("black");
		colors3.add("blue");
		colors3.add("yellow");
		colors3.add(null);
		colors3.add("white");// Repeated elements do not get added

		log.info("------LinkedHashSet------");
		log.info("Order is maintained in the LinkedHashSet: " + colors3);
		log.info("Removed null from collection? " + colors3.remove(null));
		colors3.forEach((color) -> {
			log.info(color);
		});
	}

	public static void main(String[] args) {
		showSets();
	}

}
