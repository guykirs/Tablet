package com.guillaumesoft.tablet;

import android.content.Intent;
import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Input;
import com.badlogic.androidgames.framework.gl.Camera2D;
import com.badlogic.androidgames.framework.gl.SpriteBatcher;
import com.badlogic.androidgames.framework.impl.GLScreen;
import com.badlogic.androidgames.framework.math.Vector2;

import java.util.List;

import javax.microedition.khronos.opengles.GL10;


//////////////////////////////////////////////////////////////////
// April 28 2015
// Guillaume Swolfs
// guillaumesoft
// GameFailScreen class
//////////////////////////////////////////////////////////////////
public class GameFailScreen extends GLScreen
{
    /////////////////////////////////////////
    // CLASS VARAIBLES
    /////////////////////////////////////////

    private Camera2D guiCam;
    private SpriteBatcher batcher;
    Vector2 touchPoint;


    /////////////////////////////////////////
    // CLASS CONSTRUCTOR
    /////////////////////////////////////////
    public GameFailScreen(Game game)
    {
        super(game);

        guiCam   = new Camera2D(glGraphics, 1920, 1080);
        batcher  = new SpriteBatcher(glGraphics, 100);

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
              batcher.drawSprite(guiCam.position.x, guiCam.position.y, guiCam.frustumWidth, guiCam.frustumHeight, Assets.backgroundRegion);

           batcher.endBatch();

        gl.glEnable(GL10.GL_BLEND);
        gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);

           batcher.beginBatch(Assets.RedFont);

         /*  switch(ScreenManager.STATE)
           {
               case ScreenManager.GAME_OVER:
                   ////////////////////////////////////////////////////////////////////////
                   // GAME OVER SCREEN
                   Assets.redfont.drawText(batcher, "Well done,  Game Over", ScreenManager.size.x / 2 - 100, 600, 25.0f, 25.0f);
                   break;
               case ScreenManager.GAME_FAILSCREEN:
                   ////////////////////////////////////////////////////////////////////////
                   // GAME OVER SCREEN PLAYER LOST
                   Assets.redfont.drawText(batcher, "You lost!", ScreenManager.size.x / 2 - 100, 600, 25.0f, 25.0f);
                   break;
               case ScreenManager.GAME_DEMO:
                   ////////////////////////////////////////////////////////////////////////
                   // GAME OVER SCREEN PLAYER LOST
                   Assets.redfont.drawText(batcher, "Thank you for playing the demo", ScreenManager.size.x / 2 - 300, 600, 25.0f, 25.0f);
                   break;
           }

           switch(ScreenManager.menu)
           {
               case 0:
                   //SHOW THE MESSAGE TEXT
                   Assets.redfont.drawText(batcher, "Play Again", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 50, 25.0f * scale, 25.0f * scale);
                   Assets.redfont.drawText(batcher, "Exit", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 100,  25.0f, 25.0f);

                   if(ScreenManager.isDemo)
                   {
                       Assets.redfont.drawText(batcher, "Buy Full Game", ScreenManager.size.x / 2 - 80, ScreenManager.size.y / 2 - 150, 25.0f, 25.0f);
                   }

                   break;
               case 1:
                   Assets.redfont.drawText(batcher, "Play Again", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 50, 25.0f, 25.0f);
                   Assets.redfont.drawText(batcher, "Exit", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 100,  25.0f * scale, 25.0f * scale );

                   if(ScreenManager.isDemo)
                   {
                       Assets.redfont.drawText(batcher, "Buy Full Game", ScreenManager.size.x / 2 - 80, ScreenManager.size.y / 2 - 150, 25.0f, 25.0f);
                   }
                   break;
               case 2:
                   Assets.redfont.drawText(batcher, "Play Again", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 50, 25.0f, 25.0f);
                   Assets.redfont.drawText(batcher, "Exit", ScreenManager.size.x /2 - 80, ScreenManager.size.y /2 - 100,  25.0f * scale, 25.0f * scale );

                   if(ScreenManager.isDemo)
                   {
                       Assets.redfont.drawText(batcher, "Buy Full Game", ScreenManager.size.x / 2 - 80, ScreenManager.size.y / 2 - 150, 25.0f, 25.0f);
                   }
                   break;
           }*/

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
