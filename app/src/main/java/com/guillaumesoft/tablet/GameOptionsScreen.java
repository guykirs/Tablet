package com.guillaumesoft.tablet;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Input;
import com.badlogic.androidgames.framework.gl.Camera2D;
import com.badlogic.androidgames.framework.gl.SpriteBatcher;
import com.badlogic.androidgames.framework.impl.GLScreen;
import com.badlogic.androidgames.framework.math.OverlapTester;
import com.badlogic.androidgames.framework.math.Rectangle;
import com.badlogic.androidgames.framework.math.Vector2;

import java.util.List;

import javax.microedition.khronos.opengles.GL10;

//////////////////////////////////////////////////////////////////
// june 25 2014
// Guillaume Swolfs
// guillaumesoft
// RatingSplashScreen class
//////////////////////////////////////////////////////////////////
public class GameOptionsScreen extends GLScreen
{
    /////////////////////////////////////////
    // CLASS VARAIBLES
    /////////////////////////////////////////

    private SpriteBatcher batcher;
    private float scale;
    private Camera2D guiCam;
    Vector2 touchPoint;
    Rectangle backBounds;

    /////////////////////////////////////////
    // CLASS CONSTRUCTOR
    /////////////////////////////////////////
    public GameOptionsScreen(Game game)
    {
        super(game);

        guiCam   = new Camera2D(glGraphics, 1920, 1080);
        batcher  = new SpriteBatcher(glGraphics, 100);
        backBounds = new Rectangle(200,  1080 /2 + 200, 200, 200);
        touchPoint = new Vector2();
    }

    @Override
    public void update(float deltaTime)
    {
        List<Input.TouchEvent> touchEvents = game.getInput().getTouchEvents();
        int len = touchEvents.size();

        for(int i = 0; i < len; i++)
        {
            Input.TouchEvent event = touchEvents.get(i);
            if (event.type != Input.TouchEvent.TOUCH_UP)
                continue;

            touchPoint.set(event.x, event.y);
            guiCam.touchToWorld(touchPoint);

            // DID THE USER PRESS THE PLAY BUTTON
            if (OverlapTester.pointInRectangle(backBounds, touchPoint))
            {
                MainMenuScreen mainmenu = new MainMenuScreen(game);
                game.setScreen(mainmenu);
            }
        }
    }


    @Override
    public void present(float deltaTime)
    {
        GL10 gl = glGraphics.getGL();
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        guiCam.setViewportAndMatrices();

        gl.glEnable(GL10.GL_TEXTURE_2D);

           batcher.beginBatch(Assets.background);

              // SHOW THE RATING SCREEN
              batcher.drawSprite(guiCam.position.x, guiCam.position.y, 1920, 1080, Assets.backgroundRegion);

           batcher.endBatch();

        gl.glEnable(GL10.GL_BLEND);
        gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);

        batcher.beginBatch(Assets.RedFont);

           Assets.redfont.drawText(batcher, "Options", 1920 / 2 - 100, 600, 25.0f, 25.0f);

             /* switch(ScreenManager.menu)
              {
                  case 0:
                      if(Settings.soundEnabled)
                          Assets.redfont.drawText(batcher, "Sound On", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2 - 50,  25.0f * scale, 25.0f * scale );
                      else
                          Assets.redfont.drawText(batcher, "Sound Off", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2 - 50,  25.0f * scale, 25.0f * scale );

                      //SHOW THE MESSAGE TEXT
                      if(Settings.musicEnabled)
                          Assets.redfont.drawText(batcher, "Music On", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2, 25.0f, 25.0f);
                      else
                          Assets.redfont.drawText(batcher, "Music Off", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2, 25.0f, 25.0f);

                      break;
                  case 1:
                      if(Settings.soundEnabled)
                          Assets.redfont.drawText(batcher, "Sound On", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2 - 50,  25.0f, 25.0f);
                      else
                          Assets.redfont.drawText(batcher, "Sound Off", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2 - 50,  25.0f, 25.0f);

                      if(Settings.musicEnabled)
                          Assets.redfont.drawText(batcher, "Music On", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2, 25.0f * scale, 25.0f * scale);
                      else
                          Assets.redfont.drawText(batcher, "Music Off", ScreenManager.WORLD_WIDTH /2 - 80, ScreenManager.WORLD_HEIGHT /2, 25.0f * scale, 25.0f * scale);
                      break;
              }

           batcher.endBatch();
*/
        batcher.beginBatch(Assets.BlackFont);

           Assets.blackfont.drawText(batcher, "Press DPAD LEFT to " + "change selection.", 1920 /2 - 500, 1080 / 2 - 400, 35.0f, 35.0f);

        batcher.endBatch();

        gl.glEnable(GL10.GL_BLEND);
        gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);

           batcher.beginBatch(Assets.items);

              batcher.drawSprite( 300,  guiCam.frustumHeight /2 + 300, 100, 100, Assets.buttonA);

           batcher.endBatch();

        gl.glDisable(GL10.GL_BLEND);

    }

    @Override
    public void pause(){  }

    @Override
    public void resume() { }

    @Override
    public void dispose() {  }
}


