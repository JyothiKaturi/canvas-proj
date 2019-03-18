package com.jyothi.model;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Canvas{
	
	private int width;
	private int height;
	private char[][] panel;
	private String canvasTopFrameString;
		
	public Canvas(int width, int height) {
		this.width = width;
		this.height = height;
		this.panel = new char[height][width];
		
		Arrays.stream(panel).forEach(chars -> Arrays.fill(chars, ' '));
		canvasTopFrameString=  Stream.generate(() -> Constants.HORIZONTAL_LINE).limit(width + 2).collect(Collectors.joining());
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public char[][] getPanel() {
		return panel;
	}
	
	public void addShape(ShapeType shapeType, Point p1, Point p2) {
		try {
			IShape shape = new ShapeFactory().Create(shapeType);
			shape.draw(this, p1, p2);
		}catch (Exception ex){
			System.out.println("cannot add shape");
		}
		
	}

	public String draw() {
		StringBuilder builder = new StringBuilder();
		builder.append(canvasTopFrameString).append("\n");
		for (int i = 0; i < height; i++) {
			builder.append(Constants.VERTICLE_LINE);
			  for (int j = 0; j < width; j++) {
				  builder.append(panel[i][j]);
			  }
			  builder.append(Constants.VERTICLE_LINE);
			  builder.append("\n");
			}
		builder.append(canvasTopFrameString);
		return builder.toString();
	}
}
