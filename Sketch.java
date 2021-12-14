import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(122, 163, 240);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(60);
    
    // Grass
    fill(31, 120, 13);
    rect(0, (float) (width / 1.25), (height), (width / 5));
    
    // Church
    fill(148, 62, 9);
    rect((float) (width / 2.5), (float) (height / 1.67), (float) (width / 2.5), (float) (height / 1.67));
    
    // Church Door
    fill(15, 15, 15);
    rect((float) (width / 1.8),(float) (height / 1.1),(float) (width / 10),(float) (height / 7.14));  
    
    // Roof
    fill(123, 135, 120);
    triangle((float) (width / 1.67),(float) (height / 50),(float) (width / 2.5), (float) (height / 1.67),(float) (width / 1.25),(float) (height / 1.67));
    
    // Cross Y
    line((float) (width / 1.67),(float) (height / 4.167),(float) (width / 1.67),(float) (height / 2.5));  
    
    // Cross X
    line((float) (width / 1.51),(float) (height / 3.3),(float) (width / 1.85),(float) (height / 3.3));    
    
    // Left Window
    fill(119, 64, 237);
    ellipse((float) (width / 1.43),(float) (height / 1.25),(float) (width / 11.1),(float) (height / 11.1));
    
    // Right Window
    fill(119, 64, 237);
    ellipse((float) (width / 2),(float) (height / 1.25),(float) (width / 11.1),(float) (width / 11.1));
    
  }
}