package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.GoonsTowerDefense;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScreen extends StaticScene {


    private final GoonsTowerDefense goonsTowerDefense;

    public TitleScreen(GoonsTowerDefense goonsTowerDefense){
        this.goonsTowerDefense = goonsTowerDefense;

    }

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities(){
        var startButtonText = new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), goonsTowerDefense);
        startButtonText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        startButtonText.setFill(Color.DARKBLUE);
        startButtonText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(startButtonText);
    }
}
