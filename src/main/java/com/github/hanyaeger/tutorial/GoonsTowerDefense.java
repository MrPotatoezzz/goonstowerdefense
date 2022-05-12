package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.Level;
import com.github.hanyaeger.tutorial.scenes.TitleScreen;

public class GoonsTowerDefense extends YaegerGame {

    public static void main(String[] args){
        launch(args);
    }
    private Level map = new Level();
    public static int SceneWidth = 800;
    public static int SceneHeight = 600;

    @Override
    public void setupGame() {
        setGameTitle("Goons Tower Defense");
        setSize(new Size(SceneWidth, SceneHeight));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScreen(this));
        addScene(1, map);
    }
}
