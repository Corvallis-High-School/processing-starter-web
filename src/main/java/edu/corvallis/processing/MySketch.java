package edu.corvallis.processing;

public class MySketch extends ProcessingSketch {

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        background(0);
    }

    @Override
    public void draw() {
        background(40);

        fill(255, 0, 0);
        ellipse(mouseX, mouseY, 100, 100);
    }
    public static void main(String[] args) {
        launch(MySketch.class);
    }
}