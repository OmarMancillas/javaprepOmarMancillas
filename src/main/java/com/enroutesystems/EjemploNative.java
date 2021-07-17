package com.enroutesystems;

public class EjemploNative {
	public native String getSystemTime();

    static {
        System.loadLibrary("nativedatetimeutils");
    }
}
