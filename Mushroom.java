import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    public int counter = 0;
    public int lifespan;
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.turn(10);
        this.lifespan = 1 + Greenfoot.getRandomNumber(9);
        this.counter ++;
        if ( this.counter > 20 & this.lifespan == 5) {
            this.getWorld().removeObject(this);
        }
        //if (getOneIntersectingObject(Mushroom) == bug){
            
        //}
    }
    public Mushroom(){
        this.setImage("mushroom.png");

    }
}
