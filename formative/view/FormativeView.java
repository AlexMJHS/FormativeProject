package formative.view;

import javax.swing.JOptionPane;

public class FormativeView
{
	private String windowMessage;
	
	public FormativeView()
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
		answer = JOptionPane.showInputDialog(null, popupText, windowMessage, JOptionPane.PLAIN_MESSAGE, null, "Answer here").toString();
		return answer;
	}
}
