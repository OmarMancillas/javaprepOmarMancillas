package com.enroutesystems;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EjemploNativeTest {
	@BeforeTestClass
    public static void setUpClass() {
        // .. load other dependent libraries  
        System.loadLibrary("nativedatetimeutils");
    }

    @Test
    public void givenNativeLibsLoaded_thenNativeMethodIsAccessible() {
        EjemploNative ejemploNative = new EjemploNative();
        log.info("System time is : " + ejemploNative.getSystemTime());
//        assertNotNull(ejemploNative.getSystemTime());
    }
}
