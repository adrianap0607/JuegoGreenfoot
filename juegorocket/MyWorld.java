import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,83,199);
        Objeto objeto = new Objeto();
        addObject(objeto,431,111);
        Objeto objeto2 = new Objeto();
        addObject(objeto2,554,151);
        Objeto objeto3 = new Objeto();
        addObject(objeto3,422,225);
        Objeto objeto4 = new Objeto();
        addObject(objeto4,461,291);
        Objeto objeto5 = new Objeto();
        addObject(objeto5,519,363);
        Objeto objeto6 = new Objeto();
        addObject(objeto6,354,325);
        Objeto objeto7 = new Objeto();
        addObject(objeto7,492,65);
        Objeto objeto8 = new Objeto();
        addObject(objeto8,540,234);
    }
}
