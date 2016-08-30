
/**
 * Write a description of class DrawFormula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import gpdraw.*;

public class Formulas
{
    // instance variables - replace the example below with your own
    private DrawingTool myPencil;                          //Create an object of the DrawingTool class named myPencil
    private SketchPad paper;                             //Create an object of the SketchPad class named paper
    
    private int width = 800;        // width of draw area
    private int height = 800;       // height of darw area
        
    public void draw()
    {
        paper = new SketchPad(1000, 1000, 10);  //Setting the dimensions 1000x1000 and the draw delay time as 10ms
        myPencil = new DrawingTool(paper);   //Will draw on the paper object
        
        drawAxis();         // draw X axis and Y axis with center at (0,0)
        
        drawFormula1();     // draw a linear formula
        drawFormula2();     // draw a x power of 2 formula
        drawFormula3();     // draw a x power of 3 formula
        drawFormulaSin();   // draw a sin() formula
    }
    
    private void drawFormula1() {
        int value = 0;
        
        for(int i = -width/2; i <= width/2; i++) {  // from -400 to 400
            
            value = calculateFormula1(i);   // calculate y
            
            System.out.println("Formula1 (x,y) is (" + i + "," + value + ")");
            
            if(value >= -height/2 && value <= height/2) {
                
                drawPoint(i, value);
                
            }
        }
    }
    
    private void drawFormula2() {
        int value = 0;
        
        for(int i = -width/2; i <= width/2; i++) {  // from -400 to 400
            
            value = calculateFormula2(i);   // calculate y
            
            System.out.println("Formula2 (x,y) is (" + i + "," + value + ")");
            
            if(value >= -height/2 && value <= height/2) {
                
                drawPoint(i, value);
                
            }
        }
    }
    
    private void drawFormula3() {
        int value = 0;
        
        for(int i = -width/2; i <= width/2; i++) {  // from -400 to 400
            
            value = calculateFormula3(i);   // calculate y
            
            System.out.println("Formula3 (x,y) is (" + i + "," + value + ")");
            
            if(value >= -height/2 && value <= height/2) {
                
                drawPoint(i, value);
                
            }
        }
    }
    
    private void drawFormulaSin() {
        int value = 0;
        
        for(int i = -width/2; i <= width/2; i++) {  // from -400 to 400
            
            value = calculateFormula4(i);   // i is degree, calculate y
            
            System.out.println("Formula4 (x,y) is (" + i + "," + value + ")");
            
            if(value >= -height/2 && value <= height/2) {
                
                drawPoint(i, value);
                
            }
        }
    }
    
    private int calculateFormula1(int x) {
        int y = 2*x - 11;
        return y;
    }
    
    private int calculateFormula2(int x) {
        int y = x*x -3*x - 21;
        return y/100;
    }
    
    private int calculateFormula3(int x) {
        int y = x*x*x -3*x*x + 8*x - 7;
        return y/10000;
    }

    private int calculateFormula4(int x) {
        double r = java.lang.Math.toRadians(x);     // convert degree to radians
        double y = java.lang.Math.sin(r) * 200;     // sin(r) and give its height 200
        return (int)y;  // cast the double data type to int data type
    }
    
    private void drawPoint(int x, int y) {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLUE);
        myPencil.drawCircle(1);
    }
    
    private void drawAxis() {
        // draw X axis
        myPencil.up();
        myPencil.move(-width/2, 0);
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLACK);
        myPencil.move(width/2, 0);
        
        myPencil.setDirection(150);
        myPencil.forward(10);
        
        myPencil.up();
        myPencil.move(width/2, 0);
        myPencil.down();
        
        myPencil.setDirection(-150);
        myPencil.forward(10);
        
        // draw Y axis
        myPencil.up();
        myPencil.move(0, -height/2);
        myPencil.down();
        myPencil.setColor(java.awt.Color.BLACK);
        myPencil.move(0, height/2);
        
        myPencil.setDirection(-120);
        myPencil.forward(10);
        
        myPencil.up();
        myPencil.move(0, height/2);
        myPencil.down();
        
        myPencil.setDirection(-60);
        myPencil.forward(10);
        
    }
    
}
