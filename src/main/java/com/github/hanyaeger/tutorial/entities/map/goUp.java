package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.CompositeEntity;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class goUp extends SpriteEntity implements Collider{
public Size size;

    public goUp(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.up.png", initialLocation);
        this.size = size;
    }

    public void getDirection(){
        Direction.UP.getValue();
    }
}
