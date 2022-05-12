package com.github.hanyaeger.tutorial.entities.Goons;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.tutorial.entities.map.DirectionalTile;

import java.util.ArrayList;


public class NormalGoon extends Goon implements Collider {
    public int health;

    public NormalGoon(String resource, Coordinate2D initialLocation, ArrayList<DirectionalTile> directionalTiles) {
        super("sprites/normalgoon.png", initialLocation, directionalTiles);
//        setHealth();
        health = 1;
        setSpeed(1);
        setDirection(Direction.DOWN.getValue());
    }


    public int getHealth(){
        return health;
    }

    public int setHealth(){
        return health = 1;
    }

    public int removeHealthPoints(){
        return health--;
    }
}
