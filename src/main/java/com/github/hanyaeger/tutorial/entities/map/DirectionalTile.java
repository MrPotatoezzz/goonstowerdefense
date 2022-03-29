package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class DirectionalTile extends SpriteEntity implements Collider {

    public DirectionalTile(String resource , Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
        setOpacity(0);
    }

    public abstract Direction getDirection();

    public abstract AnchorPoint getAnchorpoint();
}
