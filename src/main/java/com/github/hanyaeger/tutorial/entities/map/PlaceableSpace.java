package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.scenes.Map1;
import javafx.scene.input.MouseButton;

public class PlaceableSpace extends SpriteEntity implements  MouseButtonPressedListener{


    private Map1 level;
    private boolean isAvailable = true;

    public PlaceableSpace(Coordinate2D initialLocation, Size size, Map1 level) {
        super("sprites/devIcon.png", initialLocation, size);
        this.level = level;
    }


    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if (mouseButton.equals(MouseButton.PRIMARY) && isAvailable){
            Coordinate2D center = getLocationInScene().add(new Coordinate2D(getWidth()/2, getHeight()/2));

            level.createTower(center);
            setIsAvailableFalse();
        }
    }

    public boolean setIsAvailableFalse() {
        return !isAvailable;
    }
}
