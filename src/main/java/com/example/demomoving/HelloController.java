package com.example.demomoving;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.text.DecimalFormat;

public class HelloController {
    @FXML
    Circle blueCircle;
    int dx = 25;
    int dy = 25;

    @FXML
    Pane paneWithBlueCircle;

    @FXML
    AnchorPane mainPane;

    @FXML
    TextField textX, textY;

    @FXML
    Slider sliderX, sliderY;

    public void initialize() {
        mainPane.setOnMouseClicked(mouseEvent -> {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            paneWithBlueCircle.setLayoutX(x - paneWithBlueCircle.getWidth() / 2);
            paneWithBlueCircle.setLayoutY(y - paneWithBlueCircle.getHeight() / 2);
        });

        textX.textProperty().bindBidirectional(paneWithBlueCircle.layoutXProperty(), new DecimalFormat());
        textY.textProperty().bindBidirectional(paneWithBlueCircle.layoutYProperty(), new DecimalFormat());

        sliderX.valueProperty().bindBidirectional(paneWithBlueCircle.layoutXProperty());
        sliderY.valueProperty().bindBidirectional(paneWithBlueCircle.layoutYProperty());
    }

    public void moveLeft() {
        //blueCircle.setCenterX(blueCircle.getCenterX() - dx);
        paneWithBlueCircle.setLayoutX(paneWithBlueCircle.getLayoutX() - dx);
    }

    public void moveRight() {
        // blueCircle.setCenterX(blueCircle.getCenterX() + dx);
        paneWithBlueCircle.setLayoutX(paneWithBlueCircle.getLayoutX() + dx);
    }

    public void moveUp() {
        //blueCircle.setCenterY(blueCircle.getCenterY() - dy);
        paneWithBlueCircle.setLayoutY(paneWithBlueCircle.getLayoutY() - dy);
    }

    public void moveDown() {
        // blueCircle.setCenterY(blueCircle.getCenterY() + dy);
        paneWithBlueCircle.setLayoutY(paneWithBlueCircle.getLayoutY() + dy);
    }


}