package com.guillaumesoft.tablet;

import com.badlogic.androidgames.framework.GameObject;
import com.badlogic.androidgames.framework.gl.Animation;
import com.badlogic.androidgames.framework.gl.SpriteBatcher;
import com.badlogic.androidgames.framework.gl.TextureRegion;

/// <summary>
///  THIS CLASS DRAWS THE SILVER COIN TO THE SCREEN
///  THIS PROVIDE THE PLAY POINTS AND HEALTH
///  APRIL 18, 2014
///  GUILLAUME SWOLFS
///  GUILLAUMESOFT
/// </summary>
class SilverCoins extends GameObject
{
    /////////////////////////////////////////////////////////////
    // CLASS VARAIBLES
    public static float COIN_WIDTH  = 40.0f;
    public static float COIN_HEIGHT = 42.0f;
    public final int    PointValue  = 15;
    float stateTime;

    /// <summary>
    /// Constructs a new gem.
    /// </summary>
    public SilverCoins(float x, float y)
    {
        super(x, y, COIN_WIDTH, COIN_HEIGHT);
    }

    public void Update(float deltaTime)
    {
        stateTime += deltaTime;
    }

    /// <summary>
    /// Draws a gem in the appropriate color.
    /// </summary>
    public void Draw( SpriteBatcher batcher)
    {
        TextureRegion keyFrame;
        keyFrame = Assets.silverCoins.getKeyFrame(stateTime, Animation.ANIMATION_LOOPING);

        batcher.beginBatch(Assets.items);

           batcher.drawSprite(position.x, position.y, COIN_WIDTH, COIN_HEIGHT, keyFrame);

        batcher.endBatch();
    }
}