package com.github.hanyaeger.tutorial.entities.map;

import java.util.Optional;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.*;

import com.github.hanyaeger.tutorial.scenes.Map1;
import javafx.scene.Node;

public class Bank extends SpriteEntity implements Collided, Collider {

	private Map1 level;
	private int health = 1000;

	public Bank(Coordinate2D initialLocation, Size size, Map1 level) {
		super("sprites/devIcon.png", initialLocation, size);
		this.level = level;
		level.setHealthText(getHealth());
	}

	
	@Override
	  public void onCollision (Collider collider) {
	  if (collider instanceof NormalGoon) {
	      health--;
		  level.updateHealthText(getHealth());
	    } else{
		  System.out.println("gehit");
	  }
	  }

	  public int getHealth(){
		return health;
	  }
}
