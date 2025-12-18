//Daisuke Watanabe
// Description: This creates the ball of 'Brick Breaker' and its functions
//
package com.BrickBreak;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
//your code here!
    private int x;
    private int y;
    private int changeX;
    private int changeY;
    private int size;
    private Color color;
//don't forget you need instance variables:
    public Ball (int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        this.changeX = 1;
        this.changeY = 1;
    }


//constructor(s):

//methods:

    //precon: the ball most move or it stays in one place.
    //postcon the ball moves anywhere on the screen
    public void move(){
        x += changeX;
        y += changeY;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    //precon: The ball is need of color and size.
    //postcon: The ball is drawn how its supposed to be in the game
    public void draw(Graphics g){
        g.setColor(Color.CYAN);
        g.fillOval(x, y, size, size);
    }
    public int getXpos(){
        return x;
    }
    public int getYpos(){
        return y;
    }
    public int getSize(){
        return size;
    }
    public double getChangeX(){
        return changeX;
    }
    public double getChangeY(){
        return changeY;
    }
    public void setXVelocity(int changeX) {
        this.changeX = changeX;
    }
    public void setYVelocity(int changeY) {
        this.changeY = changeY;
    }
    //precon: The ball must not go into the edge of the screen
    //postcon: The ball bounces on blocks and walls
    public void reverseX() {
        changeX *= -1;
    }
    public void reverseY() {
        changeY *= -1;
    }
}
