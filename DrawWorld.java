
/**
 * Write a description of class HelloWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DrawWorld
{
        
    public static void main(String[] args)
    {
        SimpleCar myCar = new SimpleCar();
        myCar.draw();
        
        SimpleWindmill myWindmill = new SimpleWindmill();
        myWindmill.draw();
        
        Formulas myFormulas = new Formulas();
        myFormulas.draw();
        
        SimpleClock myClock = new SimpleClock();
        myClock.draw();
    }
    
}
