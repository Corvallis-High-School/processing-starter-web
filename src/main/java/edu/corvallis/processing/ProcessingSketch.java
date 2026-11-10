package edu.corvallis.processing;

import processing.core.PApplet;

public abstract class ProcessingSketch extends PApplet {

    public static void launch(Class<? extends PApplet> sketchClass) {
        PApplet.main(sketchClass);
    }
}