package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class goRight extends SpriteEntity implements Collider {
    public Size size;
    public goRight(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.right.png", initialLocation);
        this.size = size;
    }

    public void getDirection(){
        Direction.RIGHT.getValue();
    }
}
