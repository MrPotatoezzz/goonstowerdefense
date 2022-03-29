package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.entities.Goons.BuffGoon;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.Goons.NormalGoon;
import com.github.hanyaeger.tutorial.entities.Goons.SpeedyGoon;
import com.github.hanyaeger.tutorial.entities.map.Bank;
import com.github.hanyaeger.tutorial.entities.map.LevelTile;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.entities.towers.Bullet;
import com.github.hanyaeger.tutorial.entities.towers.Tower;
import com.github.hanyaeger.tutorial.spawners.BulletSpawner;
import com.github.hanyaeger.tutorial.spawners.GoonSpawner;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Map1 extends DynamicScene implements TileMapContainer, EntitySpawnerContainer {

    private Map1 level = this;
    private LevelTile levelTile = new LevelTile(level);
    private HealthText healthText;

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {

        //Goon goon = new NormalGoon("sprites/devIcon.png", new Coordinate2D(0, 0));
        addEntity(spawnGoon());
    }

    /*
    The random number generator code was found on Stack overflow: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    The random number generator chooses a random number and with this random number a goon wil be chosen to spawn.
     */

    public Goon spawnGoon(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        System.out.println(randomNum);
        if(randomNum == 2){
            Goon goon = new BuffGoon("sprites/devIcon.png", new Coordinate2D(0, 0));
            return goon;
        } else if(randomNum == 4){
            Goon goon = new SpeedyGoon("sprites/devIcon.png", new Coordinate2D(0, 0));
            return goon;
        }
            Goon goon = new NormalGoon("sprites/devIcon.png", new Coordinate2D(0, 0));
            return goon;
    }

    @Override
    public void setupTileMaps() {
        addTileMap(levelTile);
    }

    public void createTower(Coordinate2D center) {
        Tower tower = new Tower(center,this);
        tower.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(tower);
        createSpawner(center);
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new GoonSpawner (4000, level));
    }

    void createSpawner(Coordinate2D center){
        BulletSpawner bulletSpawner = new BulletSpawner(1000, center);
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
