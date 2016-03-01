package design.view;

import java.awt.Color;

import design.controller.TwoDController;

import javax.swing.*;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentBasketBall;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable BasketBallTable;
	
public TwoDPanel(TwoDController baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	rowField = new JTextField(5);
	columnField = new JTextField(5);
	editField = new JTextField(20);
	currentBasketBall = new JLabel("the current object");
	changeButton = new JButton("Change the indicatte object");
	displayButton = new JButton("Display the indicated basketball");
	
	setupTable();
	setupPanel();
	setupLayout();
	setupListeners();
}
private void setupTable()
{
	
}

private void setupPanel()
{
	this.setLayout(baseLayout);
	this.add(BasketBallTable);
	this.add(currentBasketBall);
	this.add(columnField);
	this.add(rowField);
	this.add(editField);
	this.add(changeButton);
	this.add(displayButton);
	this.setBackground(Color.MAGENTA);
}
private void setupLayout()
{
	
}
private void setupListeners()
{
	
}
	
}
