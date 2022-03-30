package com.github.hanyaeger.tutorial.entities.Goons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;

public class BuffGoon extends Goon{

    private int health;

    public BuffGoon(String resource, Coordinate2D initialLocation) {
        super("sprites/buffgoon.png", initialLocation);
        setHealth();
        setSpeed(0.5);
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
        return health = 3;
    }
}
