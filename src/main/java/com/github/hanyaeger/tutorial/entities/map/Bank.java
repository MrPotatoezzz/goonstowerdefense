package com.github.hanyaeger.tutorial.entities.map;

import java.util.Optional;

import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.entities.Goons.*;

import javafx.scene.Node;

public class Bank implements Collided {
	private Goon goon;

	public Bank(Goon goon) {
		this.goon = goon;
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
