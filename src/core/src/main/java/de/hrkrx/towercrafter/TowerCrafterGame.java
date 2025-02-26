package de.hrkrx.towercrafter;

import com.badlogic.gdx.Game;

public class TowerCrafterGame extends Game {
    @Override
    public void create() {
        setScreen(new MainMenuScreen(this));
    }

    public void render(float delta) {
        super.render();
    }
}
