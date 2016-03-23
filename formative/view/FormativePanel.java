package formative.view;

import javax.swing.*;

import formative.controller.FormativeController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import formative.controller.FormativeController;

public class FormativePanel extends JPanel
{
	private FormativeController baseController;
	private SpringLayout baseLayout;
	private SpringLayout baseLayout_1;
	private JButton firstButton;
	private JTextField firstTextField;
	private JTextField firstTextField_1;
	private JTextArea firstTextArea;
	private JLabel promptLabel;
	private JScrollPane textPane;
	
	public FormativePanel(FormativeController baseController)
	{
		baseLayout = new SpringLayout();
		firstTextArea = new JTextArea(10,25);
		firstTextField = new JTextField(25);
		
		this.baseController = baseController;
		baseLayout_1 = new SpringLayout();
		firstTextArea = new JTextArea(10,30);
		firstTextField_1 = new JTextField(30);
		promptLabel = new JLabel("Chat with me");
		firstButton = new JButton("Submit");
		
		setupFormativePane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupFormativePane()
	{
		textPane = new JScrollPane(firstTextArea);
		firstTextArea.setLineWrap(true);
		firstTextArea.setWrapStyleWord(true);
		firstTextArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout_1);
		this.add(loadButton);
		this.add(textPane);
		//DO NOT HAVE the line this.add(chatArea);
		this.add(firstTextField_1);
//		this.setLayout(baseLayout);
//		this.add(firstTextArea);
//		this.add(firstTextField);
//		this.add(promptLabel);
		firstTextField.setToolTipText("Enter your major here");
//		firstTextArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = firstTextField.getText();  //Grab user typed answer
				firstTextArea.append("/nUser: " + userText); //display typed answer
				firstTextField.setText("");
				String response = baseController.userToFormativebot(userText); //send the text to chatbot, chatbot will process
				firstTextArea.append("/nChatbot: " + response); //display the response
			}
		});
	}
	
	public JTextField getTextField()
	{
		return firstTextField;
	}
}
