package com.example.gl;

public class Util {
	
	static {
		System.loadLibrary("gl");
	}
	
	public native void log();

}
