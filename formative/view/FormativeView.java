package formative.view;

import javax.swing.JOptionPane;

public class FormativeView
{
	private String windowMessage;
	
	public ChatView()
	{
		windowMessage = "Hello";
	}
	
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null,  wordsFromSomewhere, windowMessage, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String grabAnswer(String popupText)
	{
		String answer = "";
		answer = JOption.showInputDialog(null, popupText, windowMessage, JOption.PLAIN_MESSAGE, null, "Answer here").toString();
		return answer;
	}
}
