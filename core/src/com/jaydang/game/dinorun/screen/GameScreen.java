package com.jaydang.game.dinorun.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.jaydang.game.dinorun.stage.GameStage;

/**
 * Created by ThinhDP1 on 3/23/2016.
 */
public class GameScreen implements Screen {
    private GameStage stage;

    public GameScreen(Game game) {
        stage = new GameStage(game);
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
