package com.example.airhockey;
import android.opengl.GLSurfaceView;
import android.util.TextResourceReader;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;

import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glViewport;


public class AirHockeyRenderer implements GLSurfaceView.Renderer {

    private static final int POSITION_COMPONENT_COUNT = 2;
    private final Context context;

    public AirHockeyRenderer(Context context){
        this.context = context;
    }

    @Override
    public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
        glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        String vertexShaderSource = TextResourceReader.readTextFileResource(context, R.raw.simple_fragment_shader);
        String fragmentShaderSource = TextResourceReader.readTextFileResource(context, R.raw.simple_fragment_shader);
    }

    @Override
    public void onSurfaceChanged(GL10 glUnused, int width, int height) {
        glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 glUnused) {
        glClear(GL_COLOR_BUFFER_BIT);
    }

}
