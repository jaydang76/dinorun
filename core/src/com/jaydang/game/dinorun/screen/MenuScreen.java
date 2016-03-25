package com.jaydang.game.dinorun.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.jaydang.game.dinorun.stage.MenuStage;
import com.jaydang.game.dinorun.util.Constants;

/**
 * Created by ThinhDP1 on 3/25/2016.
 */
public class MenuScreen implements Screen {
    private MenuStage stage;

    public MenuScreen(Game game) {
        stage = new MenuStage(game);
        Gdx.input.setInputProcessor(stage);
    }

    @Override public void show() {

    }

    @Override public void render(float delta) {
        //Clear the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Update the stage
        stage.draw();
        stage.act(delta);
    }

    @Override public void resize(int width, int height) {
    }

    @Override public void pause() {

    }

    @Override public void resume() {

    }

    @Override public void hide() {

    }

    @Override public void dispose() {
        stage.dispose();
    }
}
