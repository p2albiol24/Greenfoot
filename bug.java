import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 100;
    //default constructor (no parameters)
    public bug(){
        GreenfootImage gfi = new GreenfootImage("bug.png");
        gfi.scale(65, 65);
        this.setImage(gfi);
        
    }
    public void act(){
        
        mover("w", -90);
        mover("a", 180);
        mover("s", 90);
        mover("d", 0);
        
        if ( this.getX() > 890){
            this.setLocation(1, this.getY());
        }
        else if ( this.getX() < 10){
            this.setLocation(899, this.getY());
        }
        else if ( this.getY() > 695 ){
            this.setLocation(this.getX(), 1);
        }
        else if ( this.getY() < 10){
            this.setLocation(this.getX(), 698);
        }
        
        if ( this.isTouching(Mushroom.class) ){
            this.removeTouching(Mushroom.class);
            this.score = this.score + 80;
        }

        score --;
        var scoreDisp = "Score: " + score;
        if ( score < 1){
            this.getWorld().showText("You Fail!", 450, 20);
            Greenfoot.delay(999999999);
        }
        if ( score > 999){
            this.getWorld().showText("You Win!", 450, 20);
            Greenfoot.delay(999999999);
        }
        this.getWorld().showText(scoreDisp, 450, 20);
    }
    public void mover(String key, int angle){
       /* if (Greenfoot.isKeyDown("w") & Greenfoot.isKeyDown("a")){
            this.setRotation(-135);
        }
       else if (Greenfoot.isKeyDown("w") & Greenfoot.isKeyDown("d")){
            this.setRotation(-45);
        }
       else if (Greenfoot.isKeyDown("s") & Greenfoot.isKeyDown("a")){
            this.setRotation(-225);
        }
       else if (Greenfoot.isKeyDown("s") & Greenfoot.isKeyDown("d")){
            this.setRotation(45);
        }
       else  */
       if ( Greenfoot.isKeyDown(key)){
            this.setRotation(angle);
            
        }
        this.move(3);
    }// Add your action code here.

}

