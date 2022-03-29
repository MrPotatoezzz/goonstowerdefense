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
        }else if(collider instanceof goRight){
            setDirection(Direction.RIGHT.getValue());
        }else if(collider instanceof goDown){
            setDirection(Direction.DOWN.getValue());
        }else if(collider instanceof goUp){
            setDirection(Direction.UP.getValue());
        }else if(collider instanceof goLeft){
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

    public  abstract int getHealth();

    public  abstract int removeHealthPoints();

    public abstract int setHealth();

    public void notifyBoundaryCrossing(SceneBorder border){
        killGoonInstantly();
    }
}
