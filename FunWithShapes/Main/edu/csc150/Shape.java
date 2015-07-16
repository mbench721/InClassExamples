package edu.csc150;

import java.awt.Color;

import greenfoot.GreenfootImage;

public abstract class Shape {
	protected Point center;
	protected int length;
	protected Color color = Color.BLACK;
	
	public Shape(Point center, int length){
		this.center = center;
		this.length = length;
		
	}
	public Color getColor() {
		return color;
	}


	public Point getCenter() {
		return center;
	}

	public int getLength() {
		return length;
	}
	public abstract void draw(GreenfootImage canvas);
		
	public Point getTopLeft(){
		
		return new Point(getLeftSide(),getTop());
	}
public Point getTopRight(){
		
		return new Point(getRightSide(),getTop());
	}
	public Point getBotLeft(){
		
		
		return new Point(getLeftSide(),getTop());
	}
public Point getBotRight(){
		
		
		return new Point(getRightSide(),getBottom());
}
	public int getLeftSide(){
		return center.getX()  - length / 2;
	}
	public int getRightSide(){
		return center.getX() + length / 2;
	}
	public int getTop(){
		return center.getY() - length / 2;
	}
	public int getBottom(){
		return center.getY() + length / 2;
	}

}
