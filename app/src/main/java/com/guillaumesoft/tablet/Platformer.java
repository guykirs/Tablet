package com.guillaumesoft.tablet;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.impl.GLGame;


public class Platformer extends GLGame
{
    /////////////////////////////////////////////////////////////////////////
    // CLASS VARAIBLES
    boolean firstTimeCreate = true;
    private static final String LOG_TAG = "Platformer";

    // CLASS FUNCTION
    @Override
    public Screen getStartScreen()
    {
        return new GameRatingScreen(this);
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        super.onSurfaceCreated(gl, config);

        if(firstTimeCreate)
        {
            Settings.load(getFileIO());
            Assets.load(this);
            ScreenManager.game = this;
            firstTimeCreate = false;

            // CREATE A STATIC CONTEXT FOR THE GAME
            //ScreenManager.context = this;

           // WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
           // ScreenManager.display = wm.getDefaultDisplay();

            //ScreenManager.size = new Point();
            //ScreenManager.display.getSize(ScreenManager.size);

            // Point size = new Point();
            // display.getSize(size);

            // ScreenManager.WORLD_WIDTH = size.x;
            // ScreenManager.WORLD_HEIGHT = size.y;
        }
        else
        {
            Assets.reload();
        }
    }

    @Override
    public void onPause()
    {
        super.onPause();

        if(Settings.soundEnabled)
            Assets.music.pause();
    }

    @Override
    public void onResume()
    {
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

}