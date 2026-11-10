# Java Processing-Style Project Starter

Use this repository as a starting point for Java projects that behave like Processing sketches. Clone it to create your own project, then add your sketch code and assets.

## Start a project

1. Clone this repository, or select **Use this template** on GitHub to create your own copy.
2. Open the project in your Java editor or IDE.
3. Configure the project to use the Processing Core library (`processing.core`). Follow your editor's or build tool's instructions for adding Java dependencies.
4. Create a Java class that extends `PApplet`. For example:

   ```java
   import processing.core.PApplet;

   public class MySketch extends PApplet {
	   public void settings() {
		   size(640, 480);
	   }

	   public void setup() {
		   // Runs once when the sketch starts.
	   }

	   public void draw() {
		   // Runs repeatedly while the sketch is open.
	   }

	   public static void main(String[] args) {
		   PApplet.main(MySketch.class.getName());
	   }
   }
   ```

5. Run the class containing `main` from your IDE or the project's configured run task.

## Processing sketch lifecycle

- `settings()` configures the sketch, including its window size.
- `setup()` runs once when the sketch starts.
- `draw()` runs repeatedly while the sketch is running.

Add more Java classes and assets as your project grows. Check the project configuration for its required Java version and how dependencies and run tasks are managed.
