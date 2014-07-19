package com.example.gl;

public class GL {
	
	static {
		System.loadLibrary("gl");
	}
	
	public native void log();

}
