package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.map.DirectionTile;
import com.github.hanyaeger.tutorial.entities.towers.Tower;
import javafx.scene.input.MouseButton;

public class Map1 extends DynamicScene implements TileMapContainer, MouseButtonPressedListener {

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities(){

        Goon goon = new Goon("sprites/devIcon.png" , new Coordinate2D(0,0));
        addEntity(goon);
        };

    @Override
    public void setupTileMaps() {
        addTileMap(new DirectionTile());
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        Tower tower = new Tower(coordinate2D);
        addEntity(tower);
    }
}
