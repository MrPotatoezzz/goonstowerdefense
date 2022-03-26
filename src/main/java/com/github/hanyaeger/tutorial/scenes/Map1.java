package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.map.Bank;
import com.github.hanyaeger.tutorial.entities.map.LevelTile;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.entities.towers.Tower;


public class Map1 extends DynamicScene implements TileMapContainer {

    private Goon goon;

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {

        Goon goon = new Goon("sprites/devIcon.png", new Coordinate2D(0, 0));
        addEntity(goon);
        this.goon = goon;

        HealthText healthText = new HealthText(new Coordinate2D(0, 0));
        healthText.setHealthText(1000);
        //healthText.setViewOrder(1);
        addEntity(healthText);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelTile(this));
    }

    public void createTower(Coordinate2D center) {
        Tower tower = new Tower(center);
        tower.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(tower);
    }

    public Goon getGoon() {
        return goon;
    }
}
