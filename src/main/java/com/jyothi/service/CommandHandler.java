package com.jyothi.service;

import com.jyothi.model.Canvas;
import com.jyothi.model.Point;
import com.jyothi.model.ShapeType;

public class CommandHandler {

	private Canvas canvas;

	public CommandHandler() {

	}
	
	public String execute(String commandLine) throws Exception {
		String command[] = commandLine.split("\\s");
		String option = command[0].toUpperCase();
		String returnString = null;
		
		switch (option) {
			case "C":
				if(command.length != 3) {
					System.out.println("Invalid command. Please enter valid Canvas command.");
					break;
				}
				canvas = new Canvas(getInt(command[1]), getInt(command[2]));
				returnString = canvas.draw();
				System.out.println(returnString);
				break;
			case "L":
				if(canvas == null || command.length != 5) {
					System.out.println("Please create canvas first and also check the line coardinates");
					break;
				}
				canvas.addShape(ShapeType.Line, new Point(getInt(command[1]), getInt(command[2])), new Point(getInt(command[3]), getInt(command[4])));
				returnString = canvas.draw();
				System.out.println(returnString);
				break;
			case "R":
				if(canvas == null || command.length != 5) {
					System.out.println("Please create canvas first and also check the rectangle coardinates");
					break;
				}				
				canvas.addShape(ShapeType.Rectangle, new Point(getInt(command[1]), getInt(command[2])), new Point(getInt(command[3]), getInt(command[4])));
				returnString = canvas.draw();
				System.out.println(returnString);
				break;
			case "Q":
				System.exit(0);
				break;
			}
			return returnString;
	}

	private int getInt(String st) {
		return Integer.parseInt(st);
	}
}
