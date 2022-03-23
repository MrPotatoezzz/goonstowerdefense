package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Directionaltile extends SpriteEntity implements Collider {

    public Directionaltile(String resource , Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }
}
