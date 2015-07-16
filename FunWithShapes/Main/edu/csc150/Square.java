package edu.csc150;

import java.awt.Color;

import greenfoot.GreenfootImage;

public class Square extends Shape {
	
	
	public Square(Point center, int length){
		super(center, length);
		
	}
	public Color getColor() {
		return color;
	}
public Square(Shape inner){
	super(inner.getCenter(),inner.getLength());
}
	@Override
	public void draw(GreenfootImage canvas){
		Point topLeft = getTopLeft();
		canvas.setColor(color);
		canvas.drawRect(topLeft.getX(), topLeft.getY(), length, length);
	}
	
}
