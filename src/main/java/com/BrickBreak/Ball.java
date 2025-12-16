
//Daisuke Watanabe
// Description: This creates the ball of "Brick Breaker" and its functions

package com.BrickBreak;
import java.awt.*;
import java.awt.Color;

public class Ball {
	//your code here!
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;

	//don't forget you need instance variables:
	//constructor(s):
	public Ball (int x, int y, int size){	
		this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }
	//methods:
    public void draw(Graphics g){
        g.setColor(Color.CYAN);
        g.fillOval(x, y size, size);
    }
    public int getXpos(){
        return x;
    }
    public int getYpos(){
        return y;
    }
    // public void reverseX(){

    // }
	// public void reverseY(){

    // }
    public void setXVelocity(int newVelocity){
        xVelocity = newVelocity;
    }
    public void setYVelocity(int newVelocity){
        yVelocity = newVelocity;
    }
    public int getSize(){
        return size;
    }
}
