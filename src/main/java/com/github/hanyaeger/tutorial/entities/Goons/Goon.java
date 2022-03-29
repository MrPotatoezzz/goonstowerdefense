package com.github.hanyaeger.tutorial.entities.Goons;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.map.*;
import com.github.hanyaeger.tutorial.entities.towers.Bullet;


public abstract class Goon extends DynamicSpriteEntity implements Collided, Collider, SceneBorderCrossingWatcher {

    public Goon(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }

    @Override
    public void onCollision(Collider collider){
        if(collider instanceof Bullet){
            removeHealthPoints();
        }else if(collider instanceof GoRight){
            setDirection(Direction.RIGHT.getValue());
        }else if(collider instanceof GoDown){
            setDirection(Direction.DOWN.getValue());
        }else if(collider instanceof GoUp){
            setDirection(Direction.UP.getValue());
        }else if(collider instanceof GoLeft){
            setDirection(Direction.LEFT.getValue());
        } else if(collider instanceof Bank){
            setOpacity(0);
        }

        if(getHealth() == 0){
            this.remove();
        }
    }
    public void killGoonInstantly(){
        this.remove();
    }
    /*
    the following function getHealth(), RemoveHealthPoints() and setHealth force the programmer to use these function in its child class,
    making the goons actually function, setHealth is used hor setting the default health at the start of the goons life, removeHealthpoint removes healthpoints
    when it is called, and getHealth returns the current health of the entity and can be used to see if an entity has 0 health and should be killed.
    */
    public  abstract int getHealth();

    public  abstract int removeHealthPoints();

    public abstract int setHealth();

    public void notifyBoundaryCrossing(SceneBorder border){
        killGoonInstantly();
    }
}
