package com.github.hanyaeger.tutorial.spawners;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;
import com.github.hanyaeger.tutorial.entities.towers.Bullet;

public class BulletSpawner extends EntitySpawner {
    private Coordinate2D towerLocation;

    public BulletSpawner(long intervalInMs, Coordinate2D towerLocation) {
        super(intervalInMs);
        this.towerLocation = towerLocation;
    }

    @Override
    protected void spawnEntities() {
        spawn(new Bullet("sprites/Bullet.png", towerLocation));
    }
}
