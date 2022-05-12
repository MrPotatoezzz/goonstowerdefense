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

import java.util.ArrayList;


public abstract class Goon extends DynamicSpriteEntity implements Collided, Collider, SceneBorderCrossingWatcher {

    private ArrayList<DirectionalTile> DirectionalTiles;
    public boolean hasHitBank = false;

    public Goon(String resource, Coordinate2D initialLocation, ArrayList<DirectionalTile> DirectionalTiles) {
        super(resource, initialLocation);
        this.DirectionalTiles = DirectionalTiles;
    }

    @Override
    public void onCollision(Collider collider){

//        if the object the goon collides with is from the type DirectionalTiles it will get the direction from
//        a method off the tile witch guides the goon to the correct direction.

        for (int i = 0; i < DirectionalTiles.size() - 1 ; i++) {
            if(collider.equals(DirectionalTiles.get(i))){
               setDirection(DirectionalTiles.get(i).getNewDirection());
            }
        }

        if(collider instanceof Bullet){
            removeHealthPoints();
        } else if(collider instanceof Bank){
            setOpacity(0);
            hasHitBank = true;
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
