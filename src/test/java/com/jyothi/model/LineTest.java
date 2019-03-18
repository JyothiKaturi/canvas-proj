package com.jyothi.model;

import org.junit.Assert;
import org.junit.Test;

import com.jyothi.model.Canvas;
import com.jyothi.model.Point;
import com.jyothi.model.ShapeType;

public class LineTest {

	@Test
	public void horizontal_lineTest() {
		Canvas canvas = new Canvas(20, 5);
		canvas.addShape(ShapeType.Line, new Point(1, 3), new Point(7, 3));
		 Assert.assertEquals(canvas.draw(),
				    "----------------------\n" + 
				    "|                    |\n" + 
				    "|                    |\n" + 
				    "|xxxxxxx             |\n" + 
				    "|                    |\n" + 
				    "|                    |\n" + 
				    "----------------------");
		
	}
	@Test
	public void verticle_lineTest() {
		Canvas canvas = new Canvas(20, 5);
		canvas.addShape(ShapeType.Line, new Point(7, 1), new Point(7, 3));
	   Assert.assertEquals(canvas.draw(),
				    "----------------------\n" + 
				    "|      x             |\n" + 
				    "|      x             |\n" + 
				    "|      x             |\n" + 
				    "|                    |\n" + 
				    "|                    |\n" + 
				    "----------------------");
		
	}
}
