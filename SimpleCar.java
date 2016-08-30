
/**
 * Write a description of class SimpleCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import gpdraw.*;

public class SimpleCar
{
    // instance variables - replace the example below with your own
    private DrawingTool myPencil;                          //Create an object of the DrawingTool class named myPencil
    private SketchPad paper;
    
    public void draw()
    {
        paper = new SketchPad(800, 800, 10);  //Setting the dimensions 800x800 and the draw delay time as 10ms
        myPencil = new DrawingTool(paper);   //Will draw on the paper object
        drawMovingCar();
    }
    
    private void drawMovingCar() {
        for(int i = 0; i<200; i++) {       // loop 100 times from 0 to 99
            
            drawCar(i*2 - 200, -200);   // draw the car at location (x,y)
            
            clearCar(i*2 - 200, -200);  // clear the car at location (x,y)
            
        }
        
        drawCar(200, -200);   // draw a car at the fixed location (0, -200)
    }
    
    
    private void drawCar(int x, int y) {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.down();
        myPencil.setColor(java.awt.Color.RED);
        myPencil.fillRect(80,20);
        
        myPencil.up();
        myPencil.move(x-20, y-10);
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLUE);
        myPencil.fillCircle(10);
        
        myPencil.up();
        myPencil.move(x+20, y-10);
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLUE);
        myPencil.fillCircle(10);
        
        
    }
    
    private void clearCar(int x, int y) {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.down();
        myPencil.setColor(java.awt.Color.WHITE);
        myPencil.fillRect(80,40);
    }
}
