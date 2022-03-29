package com.github.hanyaeger.tutorial.spawners;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.tutorial.scenes.Level;


public class GoonSpawner extends EntitySpawner {

    private Level level;

    public GoonSpawner(long intervalInMs, Level level) {
        super(intervalInMs);
        this.level = level;
    }


    @Override
    protected void spawnEntities() {
        spawn(level.spawnGoon());
    }
}
