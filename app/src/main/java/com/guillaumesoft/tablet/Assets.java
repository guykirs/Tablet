package com.guillaumesoft.tablet;

import com.badlogic.androidgames.framework.Music;
import com.badlogic.androidgames.framework.Sound;
import com.badlogic.androidgames.framework.gl.Animation;
import com.badlogic.androidgames.framework.gl.Font;
import com.badlogic.androidgames.framework.gl.Texture;
import com.badlogic.androidgames.framework.gl.TextureRegion;
import com.badlogic.androidgames.framework.impl.GLGame;

///  THIS CLASS SETS THE ASSETS FOR THE GAME
///  JUNE 23, 2014
///  GUILLAUME SWOLFS
///  GUILLAUMESOFT
public class Assets
{
    public static Texture layer00;
    public static TextureRegion layer00Region;

    public static Texture layer10;
    public static TextureRegion layer10Region;

    public static Texture layer20;
    public static TextureRegion layer20Region;

    public static Texture layer01;
    public static TextureRegion layer01Region;

    public static Texture layer11;
    public static TextureRegion layer11Region;

    public static Texture layer21;
    public static TextureRegion layer21Region;

    public static Texture layer02;
    public static TextureRegion layer02Region;

    public static Texture layer12;
    public static TextureRegion layer12Region;

    public static Texture layer22;
    public static TextureRegion layer22Region;

    public static Texture layer03;
    public static TextureRegion layer03Region;

    public static Texture layer13;
    public static TextureRegion layer13Region;

    public static Texture layer23;
    public static TextureRegion layer23Region;

    public static Texture layer04;
    public static TextureRegion layer04Region;

    public static Texture layer14;
    public static TextureRegion layer14Region;

    public static Texture layer24;
    public static TextureRegion layer24Region;

    public static Texture layer05;
    public static TextureRegion layer05Region;

    public static Texture layer15;
    public static TextureRegion layer15Region;

    public static Texture layer25;
    public static TextureRegion layer25Region;

    public static Texture layer06;
    public static TextureRegion layer06Region;

    public static Texture layer16;
    public static TextureRegion layer16Region;

    public static Texture layer26;
    public static TextureRegion layer26Region;

    public static Texture layer07;
    public static TextureRegion layer07Region;

    public static Texture layer17;
    public static TextureRegion layer17Region;

    public static Texture layer27;
    public static TextureRegion layer27Region;

    public static Texture layer08;
    public static TextureRegion layer08Region;

    public static Texture layer18;
    public static TextureRegion layer18Region;

    public static Texture layer28;
    public static TextureRegion layer28Region;

    public static Texture layer09;
    public static TextureRegion layer09Region;

    public static Texture layer19;
    public static TextureRegion layer19Region;

    public static Texture layer29;
    public static TextureRegion layer29Region;

    // HELP SCREEN
    public static Texture helpscreen;
    public static TextureRegion helpscreenRegion;

    public static Texture loadingscreen;
    public static TextureRegion loadingscreenRegion;

    // COMPANY SCREEN
    public static Texture companyscreen;
    public static TextureRegion companyscreenRegion;

    // RATING SCREEN
    public static Texture esrbm;
    public static TextureRegion esrbmRegion;

    // CREDIT SCREEN
    public static Texture creditScreen;
    public static TextureRegion creditScreenRegion;

    // GAME BACKGROUND
    public static Texture background;
    public static TextureRegion backgroundRegion;

    //MONSTER ANIMATION
    public static Texture monsterA;
    public static Animation monsterIdleA;
    public static Animation monsterRunA;
    public static Animation monsterWaitA;

    public static Texture monsterB;
    public static Animation monsterWaitB;
    public static Animation monsterIdleB;
    public static Animation monsterRunB;

    public static Texture monsterC;
    public static Animation monsterWaitC;
    public static Animation monsterIdleC;
    public static Animation monsterRunC;

    // ANIMATED PLAYER
    public static Texture player;
    public static Animation playerWalk;
    public static Animation playerJump;
    public static Animation playerKilled;
    public static Animation playerIdle;
    public static Animation playerCelebrate;
    public static Animation playerAttack;

    // GAME OBJECT ANIMATION
    public static Texture   objectsAnimation;
    public static Animation torch;
    public static Animation animationBarrel;
    public static Animation animationChest;
    public static Animation animationBox;
    public static Animation fireball;
    public static Animation fire;
    public static Animation powerPickup;
    public static Animation fireballPickup;

    // FONT COLLORS
    public static Texture BlackFont;
    public static Font blackfont;

    public static Texture RedFont;
    public static Font redfont;

    public static Texture BlueFont;
    public static Font bluefont;

    // GAME ITEMS
    public static Texture items;
    public static TextureRegion buttonO;
    public static TextureRegion buttonU;
    public static TextureRegion buttonY;
    public static TextureRegion buttonA;
    public static TextureRegion greenHealthRegion;
    public static TextureRegion redHealthRegion;
    public static TextureRegion blackHealthRegion;
    public static TextureRegion ready;
    public static TextureRegion pauseMenu;
    public static TextureRegion gameOver;
    public static TextureRegion bullits;
    public static Animation goldCoins;
    public static Animation silverCoins;
    public static Animation bronzeCoins;

    // GAME OBJECTS
    public static Texture objects;
    public static TextureRegion stars;
    public static TextureRegion pickupstars;
    public static TextureRegion barrel;
    public static TextureRegion armour;
    public static TextureRegion axe;
    public static TextureRegion food;
    public static TextureRegion bowl;
    public static TextureRegion bullskull;
    public static TextureRegion skull;
    public static TextureRegion dragon;
    public static TextureRegion spear;
    public static TextureRegion chestA;
    public static TextureRegion chestB;

    // GAME STATE DIALOG
    public static Texture messages;
    public static TextureRegion diedRegion;
    public static TextureRegion loseRegion;
    public static TextureRegion winRegion;

    // GAME TILES
    public static Texture tile;
    public static TextureRegion BlockARegion;
    public static TextureRegion BlockBRegion;
    public static TextureRegion BlockCRegion;
    public static TextureRegion BlockDRegion;
    public static TextureRegion BlockERegion;
    public static TextureRegion BlockFRegion;
    public static TextureRegion BlockGRegion;
    public static TextureRegion BlockHRegion;
    public static TextureRegion BlockIRegion;
    public static TextureRegion ExitRegion;
    public static TextureRegion PlateformRegion;
    public static TextureRegion ladder;
    public static TextureRegion gemRegion;
    public static TextureRegion gunarm;
    public static TextureRegion healthbar;

    public static Texture gameobjects;
    public static TextureRegion healthBar;

    public static Music music;
    public static Sound exitReached;
    public static Sound gemCollected;
    public static Sound monsterkilled;
    public static Sound playerfall;
    public static Sound playerjump;
    public static Sound powerup;
    public static Sound playerKilledSound;
    public static Music drum;

    public static void load(GLGame game)
    {
        objects     = new Texture(game, "objects.png");
        stars       = new TextureRegion(objects , 0, 0, 64, 64);

        pickupstars = new TextureRegion(objects , 64, 0, 64, 64);
        barrel      = new TextureRegion(objects , 128, 0, 64, 64);
        armour      = new TextureRegion(objects , 192, 0, 64, 64);
        axe         = new TextureRegion(objects , 256, 0, 64, 64);
        food        = new TextureRegion(objects , 320, 0, 64, 64);

        bowl        = new TextureRegion(objects ,   0, 64, 64, 64);

        bullskull  = new TextureRegion(objects ,  64, 64, 64, 64);
        skull      = new TextureRegion(objects , 128, 64, 64, 64);
        dragon     = new TextureRegion(objects , 192, 64, 64, 64);
        spear      = new TextureRegion(objects , 260, 64, 64, 64);
        chestA     = new TextureRegion(objects , 320, 64, 64, 64);
        chestB     = new TextureRegion(objects , 384, 64, 64, 64);

        //////////////////////////////////////////////////////////////////////////
        // BACKGROUNDS

        layer00 = new Texture(game, "layer00.png");
        layer00Region = new TextureRegion(layer00 , 0, 0, 512, 512);

        layer10 = new Texture(game, "layer10.png");
        layer10Region = new TextureRegion(layer10 , 0, 0, 512, 512);

        layer20 = new Texture(game, "layer20.png");
        layer20Region  = new TextureRegion(layer20 , 0, 0, 512, 512);

        layer01       = new Texture(game, "layer01.png");
        layer01Region = new TextureRegion(layer01, 0, 0, 512, 512);

        layer11       = new Texture(game, "layer11.png");
        layer11Region = new TextureRegion(layer11, 0, 0, 512, 512);

        layer21       = new Texture(game, "layer21.png");
        layer21Region = new TextureRegion(layer21, 0, 0, 512, 512);

        layer02       = new Texture(game, "layer02.png");
        layer02Region = new TextureRegion(layer02, 0, 0, 512, 512);

        layer12       = new Texture(game, "layer12.png");
        layer12Region = new TextureRegion(layer12, 0, 0, 512, 512);

        layer22       = new Texture(game, "layer22.png");
        layer22Region = new TextureRegion(layer22, 0, 0, 512, 512);

        layer03       = new Texture(game, "layer03.png");
        layer03Region = new TextureRegion(layer03, 0, 0, 512, 512);

        layer13       = new Texture(game, "layer13.png");
        layer13Region = new TextureRegion(layer13, 0, 0, 512, 512);

        layer23       = new Texture(game, "layer23.png");
        layer23Region = new TextureRegion(layer23, 0, 0, 512, 512);

        layer03       = new Texture(game, "layer03.png");
        layer03Region = new TextureRegion(layer03, 0, 0, 512, 512);

        layer13       = new Texture(game, "layer13.png");
        layer13Region = new TextureRegion(layer13, 0, 0, 512, 512);

        layer23       = new Texture(game, "layer23.png");
        layer23Region = new TextureRegion(layer23, 0, 0, 512, 512);

        layer04       = new Texture(game, "layer04.png");
        layer04Region = new TextureRegion(layer04, 0, 0, 512, 512);

        layer14       = new Texture(game, "layer14.png");
        layer14Region = new TextureRegion(layer14, 0, 0, 512, 512);

        layer24       = new Texture(game, "layer24.png");
        layer24Region = new TextureRegion(layer24, 0, 0, 512, 512);

        layer05       = new Texture(game, "layer05.png");
        layer05Region = new TextureRegion(layer05, 0, 0, 512, 512);

        layer15       = new Texture(game, "layer15.png");
        layer15Region = new TextureRegion(layer15, 0, 0, 512, 512);

        layer25       = new Texture(game, "layer25.png");
        layer25Region = new TextureRegion(layer25, 0, 0, 512, 512);

        layer06       = new Texture(game, "layer06.png");
        layer06Region = new TextureRegion(layer06, 0, 0, 512, 512);

        layer16       = new Texture(game, "layer16.png");
        layer16Region = new TextureRegion(layer16, 0, 0, 512, 512);

        layer26       = new Texture(game, "layer26.png");
        layer26Region = new TextureRegion(layer26, 0, 0, 512, 512);

        layer07       = new Texture(game, "layer07.png");
        layer07Region = new TextureRegion(layer07, 0, 0, 512, 512);

        layer17       = new Texture(game, "layer17.png");
        layer17Region = new TextureRegion(layer17, 0, 0, 512, 512);

        layer27       = new Texture(game, "layer27.png");
        layer27Region = new TextureRegion(layer27, 0, 0, 512, 512);

        layer08       = new Texture(game, "layer08.png");
        layer07Region = new TextureRegion(layer08, 0, 0, 512, 512);

        layer18       = new Texture(game, "layer18.png");
        layer18Region = new TextureRegion(layer18, 0, 0, 512, 512);

        layer28       = new Texture(game, "layer28.png");
        layer28Region = new TextureRegion(layer28, 0, 0, 512, 512);

        layer09       = new Texture(game, "layer09.png");
        layer09Region = new TextureRegion(layer09, 0, 0, 512, 512);

        layer19       = new Texture(game, "layer19.png");
        layer19Region = new TextureRegion(layer19, 0, 0, 512, 512);

        layer29       = new Texture(game, "layer29.png");
        layer29Region = new TextureRegion(layer29, 0, 0, 512, 512);

        ////////////////////////////////////////////////////////////////////////////////////////////

        gameobjects          = new Texture(game, "gameobjects.png");
        healthBar            = new TextureRegion(gameobjects, 0, 0, 32, 128);

        helpscreen           = new Texture(game, "help.png");
        helpscreenRegion     = new TextureRegion(helpscreen , 0, 0, 512, 512);

        loadingscreen        = new Texture(game, "loadingscreen.png");
        loadingscreenRegion  = new TextureRegion(loadingscreen , 0, 0, 512, 512);

        companyscreen        = new Texture(game, "company.png");
        companyscreenRegion  = new TextureRegion(companyscreen , 0, 0, 512, 512);

        esrbm                = new Texture(game, "esrbm.png");
        esrbmRegion          = new TextureRegion(esrbm , 0, 0, 512, 512);

        creditScreen         = new Texture(game, "creditScreen.png");
        creditScreenRegion   = new TextureRegion(creditScreen , 0, 0, 512, 512);

        background           = new Texture(game, "gamescreen.png");
        backgroundRegion     = new TextureRegion(background, 0, 0, 512, 512);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // FONTS

        BlackFont = new Texture(game, "blackFont.png");
        blackfont = new Font(BlackFont, 224, 0, 16, 16, 20);

        RedFont = new Texture(game, "redFont.png");
        redfont = new Font(RedFont, 224, 0, 16, 16, 20);

        BlueFont  = new Texture(game, "blueFont.png");
        bluefont  = new Font(BlueFont, 224, 0, 16, 16, 20);

        ////////////////////////////////////////////////////////////////////////////////////////////

        items     = new Texture(game, "items.png");
        gameOver  = new TextureRegion(items, 352, 256, 160, 96);
        buttonO   = new TextureRegion(items,   0, 0, 64, 64);
        buttonU   = new TextureRegion(items,  64, 0, 64, 64);
        buttonY   = new TextureRegion(items, 128, 0, 64, 64);
        buttonA   = new TextureRegion(items, 192, 0, 64, 64);

        blackHealthRegion = new TextureRegion(items, 0,  64, 128, 52);
        redHealthRegion   = new TextureRegion(items, 0, 138, 128, 32);
        greenHealthRegion = new TextureRegion(items, 0, 112, 128, 32);

        ready     = new TextureRegion(items, 320, 224, 192, 32);
        pauseMenu = new TextureRegion(items, 224, 128, 192, 96);
        bullits   = new TextureRegion(items, 0, 0, 32, 32);

        goldCoins = new Animation(0.2f, new TextureRegion(items, 0, 480, 32, 32), new TextureRegion(items, 32, 480, 32, 32), new TextureRegion(items, 64, 480, 32, 32),
                new TextureRegion(items, 96, 480, 32, 32), new TextureRegion(items, 128, 480, 32, 32), new TextureRegion(items, 160, 480, 32, 32), new TextureRegion(items, 192, 480, 32, 32),
                new TextureRegion(items, 224, 480, 32, 32));

        silverCoins = new Animation(0.2f, new TextureRegion(items, 0, 440, 32, 32), new TextureRegion(items, 32, 440, 32, 32), new TextureRegion(items, 64, 440, 32, 32),
                new TextureRegion(items, 96, 440, 32, 32), new TextureRegion(items, 128, 440, 32, 32), new TextureRegion(items, 160, 440, 32, 32), new TextureRegion(items, 192, 440, 32, 32),
                new TextureRegion(items, 224, 440, 32, 32));

        bronzeCoins = new Animation(0.2f, new TextureRegion(items, 0, 400, 32, 32), new TextureRegion(items, 32, 400, 32, 32), new TextureRegion(items, 64, 400, 32, 32),
                new TextureRegion(items, 96, 400, 32, 32), new TextureRegion(items, 128, 400, 32, 32), new TextureRegion(items, 160, 400, 32, 32), new TextureRegion(items, 192, 400, 32, 32),
                new TextureRegion(items, 224, 400, 32, 32));

        monsterA = new Texture(game, "monstera.png");
        monsterWaitA = new Animation(0.2f, new TextureRegion(monsterA, 0, 0, 64, 64), new TextureRegion(monsterA, 64, 0, 64, 64), new TextureRegion(monsterA, 128, 0, 64, 64),
                new TextureRegion(monsterA, 192, 0, 64, 64), new TextureRegion(monsterA, 256, 0, 64, 64), new TextureRegion(monsterA, 320, 0, 64, 64) ,
                new TextureRegion(monsterA, 384, 0, 64, 64));

        monsterIdleA = new Animation(0.2f, new TextureRegion(monsterA, 0, 0, 64, 64), new TextureRegion(monsterA, 64, 0, 64, 64),
                new TextureRegion(monsterA, 128, 0, 64, 64), new TextureRegion(monsterA, 192, 0, 64, 64), new TextureRegion(monsterA, 256, 0, 64, 64),
                new TextureRegion(monsterA, 320, 0, 64, 64),  new TextureRegion(monsterA, 384, 0, 64, 64) );

        monsterRunA = new Animation(0.2f, new TextureRegion(monsterA, 0, 128, 64, 64), new TextureRegion(monsterA, 64, 128, 64, 64),
                new TextureRegion(monsterA, 128, 128, 64, 64), new TextureRegion(monsterA, 192, 128, 64, 64), new TextureRegion(monsterA, 256, 128, 64, 64),
                new TextureRegion(monsterA, 320, 128, 64, 64), new TextureRegion(monsterA, 384, 128, 64, 64),
                new TextureRegion(monsterA, 448, 128, 64, 64));

        monsterB = new Texture(game, "monsterb.png");

        monsterWaitB = new Animation(0.2f, new TextureRegion(monsterB, 0, 0, 64, 64), new TextureRegion(monsterB, 64, 0, 64, 64), new TextureRegion(monsterB, 128, 0, 64, 64),
                new TextureRegion(monsterB, 192, 0, 64, 64), new TextureRegion(monsterB, 256, 0, 64, 64), new TextureRegion(monsterB, 320, 0, 64, 64) ,
                new TextureRegion(monsterB, 384, 0, 64, 64));

        monsterIdleB = new Animation(0.2f, new TextureRegion(monsterB, 0, 0, 64, 64), new TextureRegion(monsterB, 64, 0, 64, 64),
                new TextureRegion(monsterB, 128, 0, 64, 64), new TextureRegion(monsterB, 192, 0, 64, 64), new TextureRegion(monsterB, 256, 0, 64, 64),
                new TextureRegion(monsterB, 320, 0, 64, 64),  new TextureRegion(monsterB, 384, 0, 64, 64) );

        monsterRunB = new Animation(0.2f, new TextureRegion(monsterB, 0, 128, 64, 64), new TextureRegion(monsterA, 64, 128, 64, 64),
                new TextureRegion(monsterB, 128, 128, 64, 64), new TextureRegion(monsterB, 192, 128, 64, 64), new TextureRegion(monsterB, 256, 128, 64, 64),
                new TextureRegion(monsterB, 320, 128, 64, 64), new TextureRegion(monsterB, 384, 128, 64, 64),
                new TextureRegion(monsterB, 448, 128, 64, 64));

        monsterC = new Texture(game, "monsterc.png");

        monsterWaitC = new Animation(0.2f, new TextureRegion(monsterC, 0, 0, 64, 64), new TextureRegion(monsterC, 64, 0, 64, 64), new TextureRegion(monsterC, 128, 0, 64, 64),
                new TextureRegion(monsterC, 192, 0, 64, 64), new TextureRegion(monsterC, 256, 0, 64, 64), new TextureRegion(monsterC, 320, 0, 64, 64) ,
                new TextureRegion(monsterC, 384, 0, 64, 64));

        monsterIdleC = new Animation(0.2f, new TextureRegion(monsterC, 0, 0, 64, 64), new TextureRegion(monsterC, 64, 0, 64, 64),
                new TextureRegion(monsterC, 128, 0, 64, 64), new TextureRegion(monsterC, 192, 0, 64, 64), new TextureRegion(monsterC, 256, 0, 64, 64),
                new TextureRegion(monsterC, 320, 0, 64, 64),  new TextureRegion(monsterC, 384, 0, 64, 64) );

        monsterRunC = new Animation(0.2f, new TextureRegion(monsterC, 0, 128, 64, 64), new TextureRegion(monsterA, 64, 128, 64, 64),
                new TextureRegion(monsterC, 128, 128, 64, 64), new TextureRegion(monsterC, 192, 128, 64, 64), new TextureRegion(monsterC, 256, 128, 64, 64),
                new TextureRegion(monsterC, 320, 128, 64, 64), new TextureRegion(monsterC, 384, 128, 64, 64),
                new TextureRegion(monsterB, 448, 128, 64, 64));

        objectsAnimation = new Texture(game, "AnimationObjects.png");

        torch = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 0, 64, 64), new TextureRegion(objectsAnimation, 64, 0, 64, 64)
                ,new TextureRegion(objectsAnimation, 128, 0, 64, 64), new TextureRegion(objectsAnimation, 192, 0, 64, 64)
                ,new TextureRegion(objectsAnimation, 256, 0, 64, 64), new TextureRegion(objectsAnimation, 320, 0, 64, 64));

        animationBarrel = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 64, 64, 64), new TextureRegion(objectsAnimation, 64, 64, 64, 64),
                new TextureRegion(objectsAnimation, 128, 64, 64, 64),  new TextureRegion(objectsAnimation, 192, 64, 64, 64), new TextureRegion(objectsAnimation, 256, 64, 64, 64),
                new TextureRegion(objectsAnimation, 320, 64, 64, 64),  new TextureRegion(objectsAnimation, 384, 64, 64, 64),  new TextureRegion(objectsAnimation, 448, 64, 64, 64));


        animationChest = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 128, 64, 64), new TextureRegion(objectsAnimation, 64, 128, 64, 64),
                new TextureRegion(objectsAnimation, 128, 128, 64, 64), new TextureRegion(objectsAnimation, 192, 128, 64, 64),  new TextureRegion(objectsAnimation, 256, 128, 64, 64),
                new TextureRegion(objectsAnimation, 320, 128, 64, 64), new TextureRegion(objectsAnimation, 384, 128, 64, 64),  new TextureRegion(objectsAnimation, 448, 128, 64, 64));

        animationBox = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 192, 64, 64), new TextureRegion(objectsAnimation, 64, 192, 64, 64),
                new TextureRegion(objectsAnimation, 128, 193, 64, 64), new TextureRegion(objectsAnimation, 192, 192, 64, 64), new TextureRegion(objectsAnimation, 256, 192, 64, 64),
                new TextureRegion(objectsAnimation, 320, 192, 64, 64),  new TextureRegion(objectsAnimation, 384, 192, 64, 64),  new TextureRegion(objectsAnimation, 448, 192, 64, 64));

        fireball = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 192, 64, 64), new TextureRegion(objectsAnimation, 64, 192, 64, 64),
                new TextureRegion(objectsAnimation, 128, 193, 64, 64), new TextureRegion(objectsAnimation, 192, 192, 64, 64), new TextureRegion(objectsAnimation, 256, 192, 64, 64),
                new TextureRegion(objectsAnimation, 320, 192, 64, 64),  new TextureRegion(objectsAnimation, 384, 192, 64, 64),  new TextureRegion(objectsAnimation, 448, 192, 64, 64));

        fire  = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 320, 64, 64), new TextureRegion(objectsAnimation, 64, 320, 64, 64),
                new TextureRegion(objectsAnimation, 128, 320, 64, 64), new TextureRegion(objectsAnimation, 192, 320, 64, 64),
                new TextureRegion(objectsAnimation, 256, 320, 64, 64), new TextureRegion(objectsAnimation, 320, 320, 64, 64));

        powerPickup = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 384, 64, 64), new TextureRegion(monsterA, 64, 192, 64, 64),
                new TextureRegion(objectsAnimation, 128, 384, 64, 64), new TextureRegion(objectsAnimation, 192, 384, 64, 64), new TextureRegion(objectsAnimation, 256, 384, 64, 64),
                new TextureRegion(objectsAnimation, 320, 384, 64, 64),  new TextureRegion(objectsAnimation, 384, 384, 64, 64),  new TextureRegion(objectsAnimation, 448, 384, 64, 64));;

        fireballPickup = new Animation(0.2f, new TextureRegion(objectsAnimation, 0, 448, 64, 64), new TextureRegion(objectsAnimation, 64, 448, 64, 64),
                new TextureRegion(objectsAnimation, 128, 448, 64, 64), new TextureRegion(objectsAnimation, 192, 448, 64, 64), new TextureRegion(objectsAnimation, 256, 448, 64, 64),
                new TextureRegion(objectsAnimation, 320, 448, 64, 64));

        // PLAYER SECTION
        player  = new Texture(game, "player.png");

        playerCelebrate = new Animation(0.2f, new TextureRegion(player, 0, 0, 64, 64), new TextureRegion(player, 64, 0, 64, 64),
                new TextureRegion(player, 128, 0, 64, 64), new TextureRegion(player, 192, 0, 64, 64), new TextureRegion(player, 256, 0, 64, 64),
                new TextureRegion(player, 320, 0, 64, 64), new TextureRegion(player, 384, 0, 64, 64), new TextureRegion(player, 448, 0, 64, 64));

        playerKilled = new Animation(0.2f, new TextureRegion(player, 0, 64, 64, 64), new TextureRegion(player, 64, 64, 64, 64),
                new TextureRegion(player, 128, 64, 64, 64), new TextureRegion(player, 192, 64, 64, 64), new TextureRegion(player, 256, 64, 64, 64),
                new TextureRegion(player, 320, 64, 64, 64), new TextureRegion(player, 384, 64, 64, 64), new TextureRegion(player, 448, 64, 64, 64));

        playerJump = new Animation(0.2f, new TextureRegion(player, 0, 256, 64, 64), new TextureRegion(player, 64, 256, 64, 64),
                new TextureRegion(player, 128, 256, 64, 64), new TextureRegion(player, 192, 256, 64, 64), new TextureRegion(player, 256, 256, 64, 64),
                new TextureRegion(player, 320, 256, 64, 64), new TextureRegion(player, 384, 256, 64, 64), new TextureRegion(player, 448, 256, 64, 64));

        playerWalk = new Animation(0.2f, new TextureRegion(player, 0, 384, 64, 64), new TextureRegion(player, 64, 384, 64, 64),
                new TextureRegion(player, 128, 384, 64, 64), new TextureRegion(player, 192, 384, 64, 64), new TextureRegion(player, 256, 384, 64, 64),
                new TextureRegion(player, 320, 384, 64, 64), new TextureRegion(player, 384, 384, 64, 64), new TextureRegion(player, 448, 384, 64, 64),
                new TextureRegion(player,   0, 448, 64, 64), new TextureRegion(player,  64, 448, 64, 64));

        playerIdle   = new Animation(1.2f, new TextureRegion(player, 448, 448, 64, 64));//, new TextureRegion(player, 384, 448, 64, 64), new TextureRegion(player, 320, 448, 64, 64));

        playerAttack = new Animation(0.2f, new TextureRegion(player, 192, 448, 64, 64), new TextureRegion(player, 256, 448, 64, 64), new TextureRegion(player, 320, 448, 64, 64));

        messages   = new Texture(game, "messages.png");
        diedRegion = new TextureRegion(messages, 0, 0,   480, 170);
        loseRegion = new TextureRegion(messages, 0, 170, 480, 170);
        winRegion  = new TextureRegion(messages, 0, 340, 480, 170);

        // TILE SECTION
        tile             = new Texture(game, "tile.png");
        BlockARegion     = new TextureRegion(tile,   0, 0, 32, 32);
        BlockBRegion     = new TextureRegion(tile,  32, 0, 32, 32);
        BlockCRegion     = new TextureRegion(tile,  64, 0, 32, 32);
        BlockDRegion     = new TextureRegion(tile,  96, 0, 32, 32);
        BlockERegion     = new TextureRegion(tile, 128, 0, 32, 32);
        BlockFRegion     = new TextureRegion(tile, 160, 0, 32, 32);
        BlockGRegion     = new TextureRegion(tile, 192, 0, 32, 32);
        BlockHRegion     = new TextureRegion(tile, 224, 0, 32, 32);
        BlockIRegion     = new TextureRegion(tile, 256, 0, 32, 32);

        ExitRegion       = new TextureRegion(tile, 363, 0, 32, 32);
        PlateformRegion  = new TextureRegion(tile, 398, 0, 42, 32);
        ladder           = new TextureRegion(tile, 443, 0, 32, 32);
        gunarm           = new TextureRegion(tile,   0, 32, 64, 64);
        healthbar        = new TextureRegion(tile,   0,64, 64, 64);
        gemRegion        = new TextureRegion(tile, 480, 0,  32, 32);

        // MUSIC SECTION
        music = game.getAudio().newMusic("Music.mp3");
        music.setLooping(true);
        music.setVolume(0.3f);

        // SOUND SECTION
        exitReached       = game.getAudio().newSound("ExitReached.ogg");
        gemCollected      = game.getAudio().newSound("GemCollected.ogg");
        monsterkilled     = game.getAudio().newSound("MonsterKilled.ogg");
        playerfall        = game.getAudio().newSound("PlayerFall.ogg");
        playerjump        = game.getAudio().newSound("PlayerJump.ogg");
        powerup           = game.getAudio().newSound("Powerup.ogg");
        playerKilledSound = game.getAudio().newSound("PlayerKilled.ogg");

        drum = game.getAudio().newMusic("drum.wav");
        drum.setLooping(true);
        drum.setVolume(0.5f);
    }

    public static void reload()
    {
        monsterA.reload();
        monsterB.reload();
        monsterC.reload();
        items.reload();
        messages.reload();
        tile.reload();
        background.reload();
        player.reload();
        BlackFont.reload();
        RedFont.reload();
    }

    public static void playMusic()
    {
        if(Settings.musicEnabled)
            music.play();
    }

    public static void playSound(Sound sound)
    {
        if(Settings.soundEnabled)
            sound.play(1.0f);
    }
}
