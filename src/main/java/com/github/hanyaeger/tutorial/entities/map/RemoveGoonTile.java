package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class RemoveGoonTile extends SpriteEntity implements Collider {

    public RemoveGoonTile(Coordinate2D initialLocation, Size size) {
        super("sprites/devIcon.png", initialLocation, size);
    }
}
