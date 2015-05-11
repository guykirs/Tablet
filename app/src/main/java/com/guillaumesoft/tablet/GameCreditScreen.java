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

///  OCTOBER 23, 2014
///  GUILLAUME SWOLFS
///  GUILLAUMESOFT
///  THIS CLASS DRAWS THE GAME CREDIT SCREEN
public class GameCreditScreen extends GLScreen
{
    ////////////////////////////////////////
    // CLASS VARAIBLES
    ////////////////////////////////////////
    private SpriteBatcher batcher;
    private Camera2D guiCam;
    Vector2 touchPoint;
    Rectangle backBounds;

    public GameCreditScreen(Game game)
    {
        super(game);

        batcher    = new SpriteBatcher(glGraphics, 100);
        guiCam     = new Camera2D(glGraphics, 1920, 1080);

        touchPoint = new Vector2();
        backBounds = new Rectangle(290, 800, 300, 300);
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

           batcher.beginBatch(Assets.creditScreen);

              // SHOW THE CREDIT SCREEN TO THE USER
              batcher .drawSprite(guiCam.position.x,  guiCam.position.y, guiCam.frustumWidth, guiCam.frustumHeight, Assets.creditScreenRegion);

           batcher.endBatch();

        gl.glEnable(GL10.GL_BLEND);
        gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);

           batcher.beginBatch(Assets.items);

           // DRAW THE BUTTON TO THE SCREEN
           batcher.drawSprite(300, guiCam.frustumHeight / 2 + 300, 100, 100, Assets.buttonA);

        batcher.endBatch();

        gl.glDisable(GL10.GL_BLEND);

    }

    @Override
    public void pause() {   }

    @Override
    public void resume(){  }

    @Override
    public void dispose() {  }
}