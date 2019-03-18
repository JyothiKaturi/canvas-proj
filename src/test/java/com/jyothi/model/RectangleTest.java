package com.jyothi.model;

import org.junit.Assert;
import org.junit.Test;

import com.jyothi.model.Canvas;
import com.jyothi.model.Line;
import com.jyothi.model.Point;
import com.jyothi.model.ShapeType;

public class RectangleTest {

	@Test
	public void right_rectangle_test() {
		Canvas canvas = new Canvas(20, 5);
		canvas.addShape(ShapeType.Rectangle, new Point(15, 2), new Point(20, 5));
		 Assert.assertEquals(canvas.draw(),
				    "----------------------\n" + 
				    "|                    |\n" + 
				    "|              xxxxxx|\n" + 
				    "|              x    x|\n" + 
				    "|              x    x|\n" + 
				    "|              xxxxxx|\n" + 
				    "----------------------");
		
	}
	@Test
	public void left_rectangle_test() {
		Canvas canvas = new Canvas(20, 5);
		canvas.addShape(ShapeType.Rectangle, new Point(7, 1), new Point(10, 3));
	   Assert.assertEquals(canvas.draw(),
				    "----------------------\n" + 
				    "|      xxxx          |\n" + 
				    "|      x  x          |\n" + 
				    "|      xxxx          |\n" + 
				    "|                    |\n" + 
				    "|                    |\n" + 
				    "----------------------");
		
	}
}
