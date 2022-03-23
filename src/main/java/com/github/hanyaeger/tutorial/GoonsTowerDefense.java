package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.Map1;
import com.github.hanyaeger.tutorial.scenes.TitleScreen;

public class GoonsTowerDefense extends YaegerGame {

    public static void main(String[] args){
        launch(args);
    }
    private Map1 map = new Map1();

    @Override
    public void setupGame() {
        setGameTitle("Goons Tower Defense");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScreen(this));
        addScene(1, map);
    }
}
