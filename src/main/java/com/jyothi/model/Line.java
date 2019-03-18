package com.jyothi.model;

public class Line implements IShape {


	@Override
	public void draw(Canvas canvas, Point p1, Point p2) {
		
        for (int i = p1.getY() - 1; i <= p2.getY() - 1 && i < canvas.getHeight(); i++) {
            for (int j = p1.getX() - 1; j <= p2.getX() - 1 && j < canvas.getWidth(); j++) {
           	canvas.getPanel()[i][j] = Constants.LINE_CHAR;
            }
        }
	}

}
