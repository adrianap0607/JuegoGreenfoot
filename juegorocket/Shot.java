import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        World w = getWorld();
        move(-5);
        if (isAtEdge())
        {
            w.removeObject(this);
        }
        else
        if(isTouching(Objeto.class))
            removeTouching(Objeto.class);
    }
}
