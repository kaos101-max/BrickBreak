//Daisuke Watanabe
// Description: This creates the paddle of 'Brick Breaker' and its functions
//
package com.BrickBreak;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle{


    //your code here!
    private int x;
    private int y;
    private int height;
    private int width;
    private int speed;
    private Color color;

    
    //don't forget you need instance variables:
    
    
    //constructor(s):
    public Paddle (int x, int y, int width, int speed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = 15;
        this.speed = speed;
        this.color = color;
    }
    //methods:

    //precon: The paddle will gets its own color or not
    //postcon: The paddle is colored to 'white'
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getVelocity(){
        return speed;
    }
    //precon: The paddle moves in the x position
    //postcon: It moves horizonatally.
    public void move() {
        x += speed;
    }
    //precon: The speed has to set to move
    //postcon: It moves at the speed to paddle the ball.
    public void addVelocity(int num) {
        speed += num;
    }
    public void setVelocity(int speed) {
        this.speed = speed;
    }
}