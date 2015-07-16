package edu.csc150;


import java.util.ArrayList;

import greenfoot.GreenfootImage;
import greenfoot.World;

public class Main extends World {
	public Main(){
		super(750,750,1);
		GreenfootImage canvas = this.getBackground();
		Point point = new Point(100,100);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(point,100)) ;
		shapes.add(new Circle(shapes.get(0)));
		shapes.add(new Triangle(shapes.get(1)));
		for (Shape s : shapes){
			s.draw(canvas);
			System.out.println(s.getTopLeft());
		}
		
	}

}
