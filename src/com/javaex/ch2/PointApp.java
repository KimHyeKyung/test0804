package com.javaex.ch2;

public class PointApp {

	public static void main(String[] args) {
		
		Point point1 = new Point(5,5);
		Point point2 = new Point(10,23);
		
		point1.draw();
		point2.draw();

		point1.draw(true);
		point2.draw(true);
		
		point1.draw(false);
		point2.draw(false);
	}

}
