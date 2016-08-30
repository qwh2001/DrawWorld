
/**
 * Write a description of class DrawClock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import gpdraw.*;

public class SimpleClock
{
    // instance variables - replace the example below with your own
    private DrawingTool myPencil;                          //Create an object of the DrawingTool class named myPencil
    private SketchPad paper;                             //Create an object of the SketchPad class named paper
    
    private int width = 500;        // width of draw area
    private int armLength = 200;
    
    private int hour_count = 12;    // 12 hours
    private int second_count = 60;  // 60s per minute
        
    public void draw()
    {
        paper = new SketchPad(800, 800, 1000);  //Setting the dimensions 1000x1000 and the draw delay time as 10ms
        myPencil = new DrawingTool(paper);   //Will draw on the paper object
        
        drawFrame();   // draw clock frame with center at (0,0)
        drawHours();
        
        while(true) {
            drawArm();     // draw a moving arm
        }
    }
    
    private void drawArm() {
        int angle = 360 / second_count;
        
        for(int i = 0; i < second_count; i++) {
            drawOneArm(90 - angle * (i - 1), java.awt.Color.WHITE); // clear the previous arm
            drawOneArm(90 - angle * i, java.awt.Color.BLUE);    // draw current arm
        }
    }
    
    
    private void drawOneArm(int degree, java.awt.Color c) {
        myPencil.up();
        myPencil.home();
        myPencil.down();
        myPencil.setColor(c);
        myPencil.setDirection(degree);
        myPencil.forward(armLength);
    }
    
    private void drawFrame() {
        myPencil.setColor(java.awt.Color.BLACK);
        myPencil.setWidth(2);
        myPencil.drawCircle(width/2);        
        myPencil.setWidth(1);
    }
    
    private void drawHours() {
        int angle = 360 / hour_count;
        
        for(Integer i = 0; i < hour_count; i++) {
            myPencil.up();
            myPencil.home();
            myPencil.setDirection(90 - angle * i);
            myPencil.forward(armLength + 10);
            myPencil.down();
            myPencil.setColor(java.awt.Color.RED);
            if(i != 0) {
                myPencil.drawString(i.toString());
            } else {
                myPencil.drawString("12");
            }
            myPencil.up();
            myPencil.forward(20);
            myPencil.down();
            myPencil.forward(20);
        }
    }
}
