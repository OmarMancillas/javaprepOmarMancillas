package com.enroutesystems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploCollectionsBinarySearch {
	public static void showBinarySearch() {
		List<String> list = new ArrayList<String>();
		list.add("Monterrey");
		list.add("Guadalajara");
		list.add("CDMX");
		list.sort(null);//Using sort method
		
		log.info(list.toString());
		int indexLst = Collections.binarySearch(list, "Monterrey");
		log.info("Index of Monterrey in sorted list: " + indexLst);
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("White");
		list2.add("Red");
		list2.add("Blue");
		list2.add("Green");
		list2.add("Yellow");

		list2.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		log.info(list2.toString());
		int indexList2 = Collections.binarySearch(list2, "Green");
		log.info("Index of Monterrey in sorted list: " + indexList2);
	}
	
	public static void main(String[] args) {
		showBinarySearch();
	}
}
