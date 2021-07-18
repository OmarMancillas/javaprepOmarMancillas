package com.enroutesystems;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemplosArrays {
	public static void showArrays() {
		String[] array = {"Monterrey", "Guadalajara", "CDMX"};
		log.info("Array before sorting: " + Arrays.asList(array));
		Arrays.sort(array);
		log.info("Array after sorting: " + Arrays.asList(array));
		log.info("Array before using fill method: " + Arrays.toString(array));
		Arrays.fill(array, "Nuevo Laredo");
		log.info("Array after using fill method: " + Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		showArrays();
	}
}
