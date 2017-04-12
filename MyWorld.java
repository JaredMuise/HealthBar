import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (Jared Muise)
 * Teacher Mr.Hardman
 * Lab #3 HealthBar
 * Date Last Modified: April 12/2017)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        Button button = new Button();
        addObject(button, 126, 246);
        Button button2 = new Button();
        addObject(button2,462, 234);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,320, 104);
        
        Button button1 = new Button( Color.RED, Color.ORANGE, -40);
        addObject(button1, 463, 246);
        removeObject(button2);
    }
    
    
}
