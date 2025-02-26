package de.hrkrx.towercrafter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import de.hrkrx.towercrafter.model.Settings;

import javax.security.auth.login.Configuration;


/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private TowerCrafterGame gameInstance;
    private Lwjgl3ApplicationConfiguration config;

    public Main(Lwjgl3ApplicationConfiguration configuration) {
        config = configuration;
        Settings settings = LoadSettings(config);

        gameInstance = new TowerCrafterGame();
    }

    private Settings LoadSettings(Lwjgl3ApplicationConfiguration configuration) {
        Settings result = new Settings();
        // TODO: Load settings from file


        return new Settings();
    }


    @Override
    public void create() {
        gameInstance.create();
    }

    @Override
    public void render() {
        float delta = Gdx.graphics.getDeltaTime();
        gameInstance.render(delta);
    }

    @Override
    public void dispose() {
        gameInstance.dispose();
    }
}
