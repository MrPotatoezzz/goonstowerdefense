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

public class Bank extends SpriteEntity implements Collided {

	private Map1 level;

	public Bank(Coordinate2D initialLocation, Size size, Map1 level) {
		super("sprites/devIcon.png", initialLocation, size);
		this.level = level;
	}

	int health = 1000;
	
	@Override
	  public void onCollision (Collider collider) {
	  if (collider instanceof Goon) {
	      health--;
	    }
	  }
}
