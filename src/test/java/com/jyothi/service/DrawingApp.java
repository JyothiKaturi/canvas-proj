package com.jyothi.service;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;;

public class DrawingApp {

	private CommandHandler handler = new CommandHandler();
	private String result;
	
	@Given("^Enter command to draw convas \"([^\"]*)\"$")
	public void enter_command_to_draw_convas(String command) throws Throwable {
		result = handler.execute(command);
		System.out.println(result);
	}
	@Then("^Expect the canvas drawing$")
	public void expect_the_canvas_drawing(String arg1) throws Throwable {
	 	System.out.println(arg1);
     	System.out.println("*** length =  "+arg1.length());
    	System.out.println("*** length  result=  "+result.length());
	//System.out.println(arg1.trim().length()==result.trim().length());
 	System.out.println(result.length());

		//Assert.assertEquals(result,arg1);
		Assert.assertTrue(result.equalsIgnoreCase(arg1));
	}
	
	@Then("^Exit the command \"([^\"]*)\"$")
	public void exit_the_command(String exit) throws Throwable {
		handler.execute(exit);
	}
	

}
