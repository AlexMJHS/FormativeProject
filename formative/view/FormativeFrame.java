package formative.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import formative.controller.FormativeController;

public class FormativeFrame extends JFrame
{
	private FormativeController baseController;
	private FormativePanel basePanel;
	
	public FormativeFrame(FormativeController baseController)
	{
		this.baseController = baseController;
		basePanel = new FormativePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setTitle("Formative Project");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public FormativeController getBaseController()
	{
		return baseController;
	}
}
