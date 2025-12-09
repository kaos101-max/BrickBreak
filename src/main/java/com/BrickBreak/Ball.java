
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

	//don't forget you need instance variables:
	//constructor(s):
	public Ball (int x, int y, int size){	
		this.x = x;
        this.y = y;
        this.size = size;
    }
	//methods:
    public void draw(Graphics g){
        g.setColor(Color.CYAN);
        g.fillOval(x, y size, size);)
    }
    public
	
}
