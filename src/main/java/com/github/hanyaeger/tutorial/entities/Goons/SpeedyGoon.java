package com.github.hanyaeger.tutorial.entities.Goons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.tutorial.entities.map.DirectionalTile;

import java.util.ArrayList;

public class SpeedyGoon extends Goon{

    private int health;

    public SpeedyGoon(String resource, Coordinate2D initialLocation, ArrayList<DirectionalTile> directionalTiles) {
        super("sprites/fastgoon.png", initialLocation, directionalTiles);
        setHealth();
        setSpeed(2);
        setDirection(Direction.DOWN);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int removeHealthPoints() {
        return health--;
    }

    @Override
    public int setHealth() {
        return health = 1;
    }
}
