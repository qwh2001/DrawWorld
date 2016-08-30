
/**
 * Write a description of class SimpleWindmill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import gpdraw.*;

public class SimpleWindmill
{
    // instance variables - replace the example below with your own
    private DrawingTool myPencil;                          //Create an object of the DrawingTool class named myPencil
    private SketchPad paper;                             //Create an object of the SketchPad class named paper
        
    public void draw()
    {
        paper = new SketchPad(800, 800, 25);  //Setting the dimensions 800x800 and the draw delay time as 10ms
        myPencil = new DrawingTool(paper);   //Will draw on the paper object
        drawWindmill();
    }
    
    private void drawWindmill(){
        
        myPencil.up();
        myPencil.home();
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLACK);
        myPencil.drawCircle(50);      // draw the large circle ring
        myPencil.fillCircle(5);       // draw the center point of the ring
        
        for(int i=0; i<10; i++) {   // repeat 10 times (0  to 9)
            
            // draw 4 color balls at each location of the large circle ring
            drawColorBall(0, 50, 15, java.awt.Color.RED);
            drawColorBall(50, 0, 15, java.awt.Color.RED);
            drawColorBall(0, -50, 15, java.awt.Color.GREEN);
            drawColorBall(-50, 0, 15, java.awt.Color.RED);
            
            // draw 4 color balls at each location of the large circle ring
            drawColorBall(50, 0, 15, java.awt.Color.RED);
            drawColorBall(0, -50, 15, java.awt.Color.RED);
            drawColorBall(-50, 0, 15, java.awt.Color.GREEN);
            drawColorBall(0, 50, 15, java.awt.Color.RED);
            
            // draw 4 color balls at each location of the large circle ring
            drawColorBall(0, -50, 15, java.awt.Color.RED);
            drawColorBall(-50, 0, 15, java.awt.Color.RED);
            drawColorBall(0, 50, 15, java.awt.Color.GREEN);
            drawColorBall(50, 0, 15, java.awt.Color.RED);
            
            // draw 4 color balls at each location of the large circle ring
            drawColorBall(-50, 0, 15, java.awt.Color.RED);
            drawColorBall(0, 50, 15, java.awt.Color.RED);
            drawColorBall(50, 0, 15, java.awt.Color.GREEN);
            drawColorBall(0, -50, 15, java.awt.Color.RED);
            
        }
        
    }
    
    // x,y is the location of the color ball
    // r is the radius of the color ball
    // c is the color of the color ball
    private void drawColorBall(int x, int y, int r, java.awt.Color c) {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.down();
        myPencil.setColor(c);
        myPencil.fillCircle(r);
    }
}
