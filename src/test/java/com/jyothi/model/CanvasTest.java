package com.jyothi.model;

import org.junit.Assert;
import org.junit.Test;

import com.jyothi.model.Canvas;

public class CanvasTest {

	@Test
	public void test1_canvas_should_be_created_when_correct_width_and_height_is_given() {
		Canvas canvas = new Canvas(20, 5);
		  Assert.assertEquals(canvas.draw(),
	                "----------------------\n" +
	                        "|                    |\n" +
	                        "|                    |\n" +
	                        "|                    |\n" +
	                        "|                    |\n" +
	                        "|                    |\n" +
	                        "----------------------");
	}

	@Test
	public void test2_canvas_should_be_created_when_correct_width_and_height_is_given() {
		Canvas canvas = new Canvas(10, 5);
		System.out.println(canvas.draw());
		  Assert.assertEquals(canvas.draw(),
	                "------------\n" + 
	                "|          |\n" + 
	                "|          |\n" + 
	                "|          |\n" + 
	                "|          |\n" + 
	                "|          |\n" + 
	                "------------");
	}
}
