package edu.csc150;

import java.awt.Color;

import greenfoot.GreenfootImage;

public class Triangle extends Shape {
	
	private int  height;
	public Triangle(Point center, int length){
		super(center, length);
		 height = (int)Math.round(Math.tan(Math.PI / 3) * length / 2);
	}
	public Color getColor() {
		return color;
	}
	public Triangle(Shape inner){
		this(inner.getCenter(),inner.getLength());
	}

	@Override
	public void draw(GreenfootImage canvas){
		
		canvas.setColor(color);
		
		canvas.drawLine(getLeftSide(), getBottom(), getRightSide(),getBottom());
		canvas.drawLine(getLeftSide(), getBottom(), center.getX(), getTop());
		canvas.drawLine(center.getX(), getTop(), getRightSide(), getBottom());
		
	}
	@Override
	public int getTop(){
		return center.getX() - height / 2;
	}
	@Override
	public int getBottom(){
		return center.getY() + height / 2;
	}
	
}
