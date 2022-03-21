package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.Goon;

public class goDown extends SpriteEntity implements Collider {
    public Size size;

    public goDown(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.down.png", initialLocation);
        this.size = size;
    }

    public void getDirection(){
        Direction.DOWN.getValue();
    }

}
