package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class goDown extends SpriteEntity implements Collider {

    public goDown(Coordinate2D initialLocation, Size size) {
        super("sprites/dev.down.png", initialLocation, size);
    }

}
