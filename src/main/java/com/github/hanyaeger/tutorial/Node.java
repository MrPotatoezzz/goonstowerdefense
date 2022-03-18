package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Node extends SpriteEntity {

    public Node(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }

    @Override
    public Coordinate2D getLocationInScene() {
        return super.getLocationInScene();
    }
}
