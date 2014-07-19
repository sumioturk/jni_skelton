package com.example.gl;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class GLA extends Activity implements SurfaceHolder.Callback {
	 private static String TAG = "EglSample";

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        create();
	        
	        setContentView(R.layout.activity_main);
	        SurfaceView surfaceView = (SurfaceView)findViewById(R.id.surfaceview);
	        surfaceView.getHolder().addCallback(this);
	    }

	    @Override
	    protected void onResume() {
	        super.onResume();
	        resume();
	    }
	    
	    @Override
	    protected void onPause() {
	        super.onPause();
	        pause();
	    }

	    @Override
	    protected void onStop() {
	        super.onDestroy();
	        stop();
	    }

	    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
	    	set(holder.getSurface());
	    }

	    public void surfaceCreated(SurfaceHolder holder) {
	    }

	    public void surfaceDestroyed(SurfaceHolder holder) {
	    	set(null);
	    }


	    public static native void create();
	    public static native void resume();
	    public static native void pause();
	    public static native void stop();
	    public static native void set(Surface surface);

	    static {
	        System.loadLibrary("gl");
	    }
}
