package com.guillaumesoft.tablet;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Input;
import com.badlogic.androidgames.framework.gl.Camera2D;
import com.badlogic.androidgames.framework.gl.SpriteBatcher;
import com.badlogic.androidgames.framework.impl.GLScreen;
import com.badlogic.androidgames.framework.math.Rectangle;
import com.badlogic.androidgames.framework.math.Vector2;

import java.util.List;

import javax.microedition.khronos.opengles.GL10;

//////////////////////////////////////////////////////////////////
// April 28 2015
// Guillaume Swolfs
// guillaumesoft
// GamePauseScreen class
//////////////////////////////////////////////////////////////////
public class GamePauseScreen extends GLScreen
{
    /////////////////////////////////////////
    // CLASS VARAIBLES
    /////////////////////////////////////////

    private Camera2D guiCam;
    private SpriteBatcher batcher;

    Vector2 touchPoint;
    Rectangle playBounds;
    Rectangle exitBounds;

    /////////////////////////////////////////
    // CLASS CONSTRUCTOR
    /////////////////////////////////////////
    public GamePauseScreen(Game game)
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

        /*if ((ScreenManager.currentInput.getButton(OuyaController.BUTTON_O)|| ScreenManager.currentInput.getButton(OuyaController.BUTTON_A)||
                ScreenManager.currentInput.getButton(OuyaController.BUTTON_Y)|| ScreenManager.currentInput.getButton(OuyaController.BUTTON_U)))
        {
            switch (ScreenManager.menu)
            {
                case 0:
                    ScreenManager.STATE = ScreenManager.GAME_RUNNING;
                    game.setScreen(ScreenManager.playScreen);
                    break;
                case 1:
                    // EXIT SCREEN
                    ScreenManager.game.finish();
                    game.setScreen(ScreenManager.menuScreen);
                    break;
            }
        }*/

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

           Assets.redfont.drawText(batcher, "Pause", guiCam.frustumWidth / 2 - 100, 600, 25.0f, 25.0f);

           //SHOW THE MESSAGE TEXT
           Assets.redfont.drawText(batcher, "Play", guiCam.frustumWidth /2 - 80, guiCam.frustumHeight /2, 25.0f, 25.0f);
           Assets.redfont.drawText(batcher, "Exit", guiCam.frustumWidth /2 - 80, guiCam.frustumHeight /2 - 50,  25.0f, 25.0f);

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
