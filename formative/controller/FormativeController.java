package formative.controller;


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
		baseFrame = new FormativeFrame(this);
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello " + myBot.getUserName());
		chat();
	}
	
	public String major(String schoolMajor)
	{
		myDisplay
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
