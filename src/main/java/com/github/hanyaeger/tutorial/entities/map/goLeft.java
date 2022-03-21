package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class goLeft extends SpriteEntity implements Collider{
    public Size size;
    public goLeft(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.left.png", initialLocation);
        this.size = size;
    }

    public void getDirection(){
        Direction.LEFT.getValue();
    }
}
