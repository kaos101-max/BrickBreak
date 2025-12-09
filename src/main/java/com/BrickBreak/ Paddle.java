package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	//constructor(s):
	public Brick (int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	public void draw(Graphic g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
	
}
