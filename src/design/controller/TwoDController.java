package design.controller;
 
import design.model.*;
import design.view.TwoDFrame;
import java.awt.Color;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private BasketBall [][] myBasketBall;
	
	public TwoDController()
	{
		myBasketBall = new BasketBall[3][3];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{

	}

	private void setupArray()
	{

	}
}