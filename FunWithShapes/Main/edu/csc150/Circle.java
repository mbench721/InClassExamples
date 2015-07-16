package edu.csc150;

import java.awt.Color;

import greenfoot.GreenfootImage;

public class Circle extends Shape {
	
	
	public Circle(Point center, int length){
		super(center, length);
		
	}
	public Color getColor() {
		return color;
	}
	public Circle(Shape inner){
		super(inner.getCenter(),(int)( 2 * Math.sqrt(2*(inner.getLength() / 2) * (inner.getLength() / 2) )));
	}

	@Override
	public void draw(GreenfootImage canvas){
		Point topLeft = getTopLeft();
		canvas.setColor(color);
		canvas.drawOval(topLeft.getX(), topLeft.getY(), length, length);
	}
	
}
