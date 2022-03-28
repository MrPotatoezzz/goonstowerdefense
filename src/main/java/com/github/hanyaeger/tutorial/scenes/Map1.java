package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.Goons.NormalGoon;
import com.github.hanyaeger.tutorial.entities.map.Bank;
import com.github.hanyaeger.tutorial.entities.map.LevelTile;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.entities.towers.Bullet;
import com.github.hanyaeger.tutorial.entities.towers.Tower;
import com.github.hanyaeger.tutorial.spawners.BulletSpawner;


public class Map1 extends DynamicScene implements TileMapContainer, EntitySpawnerContainer {

    private Goon goon;
    private Map1 level = this;
    private LevelTile levelTile = new LevelTile(level);
    private HealthText healthText;

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {

        goon = new NormalGoon("sprites/devIcon.png", new Coordinate2D(0, 0), levelTile);
        addEntity(goon);
        this.goon = goon;

    }

    @Override
    public void setupTileMaps() {
        addTileMap(levelTile);
    }

    public void createTower(Coordinate2D center) {
        Tower tower = new Tower(center, goon, this);
        tower.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(tower);
        createSpawner(center);
    }

    @Override
    public void setupEntitySpawners() {

    }

    void createSpawner(Coordinate2D center){
        BulletSpawner bulletSpawner = new BulletSpawner(1000, center, goon);
        addEntitySpawner(bulletSpawner);
    }

    public void setHealthText(int health){
        HealthText healthText = new HealthText(new Coordinate2D(0, 0));
        healthText.setHealthText(health);
        addEntity(healthText);
        this.healthText = healthText;
        //healthText.setViewOrder(1);
    }

    public void updateHealthText(int health){
        healthText.setHealthText(health);
    }
}
