package edu.corvallis.processing;

import processing.core.PApplet;

public abstract class ProcessingSketch extends PApplet {

    static {
        // XRender draws a black canvas on the dev container's VNC display; must be set before AWT starts
        System.setProperty("sun.java2d.xrender", "false");
    }

    public static void launch(Class<? extends PApplet> sketchClass) {
        PApplet.main(sketchClass);
    }
}