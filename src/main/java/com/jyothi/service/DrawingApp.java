package com.jyothi.service;

import java.util.Scanner;;

public class DrawingApp {

	private CommandHandler handler = new CommandHandler();

	public static void main(String[] args) throws Exception{
		DrawingApp app = new DrawingApp();
		app.recursiveScanner("");	
	}

	private void recursiveScanner(String line) throws Exception{

		handler.execute(line);

		System.out.print("Enter the code:");
		try(Scanner s = new Scanner(System.in).useDelimiter("\\s")){
			String input = s.nextLine();		
			recursiveScanner(input);
		}
	}
}
