package com.jaydang.game.dinorun.stage;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.jaydang.game.dinorun.screen.GameScreen;
import com.jaydang.game.dinorun.util.Constants;

/**
 * Created by ThinhDP1 on 3/25/2016.
 */
public class MenuStage extends Stage {
    private Game game;
    private TextureRegion background;

    public MenuStage(Game game) {
        this.game = game;
        setupBackground();
        setupStartButton();
    }

    private void setupBackground() {
        background = new TextureRegion(new Texture(Gdx.files.internal(Constants.BACKGROUND_IMAGE_PATH)));
        Image actor = new Image(background);
        addActor(actor);
    }

    private void setupStartButton() {
        TextButton startGameButton = new TextButton("Start game", getSkin() );
        startGameButton.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/2);
        startGameButton.addListener(new ClickListener() {
            @Override public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                    game.setScreen(new GameScreen(game));
            }
        });
        addActor(startGameButton);
    }

    private Skin getSkin() {
        BitmapFont font = new BitmapFont();
        Skin skin = new Skin();
        skin.add("default", font);

        Pixmap pixmap = new Pixmap((int) Gdx.graphics.getWidth()/4,(int)
                Gdx.graphics.getHeight()/10, Pixmap.Format.RGB888);
        pixmap.setColor(Color.WHITE);
        pixmap.fill();
        skin.add("background",new Texture(pixmap));
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = skin.newDrawable("background", Color.GRAY);
        textButtonStyle.down = skin.newDrawable("background", Color.DARK_GRAY);
        textButtonStyle.checked = skin.newDrawable("background", Color.DARK_GRAY);
        textButtonStyle.over = skin.newDrawable("background", Color.LIGHT_GRAY);
        textButtonStyle.font = skin.getFont("default");
        skin.add("default", textButtonStyle);

        return skin;
    }
}
