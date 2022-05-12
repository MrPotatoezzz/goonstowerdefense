package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.GoonsTowerDefense;
import com.github.hanyaeger.tutorial.entities.Goons.BuffGoon;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.Goons.NormalGoon;
import com.github.hanyaeger.tutorial.entities.Goons.SpeedyGoon;
import com.github.hanyaeger.tutorial.entities.map.*;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.entities.towers.Tower;
import com.github.hanyaeger.tutorial.spawners.BulletSpawner;
import com.github.hanyaeger.tutorial.spawners.GoonSpawner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Level extends DynamicScene implements /*TileMapContainer,*/ EntitySpawnerContainer {

    private Level level = this;
    private LevelTile levelTile = new LevelTile(level);
    private HealthText healthText;
    ArrayList<DirectionalTile> DirectionalTiles = new ArrayList<DirectionalTile>();
    private  int[][] Tiles;


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/grass.jpg");
        DirectionalTile d = new GoRight(new Coordinate2D(10, 10) , new Size(10));

        DirectionalTiles.add(d);
        createDirectianalTiles();
//        this.DirectionalTiles = DirectionalTiles;
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
            Goon goon = new BuffGoon("sprites/devIcon.png", new Coordinate2D(0, 0), DirectionalTiles);
            return goon;
        } else if(randomNum == 4){
            Goon goon = new SpeedyGoon("sprites/devIcon.png", new Coordinate2D(0, 0), DirectionalTiles);
            return goon;
        }
            Goon goon = new NormalGoon("sprites/devIcon.png", new Coordinate2D(0, 0), DirectionalTiles);
            return goon;
    }

//    @Override
//    public void setupTileMaps() {
//        addTileMap(levelTile);
//    }

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

    public void createDirectianalTiles(){
        int[][] Tiles = {
                {0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {4, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6},
                {5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 5, 5, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 0, 0, 0, 0, 1, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 4, 4, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}
        };
        for (int i = 0; i < Tiles.length; i++) {
            for (int j = 0; j < 18; j++) {
                if (Tiles[i][j] == 4) {
                    GoRight R = new GoRight(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15));
                    addEntity(R);
                    DirectionalTiles.add(R);
                } else if(Tiles[i][j] == 1){
                    GoUp U = new GoUp(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15));
                    addEntity(U);
                    DirectionalTiles.add(U);
                } else if(Tiles[i][j] == 3){
                GoLeft L = new GoLeft(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15));
                addEntity(L);
                    DirectionalTiles.add(L);
                } else if(Tiles[i][j] == 2){
                    GoDown D = new GoDown(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15));
                    addEntity(D);
                    DirectionalTiles.add(D);
                } else if((Tiles[i][j] == 5)){
                    PlaceableSpace P = new PlaceableSpace(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15), level);
                    addEntity(P);
                }else if((Tiles[i][j] == 6)){
                    Bank B = new Bank(new Coordinate2D((GoonsTowerDefense.SceneWidth / 18) * j , (GoonsTowerDefense.SceneHeight / Tiles.length ) * i), new Size(GoonsTowerDefense.SceneWidth / Tiles.length , GoonsTowerDefense.SceneHeight / 15), level);
                    addEntity(B);
                }
            }
        }
    }

}
