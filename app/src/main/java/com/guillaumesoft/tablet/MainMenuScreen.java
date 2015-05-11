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
// MainMenuScreen class
//////////////////////////////////////////////////////////////////
public class MainMenuScreen extends GLScreen
{
    /////////////////////////////////////////
    // CLASS VARAIBLES
    private SpriteBatcher batcher;
    private Camera2D guiCam;
    Vector2 touchPoint;
    Rectangle playBounds;
    Rectangle creditBounds;
    Rectangle optionBounds;
    Rectangle helpBounds;
    Rectangle exitBounds;

    /////////////////////////////////////////
    // CLASS CONSTRUCTOR
    /////////////////////////////////////////
    public MainMenuScreen(Game game)
    {
        super(game);

        batcher  = new SpriteBatcher(glGraphics, 100);
        guiCam   = new Camera2D(glGraphics, 1920, 1080);

        touchPoint = new Vector2();

        playBounds   = new Rectangle(1025, 600, 200, 200);
        creditBounds = new Rectangle(1025, 500, 200, 300);
        optionBounds = new Rectangle(1025, 400, 200, 200);
        helpBounds   = new Rectangle(1025, 300, 200, 200);
        exitBounds   = new Rectangle(1025, 150, 200, 200);
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
            if(OverlapTester.pointInRectangle(playBounds, touchPoint))
            {
                Assets.playSound(Assets.exitReached);

                //GamePauseScreen pauseScreen = new GamePauseScreen(game);
                //game.setScreen(pauseScreen);

                //GameOverScreen overScreen = new GameOverScreen(game);
                //game.setScreen(overScreen);

                return;
            }
            // DID THE USER PRESS THE CREDIT BUTTON
            if(OverlapTester.pointInRectangle(creditBounds, touchPoint))
            {

                Assets.playSound(Assets.exitReached);
                GameCreditScreen creditScreen = new GameCreditScreen(game);
                game.setScreen(creditScreen);
                return;
            }

            // DID THE USER PRESS THE OPTION BUTTON
            if(OverlapTester.pointInRectangle(optionBounds, touchPoint))
            {

                Assets.playSound(Assets.exitReached);

                return;
            }

            // DID THE USER PRESS THE HELP BUTTON
            if(OverlapTester.pointInRectangle(helpBounds, touchPoint))
            {

                Assets.playSound(Assets.exitReached);
                GameHelpScreen0 helpScreen = new GameHelpScreen0(game);
                game.setScreen(helpScreen);
                return;
            }

            // DID THE USER PRESS THE EXIT BUTTON
            if(OverlapTester.pointInRectangle(exitBounds, touchPoint))
            {

                Assets.playSound(Assets.exitReached);
                ScreenManager.game.finish();
                return;
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

           batcher.beginBatch(Assets.BlackFont);

             Assets.blackfont.drawText(batcher, "Platformer", 1920 / 2 - 300, 900, 45.0f, 45.0f);

           batcher.endBatch();

           batcher.beginBatch(Assets.RedFont);

              Assets.redfont.drawText(batcher, "Main Menu", 1920 / 2 - 100, 800, 25.0f, 25.0f);

                 //PLAY SCREEN SELECTED
                 Assets.redfont.drawText(batcher, "Play",    1920 /2, 700, 25.0f, 25.0f);
                 Assets.redfont.drawText(batcher, "Credit",  1920 /2, 600, 25.0f, 25.0f  );
                 Assets.redfont.drawText(batcher, "Options", 1920 /2, 500, 25.0f, 25.0f);
                 Assets.redfont.drawText(batcher, "Help",    1920 /2, 400, 25.0f, 25.0f);
                 Assets.redfont.drawText(batcher, "Exit",    1920 /2, 300, 25.0f, 25.0f );

              batcher.endBatch();

        gl.glDisable(GL10.GL_BLEND);
    }

    @Override
    public void pause()
    {
        game.getCurrentScreen();
    }

    @Override
    public void resume() {  }

    @Override
    public void dispose() { }
}


