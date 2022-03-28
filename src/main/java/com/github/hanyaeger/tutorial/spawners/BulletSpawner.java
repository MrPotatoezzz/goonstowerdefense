package com.github.hanyaeger.tutorial.spawners;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.towers.Bullet;

public class BulletSpawner extends EntitySpawner {
    private Goon goon;
    private Coordinate2D towerLocation;

    public BulletSpawner(long intervalInMs, Coordinate2D towerLocation, Goon goon) {
        super(intervalInMs);
        this.towerLocation = towerLocation;
        this.goon = goon;
    }

    @Override
    protected void spawnEntities() {
        spawn(new Bullet("sprites/devIcon.png", towerLocation, goon));
    }
}
