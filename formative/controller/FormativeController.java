package formative.controller;

import formative.view.FormativeView;
import formative.model.Formativebot;
import formative.view.FormativeFrame;

/**
 * 
 * @author Alejandro Magallanes
 *@version 0.1 3/23/16
 */
public class FormativeController
{
	private FormativeView myDisplay;
	private Formativebot myBot;
	private FormativeFrame baseFrame;
	
	public FormativeController()
	{
		myDisplay = new FormativeView();
		String userName = myDisplay.grabAnswer("What is your name?");
		String schoolMajor = myDisplay.grabAnswer("What is your school major?");
		String schoolYear = myDisplay.grabAnswer("What is your current school year?");
		baseFrame = new FormativeFrame(this);
		myBot = new Formativebot(userName);
		myBot = new Formativebot(schoolMajor);
		myBot = new Formativebot(schoolYear);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + myBot.getUserName() +", your current Major is " + myBot.getSchoolMajor() + " and your a " + myBot.getSchoolYear());
		chat();
	}
	
	private void shutDown()
	{
		myDisplay.showResponse("Goodbye " + myBot.getUserName());
		System.exit(0);
	}
	
	public Chatbot getChatbot()
	{
		return myBot;
	}
	
	public ChatView getChatView()
	{
		return myDisplay;
	}
	
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	
}
