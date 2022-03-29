package com.github.hanyaeger.tutorial.spawners;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.tutorial.scenes.Map1;


public class GoonSpawner extends EntitySpawner {

    private Map1 level;

    public GoonSpawner(long intervalInMs, Map1 level) {
        super(intervalInMs);
        this.level = level;
    }


    @Override
    protected void spawnEntities() {
        spawn(level.spawnGoon());
    }
}
