package com.github.hanyaeger.tutorial.entities.Goons;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.TileMap;



public class NormalGoon extends Goon implements Collider {
    public int health;

    public NormalGoon(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
        setHealth();
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
