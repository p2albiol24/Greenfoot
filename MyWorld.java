import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int erx = 0;
    public int ery = 0;
    public int steps;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public bug bg = new bug();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
 
        addObject(bg, 450, 350);

        Mushroom ms = new Mushroom();
        addObject(ms, Greenfoot.getRandomNumber(901), Greenfoot.getRandomNumber(701));
        Mushroom ms2 = new Mushroom();
        addObject(ms2, Greenfoot.getRandomNumber(901), Greenfoot.getRandomNumber(701));
    }
    public void act(){
        steps ++;
        if (this.steps % 3 + Greenfoot.getRandomNumber(10) == 0){
            Mushroom ms = new Mushroom();
            addObject(ms, Greenfoot.getRandomNumber(901), Greenfoot.getRandomNumber(701));
        }
        if (this.steps % 3 + Greenfoot.getRandomNumber(10) == 0){
            Mushroom ms2 = new Mushroom();
            addObject(ms2, Greenfoot.getRandomNumber(901), Greenfoot.getRandomNumber(701));
        }
        if (this.steps % 3 + Greenfoot.getRandomNumber(10) == 0){
            Mushroom ms3 = new Mushroom();
            addObject(ms3, Greenfoot.getRandomNumber(901), Greenfoot.getRandomNumber(701));
        }
    }
}
