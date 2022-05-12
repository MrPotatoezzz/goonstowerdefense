package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.*;

import com.github.hanyaeger.tutorial.scenes.Level;

public class Bank extends SpriteEntity implements Collided, Collider {

	private Level level;
	private int health = 1000;

	public Bank(Coordinate2D initialLocation, Size size, Level level) {
		super("sprites/bank.png", initialLocation, size);
		this.level = level;
		level.setHealthText(getHealth());
	}

	/*
	This code subtracts health from the bank entity when a goon hits it, it also calls the update of the health text
	 */
	
	@Override
	  public void onCollision (Collider collider) {
	  if (collider instanceof Goon) {
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
