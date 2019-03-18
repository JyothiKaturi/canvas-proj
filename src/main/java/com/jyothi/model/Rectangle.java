package com.jyothi.model;

public class Rectangle implements IShape {

	@Override
	public void draw(Canvas canvas, Point p1, Point p2) {
		
		 for(int i=p1.getY()-1; i<=p2.getY()-1; i++ ) {
			 canvas.getPanel()[i][p1.getX()-1] = Constants.LINE_CHAR;
			 canvas.getPanel()[i][p2.getX()-1] = Constants.LINE_CHAR;
		 }
		 for(int j=p1.getX()-1; j<=p2.getX()-1; j++ ) {
			 canvas.getPanel()[p1.getY()-1][j] = Constants.LINE_CHAR;
			 canvas.getPanel()[p2.getY()-1][j] = Constants.LINE_CHAR;
		 }
	}

}
