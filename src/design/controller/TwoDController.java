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

	}
	
	public void start()
	{

	}

	private void setupArray()
	{
		for(int row = 0; row < myBasketBall.length; row++)
		{
			for(int col = 0; col < myBasketBall[0].length; col++)
			{
				myBasketBall[row][col] = new BasketBall();
				if(col % 2 == 0)
				{
					myBasketBall[row][col].setNumberOfLines(col + 5);
				}
				else
				{
					myBasketBall[row][col].setBasketBallColor(Color.ORANGE);
				}
			}
		}
	}
}