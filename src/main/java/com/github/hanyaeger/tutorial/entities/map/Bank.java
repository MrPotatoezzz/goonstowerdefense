package com.github.hanyaeger.tutorial.entities.map;

import java.util.Optional;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.entities.Goons.*;

import com.github.hanyaeger.tutorial.scenes.Map1;
import javafx.scene.Node;

public class Bank extends DynamicSpriteEntity implements Collided {

	private Map1 level;
	private Goon goon;

	public Bank(Coordinate2D location, Map1 level) {
		super("sprites/devIcon.png", location);
		this.level = level;
		this.goon = level.getGoon();
	}

	int health = 1000;
	
	@Override
	  public void onCollision (Collider collider) {
	  if (collider instanceof Goon) {
	      health--;
	      goon.remove();
	    }
	  }

	@Override
	public Optional<? extends Node> getNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
