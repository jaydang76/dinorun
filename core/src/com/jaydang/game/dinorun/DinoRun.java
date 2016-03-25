package com.jaydang.game.dinorun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jaydang.game.dinorun.screen.GameScreen;
import com.jaydang.game.dinorun.screen.MenuScreen;

public class DinoRun extends Game {
	private Game game;
	public DinoRun() {
		game = this;
	}
	
	@Override
	public void create () {
		setScreen(new MenuScreen(game));
	}

	@Override public void render() {
		super.render();
	}
}
